package react4j.vchat;

import arez.annotations.CascadeDispose;
import elemental2.promise.Promise;
import elemental3.ConstrainULongRange;
import elemental3.Global;
import elemental3.MediaStream;
import elemental3.MediaStreamConstraints;
import elemental3.MediaTrackConstraints;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import react4j.ReactNode;
import react4j.annotations.Render;
import react4j.annotations.View;

@View( type = View.Type.TRACKING )
abstract class RoomView
{
  @CascadeDispose
  final MediaStreamConnection _camStream =
    MediaStreamConnection.create( this::requestWebCam, false, true, true );
  @CascadeDispose
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, false, true, true );

  @Render
  @Nullable
  ReactNode render()
  {
    return null;
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
