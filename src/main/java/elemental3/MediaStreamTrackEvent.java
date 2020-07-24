package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
