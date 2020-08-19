package react4j.vchat;

import arez.ComputableValue;
import arez.ObservableValue;
import arez.SafeProcedure;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import elemental3.CloseEvent;
import elemental3.Event;
import elemental3.Global;
import elemental3.JSON;
import elemental3.Location;
import elemental3.MessageEvent;
import elemental3.WebSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@ArezComponent
abstract class RoomModel
{
  enum State
  {
    // Have not established a connection to the signalling server
    NOT_READY,
    // Connected to the signalling server as a guest but not yet attempted to join the chat
    CONNECTED,
    // Guest requested to join the the room, waiting for host acceptance or rejection
    JOIN_REQUESTED,
    // Host has rejected guests attempt to join the room
    JOIN_REJECTED,
    // Joined the room as either a host or after being accepted by the host
    JOINED,
    // Host has closed the room and the chat has been terminated
    CLOSED,
    // Left the room
    LEFT,
    // An error occurred and the connection was closed
    ERROR
  }

  // The role of the current user
  enum Role
  {
    UNKNOWN, HOST, GUEST
  }

  enum ConnectionState
  {
    CONNECTING, OPEN, CLOSING, CLOSED, NOT_REQUESTED
  }

  @Nonnull
  private final String _code;
  @Nonnull
  private final List<AccessRequest> _pendingAccessRequest = new ArrayList<>();
  @Nullable
  private WebSocket _webSocket;
  @Nonnull
  private final Set<String> _participants = new HashSet<>();

  @Nonnull
  static RoomModel create( @Nonnull final String code )
  {
    return new Arez_RoomModel( code, State.NOT_READY, Role.UNKNOWN, "" );
  }

  RoomModel( @Nonnull final String code )
  {
    _code = Objects.requireNonNull( code );
  }

  @Nonnull
  String getRoomCode()
  {
    return _code;
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  @Nonnull
  ConnectionState connectionState()
  {
    return null == _webSocket ? ConnectionState.NOT_REQUESTED : ConnectionState.values()[ _webSocket.readyState() ];
  }

  @ComputableValueRef
  abstract ComputableValue<?> getConnectionStateComputableValue();

  @Observable
  @Nonnull
  abstract State state();

  abstract void setState( @Nonnull State state );

  @Observable
  @Nonnull
  abstract Role role();

  abstract void setRole( @Nonnull Role role );

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nonnull
  abstract String requestAccessMessage();

  abstract void setRequestAccessMessage( @Nonnull String message );

  @Observable( expectSetter = false )
  @Nonnull
  List<AccessRequest> getPendingAccessRequests()
  {
    //TODO: Replace this with an observable list...
    return _pendingAccessRequest;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getPendingAccessRequestsObservableValue();

  @Observable( expectSetter = false )
  @Nonnull
  Set<String> getParticipants()
  {
    //TODO: Replace this with an observable list...
    return _participants;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getParticipantsObservableValue();

  @Action
  void open()
  {
    leave();
    _webSocket = new WebSocket( deriveRoomUrl() );
    getConnectionStateComputableValue().reportPossiblyChanged();
    setRole( Role.UNKNOWN );
    setState( State.NOT_READY );
    _webSocket.onopen = this::onOpen;
    _webSocket.onmessage = this::onMessage;
    _webSocket.onclose = this::onClose;
    _webSocket.onerror = this::onError;
  }

  @Action( verifyRequired = false )
  void leave()
  {
    leaveWithState( State.LEFT );
  }

  void leaveWithState( @Nonnull final State state )
  {
    if ( null != _webSocket )
    {
      _pendingAccessRequest.clear();
      //TODO: Send close? or do that on server
      _webSocket.close();
      _webSocket = null;
      setState( state );
    }
  }

  @Nonnull
  private String deriveRoomUrl()
  {
    final Location location = Global.globalThis().location();
    final String protocol = "https".equals( location.protocol ) ? "wss" : "ws";
    // For local development hardcode the port. In the future we should fix this
    final int port = 3737;
    return protocol + "://" + location.hostname + ":" + port + "/r/" + getRoomCode();
  }

  @Action( verifyRequired = false )
  void onError( @Nonnull final Event event )
  {
    Global.globalThis().console().log( "Websocket.error", event );
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      setState( State.ERROR );
      _webSocket = null;
    }
  }

  @Action( verifyRequired = false )
  void onOpen( @Nonnull final Event event )
  {
    Global.globalThis().console().log( "Websocket.open", event );
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action( verifyRequired = false )
  void onClose( @Nonnull final CloseEvent closeEvent )
  {
    Global.globalThis().console().log( "Websocket.close", closeEvent );
    if ( _webSocket == closeEvent.currentTarget() )
    {
      _webSocket = null;
      final State state = state();
      if ( State.LEFT != state && State.CLOSED != state && State.ERROR != state )
      {
        setState( State.CLOSED );
      }
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action( verifyRequired = false )
  void onMessage( @Nonnull final MessageEvent event )
  {
    final Any data = event.data();
    assert null != data;
    final Any object = JSON.parse( data.cast() );
    assert null != object;
    final JsPropertyMap<Object> message = object.cast();
    final Console console = Global.globalThis().console();
    console.log( "Websocket.message", message );

    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      final String command = message.getAsAny( "command" ).asString();
      if ( "create".equals( command ) )
      {
        console.log( "Connected to room as host" );
        setRole( Role.HOST );
        setState( State.JOINED );
      }
      else if ( "connect".equals( command ) )
      {
        console.log( "Connected to room as guest" );
        setRole( Role.GUEST );
        setState( State.CONNECTED );
      }
      else if ( "request_access".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        final String requestMessage = message.getAsAny( "message" ).asString();
        console.log( "Guest '" + id + "' requested access to room with message '" + requestMessage + "'" );
        _pendingAccessRequest.add( new AccessRequest( id, requestMessage ) );
        getPendingAccessRequestsObservableValue().reportChanged();
      }
      else if ( "accept".equals( command ) )
      {
        console.log( "Host allowed guest to join room." );
        setState( State.JOINED );
      }
      else if ( "reject".equals( command ) )
      {
        console.log( "Host rejected guest from room." );
        setState( State.JOIN_REJECTED );
      }
      else if ( "accepted".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        console.log( "Host accepted guest '" + id + "' into room." );
        _participants.add( id );
        getParticipantsObservableValue().reportChanged();
      }
    }
  }

  @Action( verifyRequired = false )
  void requestAccess()
  {
    if ( null != _webSocket )
    {
      final JsPropertyMap<Object> message =
        JsPropertyMap.of( "command", "request_access", "message", requestAccessMessage() );
      _webSocket.send( JSON.stringify( message ) );
      setState( State.JOIN_REQUESTED );
    }
  }

  @Action( verifyRequired = false )
  void acceptAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest, () -> {
      final String id = accessRequest.getId();
      final JsPropertyMap<Object> message =
        JsPropertyMap.of( "command", "approve_access", "id", id );
      assert null != _webSocket;
      _webSocket.send( JSON.stringify( message ) );
      _participants.add( id );
      getParticipantsObservableValue().reportChanged();
    } );
  }

  @Action( verifyRequired = false )
  void rejectAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest, () -> {
      final JsPropertyMap<Object> message =
        JsPropertyMap.of( "command", "reject_access", "id", accessRequest.getId() );
      assert null != _webSocket;
      _webSocket.send( JSON.stringify( message ) );
    } );
  }

  private void processAccessRequest( @Nonnull final AccessRequest accessRequest,
                                     @Nonnull final SafeProcedure action )
  {
    if ( null != _webSocket && _pendingAccessRequest.remove( accessRequest ) )
    {
      _pendingAccessRequest.removeIf( a -> a.getId().equals( accessRequest.getId() ) );
      getPendingAccessRequestsObservableValue().reportChanged();
      action.call();
    }
  }
}
