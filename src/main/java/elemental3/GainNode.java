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
    name = "GainNode"
)
public class GainNode extends AudioNode {
  public GainNode(@Nonnull final BaseAudioContext context, @Nonnull final GainOptions options) {
  }

  public GainNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "gain"
  )
  @Nonnull
  public native AudioParam gain();
}
