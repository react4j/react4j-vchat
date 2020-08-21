package react4j.vchat;

import arez.ComputableValue;
import arez.ObservableValue;
import arez.SafeProcedure;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.CascadeDispose;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import elemental3.CloseEvent;
import elemental3.Console;
import elemental3.ConstrainULongRange;
import elemental3.Event;
import elemental3.Global;
import elemental3.HTMLVideoElement;
import elemental3.JSON;
import elemental3.Location;
import elemental3.MediaStream;
import elemental3.MediaStreamConstraints;
import elemental3.MediaTrackConstraints;
import elemental3.MessageEvent;
import elemental3.RTCConfiguration;
import elemental3.RTCDataChannel;
import elemental3.RTCDataChannelEvent;
import elemental3.RTCIceCandidate;
import elemental3.RTCIceCandidateInit;
import elemental3.RTCIceServer;
import elemental3.RTCLocalSessionDescriptionInit;
import elemental3.RTCPeerConnection;
import elemental3.RTCPeerConnectionIceEvent;
import elemental3.RTCTrackEvent;
import elemental3.WebSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;
import jsinterop.base.Js;
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
    // The room already has a guest and a host so can accept no more participants
    FULL,
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
  // Both Host and Guest create their own connections
  @Nullable
  private RTCPeerConnection _connection;
  //TODO: If we don't have chat can we remove the data channel?
  @Nullable
  private RTCDataChannel _dataChannel;
  @Nonnull
  private final Set<String> _participants = new HashSet<>();
  @CascadeDispose
  final MediaStreamConnection _camStream =
    MediaStreamConnection.create( this::requestWebCam, false, true, true );
  @CascadeDispose
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, false, false, true );

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

  void setActiveVideoElement( @Nullable final HTMLVideoElement element )
  {
    _camStream.setVideoElement( element );
  }

  @Action
  void open()
  {
    leave();
    _camStream.setEnabled( true );
    _webSocket = new WebSocket( deriveRoomUrl() );
    getConnectionStateComputableValue().reportPossiblyChanged();
    setRole( Role.UNKNOWN );
    setState( State.NOT_READY );
    _webSocket.onopen = this::onOpen;
    _webSocket.onmessage = this::onMessage;
    _webSocket.onclose = this::onClose;
    _webSocket.onerror = this::onError;

    // Use one of Google's public STUN servers
    // The host should perform the offer rolw and the guest the answer role
    _connection = new RTCPeerConnection( RTCConfiguration
                                           .create()
                                           .iceServers( RTCIceServer.create( "stun:stun.l.google.com:19302" ) ) );

    _connection.onicecandidate = this::onIceCandidate;
    _connection.ontrack = this::onTrack;
    _connection.ondatachannel = this::onDataChannel;
    // TODO: attach local media to the peer connection
    //   _localStream.getTracks().forEach(track => this.pc.addTrack(track, this.localStream));
  }

  @Action( verifyRequired = false )
  void connectPeerConnection( @Nonnull final String participant )
  {
    assert Role.HOST == role();
    final Console console = Global.globalThis().console();
    console.log( "Attempting to send rtc session description" );
    assert null != _connection;
    _dataChannel = _connection.createDataChannel( "chat" );
    _dataChannel.onmessage = this::onDataChannelMessage;
    _dataChannel.onclose = this::onDataChannelClose;
    _connection.createOffer()
      .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit
                                                         .create()
                                                         .sdp( offer.sdp() )
                                                         .type( offer.type() ) ) )
      .then( e -> {
        sendMessage( JsPropertyMap.of( "command", "offer", "session", _connection.localDescription() ) );
        return null;
      } )
      .catch_( e -> {
        // TODO: An error occurred, so handle the failure to connect
        Global.globalThis().console().log( "Offer error: ", e );
        return null;
      } );
  }

  private void sendMessage( @Nonnull final JsPropertyMap<Object> message )
  {
    if ( null != _webSocket )
    {
      final Console console = Global.globalThis().console();
      console.log( "Sending message", JSON.parse( JSON.stringify( message ) ) );
      _webSocket.send( JSON.stringify( message ) );
    }
  }

  @Action( verifyRequired = false )
  void onDataChannel( @Nonnull final RTCDataChannelEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      assert Role.GUEST == role();
      final Console console = Global.globalThis().console();
      console.log( "onDataChannel", event );

      _dataChannel = event.channel();
      _dataChannel.onmessage = this::onDataChannelMessage;
      _dataChannel.onclose = this::onDataChannelClose;
    }
  }

  private void onDataChannelClose( @Nonnull final Event event )
  {
    if ( event.currentTarget() == _dataChannel )
    {
      final Console console = Global.globalThis().console();
      console.log( "The Data Channel is Closed" );
    }
  }

  private void onDataChannelMessage( @Nonnull final MessageEvent event )
  {
    if ( event.currentTarget() == _dataChannel )
    {
      final Console console = Global.globalThis().console();
      final Any data = event.data();
      assert null != data;
      final JsPropertyMap<Object> message = Js.asPropertyMap( JSON.parse( data.asString() ) );
      console.log( "onDataChannelMessage", message );
    }
  }

  private void onTrack( @Nonnull final RTCTrackEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      Global.globalThis().console().log( "onTrack", event );

      // when the other side added one or more media streams, show it on screen
      final JsArray<MediaStream> streams = event.streams();
    }
  }

  private void onIceCandidate( @Nonnull final RTCPeerConnectionIceEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      Global.globalThis().console().log( "onIceCandidate", event );
      final RTCIceCandidate candidate = event.candidate();
      if ( null != candidate && null != _webSocket )
      {
        sendMessage( JsPropertyMap.of( "command", "candidate",
                                       "mlineindex", candidate.sdpMLineIndex(),
                                       "candidate", candidate.candidate() ) );
      }
    }
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
    final Console console = Global.globalThis().console();
    console.log( "Websocket.message", data );
    final Any object = JSON.parse( data.cast() );
    assert null != object;
    final JsPropertyMap<Object> message = object.cast();

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
      else if ( "full".equals( command ) )
      {
        console.log( "Room full. Leaving room." );
        setRole( Role.UNKNOWN );
        leaveWithState( State.FULL );
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
      else if ( "remove".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        if ( _participants.remove( id ) )
        {
          console.log( "Guest '" + id + "' left the room." );
          getParticipantsObservableValue().reportChanged();
        }
        else if ( _pendingAccessRequest.removeIf( r -> r.getId().equals( id ) ) )
        {
          console.log( "Client '" + id + "' left the room." );
          getPendingAccessRequestsObservableValue().reportChanged();
        }
      }
      else if ( "offer".equals( command ) )
      {
        assert null != _connection;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
        _connection
          .createAnswer()
          .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit.create()
                                                             .type( offer.type() )
                                                             .sdp( offer.sdp() ) ) )
          .then( e -> {
            sendMessage( JsPropertyMap.of( "command", "answer", "session", _connection.localDescription() ) );
            return null;
          } )
          .catch_( e -> {
            // TODO: An error occurred, so handle the failure to connect
            Global.globalThis().console().log( "Answer error: ", e );
            return null;
          } );
      }
      else if ( "answer".equals( command ) )
      {
        assert null != _connection;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
      }
      else if ( "candidate".equals( command ) )
      {
        assert null != _connection;
        _connection.addIceCandidate( RTCIceCandidateInit.create()
                                       .sdpMLineIndex( message.getAsAny( "mlineindex" ).asDouble() )
                                       .candidate( message.getAsAny( "candidate" ).asString() ) );
      }
    }
  }

  @Action( verifyRequired = false )
  void requestAccess()
  {
    if ( null != _webSocket )
    {
      sendMessage( JsPropertyMap.of( "command", "request_access", "message", requestAccessMessage() ) );
      setState( State.JOIN_REQUESTED );
    }
  }

  @Action( verifyRequired = false )
  void acceptAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest, () -> {
      final String id = accessRequest.getId();
      sendMessage( JsPropertyMap.of( "command", "approve_access", "id", id ) );
      _participants.add( id );
      getParticipantsObservableValue().reportChanged();
      connectPeerConnection( id );
    } );
  }

  @Action( verifyRequired = false )
  void rejectAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest,
                          () -> sendMessage( JsPropertyMap.of( "command", "reject_access",
                                                               "id", accessRequest.getId() ) ) );
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

  @Nonnull
  private Promise<MediaStream> requestWebCam()
  {
    return Global
      .globalThis()
      .navigator()
      .mediaDevices()
      .getUserMedia( MediaStreamConstraints
                       .create()
                       .audio( true )
                       .video( MediaTrackConstraints
                                 .create()
                                 .width( ConstrainULongRange.create().min( 160 ).ideal( 640 ).max( 1280 ) )
                                 .height( ConstrainULongRange.create().min( 120 ).ideal( 360 ).max( 720 ) ) ) );
  }

  @Nonnull
  private Promise<MediaStream> requestScreenShare()
  {
    return Global.globalThis().navigator().mediaDevices().getDisplayMedia();
  }
}
