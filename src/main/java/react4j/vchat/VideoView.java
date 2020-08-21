package react4j.vchat;

import arez.Disposable;
import elemental3.HTMLVideoElement;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.JsPropertyMap;
import react4j.ReactElement;
import react4j.ReactNode;
import react4j.annotations.Input;
import react4j.annotations.Render;
import react4j.annotations.View;
import react4j.dom.proptypes.html.RefConsumer;

@View
abstract class VideoView
{
  @Nonnull
  private final RefConsumer _videoRefCallback = e -> activeVideoRef( (HTMLVideoElement) e );

  @Input( immutable = true )
  @Nonnull
  abstract MediaStreamConnection mediaStreamConnection();

  @Input
  abstract boolean muted();

  @Render
  @Nonnull
  ReactNode render()
  {
    return ReactElement.createHostElement( "video",
                                           null,
                                           _videoRefCallback,
                                           JsPropertyMap.of( "autoPlay", true, "muted", muted() ) );
  }

  private void activeVideoRef( @Nullable final HTMLVideoElement element )
  {
    final MediaStreamConnection connection = mediaStreamConnection();
    if ( Disposable.isNotDisposed( connection ) )
    {
      connection.setVideoElement( element );
    }
  }
}
