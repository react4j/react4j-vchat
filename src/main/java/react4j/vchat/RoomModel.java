package react4j.vchat;

import arez.annotations.ArezComponent;
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

  @Nonnull
  private final String _code;

  @Nonnull
  static RoomModel create( @Nonnull final String code )
  {
    return new Arez_RoomModel( code, State.NOT_ASKED, "" );
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

  @Observable
  @Nonnull
  abstract State state();

  abstract void setState( @Nonnull State state );

  @Observable
  @Nonnull
  abstract String requestAccessMessage();

  abstract void setRequestAccessMessage( @Nonnull String message );
}
