package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The MediaStreamTrackEvent interface represents events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrackEvent">MediaStreamTrackEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamTrackEvent"
)
public class MediaStreamTrackEvent extends Event {
  public MediaStreamTrackEvent(@Nonnull final String type,
      @Nonnull final MediaStreamTrackEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native MediaStreamTrack track();
}
