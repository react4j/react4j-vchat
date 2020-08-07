package react4j.vchat;

import arez.annotations.ArezComponent;
import arez.annotations.ComponentDependency;
import elemental3.MediaStream;
import elemental3.RTCPeerConnection;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ArezComponent
abstract class RoomConnection
{
  @ComponentDependency
  final BrowserLocation _browserLocation;

  @Nonnull
  static RoomConnection create( @Nonnull final BrowserLocation browserLocation )
  {
    return new Arez_RoomConnection( browserLocation );
  }

  RoomConnection( @Nonnull final BrowserLocation browserLocation )
  {
    _browserLocation = Objects.requireNonNull( browserLocation );
  }

  @Nullable
  String getRoomId()
  {
    final String location = _browserLocation.getLocation();
    return location.isEmpty() ? null : location;
  }

  void join( @Nonnull final MediaStreamConnection mediaStreamConnection )
  {
    final RTCPeerConnection peerConnection = new RTCPeerConnection();
    //connection.onicecandidate
    final MediaStream stream = mediaStreamConnection.getStream();
    assert null != stream;
    stream.getTracks().forEach( ( track, index, tracks ) -> {
      peerConnection.addTrack( track, stream );
      //TODO: Should not need this return null
      return null;
    } );
  }

  boolean isConnecting()
  {
    return false;
  }

  boolean isJoined()
  {
    return false;
  }

  boolean isWaiting()
  {
    return true;
  }
}
