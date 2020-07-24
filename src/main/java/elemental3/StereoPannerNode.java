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
    name = "StereoPannerNode"
)
public class StereoPannerNode extends AudioNode {
  public StereoPannerNode(@Nonnull final BaseAudioContext context,
      @Nonnull final StereoPannerOptions options) {
  }

  public StereoPannerNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "pan"
  )
  @Nonnull
  public native AudioParam pan();
}
