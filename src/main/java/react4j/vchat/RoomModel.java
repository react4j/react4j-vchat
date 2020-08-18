package react4j.vchat;

import arez.annotations.ArezComponent;
import arez.annotations.Feature;
import arez.annotations.Observable;
import java.util.Objects;
import javax.annotation.Nonnull;

@ArezComponent
abstract class RoomModel
{
  enum State
  {
    // Have not yet attempted to connect to the room server
    NOT_ASKED,
    // Started connection attempt to the server
    CONNECTING,
    // Failed to connect to the server
    CONNECT_FAILED,
    // Connected to the server and first one in so designated host
    HOST_CONNECTED,
    // Connected to the server as a guest but not yet attempted to join the chat
    GUEST_CONNECTED,
    // Guest requested to join the the room, waiting for host acceptance or rejection
    GUEST_JOIN_REQUESTED,
    // Host has accepted guest and guest has joined the room
    GUEST_JOINED,
    // Host has rejected guest attempt to join the room
    GUEST_REJECTED,
    // Host has shutdown the room and thus the chat has been cancelled
    ROOM_CLOSED,
    // left the room as the host and thus other connections were disconnected
    HOST_LEFT,
    // left the room as a guest
    GUEST_LEFT
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
  @Nullable
  private WebSocket _webSocket;

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

  @Action
  void open()
  {
    if ( null != _webSocket )
    {
      _webSocket.close();
      _webSocket = null;
    }
    _webSocket = new WebSocket( deriveRoomUrl() );
    getConnectionStateComputableValue().reportPossiblyChanged();
    setRole( Role.UNKNOWN );
    setState( State.NOT_READY );
    _webSocket.onopen = this::onOpen;
    _webSocket.onmessage = this::onMessage;
    _webSocket.onclose = this::onClose;
    _webSocket.onerror = this::onError;
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

  @Action
  void onError( @Nonnull final Event event )
  {
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      _webSocket = null;
    }
  }

  @Action
  void onOpen( @Nonnull final Event event )
  {
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action
  void onClose( @Nonnull final CloseEvent closeEvent )
  {
    if ( _webSocket == closeEvent.currentTarget() )
    {
      _webSocket = null;
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action
  void onMessage( @Nonnull final MessageEvent event )
  {
    final Any data = event.data();
    assert null != data;
    final Any object = JSON.parse( data.cast() );
    assert null != object;
    final JsPropertyMap<Object> message = object.cast();

    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      final String command = message.getAsAny( "command" ).asString();
      if ( "create".equals( command ) )
      {
        setRole( Role.HOST );
      }
      else if ( "connect".equals( command ) )
      {
        setRole( Role.GUEST );
      }
    }
  }

  @Action
  void requestAccess()
  {
    if ( null != _webSocket )
    {
    }
  }
}
