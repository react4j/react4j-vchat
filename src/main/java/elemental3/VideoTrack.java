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
    name = "VideoTrack"
)
public class VideoTrack {
  public boolean selected;

  VideoTrack() {
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @JsProperty(
      name = "language"
  )
  @Nonnull
  public native String language();

  @JsProperty(
      name = "sourceBuffer"
  )
  @Nullable
  public native SourceBuffer sourceBuffer();
}
