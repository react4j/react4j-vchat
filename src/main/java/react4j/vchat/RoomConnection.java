package react4j.vchat;

import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComponentDependency;
import arez.annotations.Observable;
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

  @Observable
  abstract boolean isAudioEnabled();

  abstract void setAudioEnabled( boolean audioEnabled );

  @Action
  void toggleAudio()
  {
    setAudioEnabled( !isAudioEnabled() );
  }

  @Observable
  abstract boolean isVideoEnabled();

  abstract void setVideoEnabled( boolean videoEnabled );

  @Action
  void toggleVideo()
  {
    setVideoEnabled( !isVideoEnabled() );
  }

  boolean isConnecting()
  {
    return false;
  }

  boolean isWaiting()
  {
    return true;
  }
}
