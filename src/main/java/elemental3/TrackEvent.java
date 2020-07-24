package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TrackEvent"
)
public class TrackEvent extends Event {
  public TrackEvent(@Nonnull final String type, @Nonnull final TrackEventInit eventInitDict) {
    super( null );
  }

  public TrackEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "track"
  )
  @Nullable
  public native VideoTrackOrAudioTrackOrTextTrackUnion track();
}
