package react4j.vchat;

import arez.annotations.CascadeDispose;
import elemental2.promise.Promise;
import elemental3.MediaStream;
import javax.annotation.Nonnull;
import org.jetbrains.annotations.NotNull;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;

@View( type = View.Type.TRACKING )
abstract class Application
{
  @CascadeDispose
  @Nonnull
  final BrowserLocation _location = BrowserLocation.create();
  @CascadeDispose
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, false, true, true );

  @CascadeDispose
  @Nonnull
  final RoomConnection _connection = RoomConnection.create( _location );

  @Nonnull
  @Render
  ReactNode render()
  {
    final String location = _location.getLocation();
    return location.isEmpty() ?
           SelectRoomViewBuilder.build() :
           RoomViewBuilder.connection( _connection ).screenShareStream( _screenShareStream );
  }

  @Nonnull
  private Promise<MediaStream> requestScreenShare()
  {
    return Elemental3Util.getNavigator().mediaDevices().getDisplayMedia();
  }
}
