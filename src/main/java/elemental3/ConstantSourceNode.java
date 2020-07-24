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
    name = "ConstantSourceNode"
)
public class ConstantSourceNode extends AudioScheduledSourceNode {
  public ConstantSourceNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ConstantSourceOptions options) {
  }

  public ConstantSourceNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "offset"
  )
  @Nonnull
  public native AudioParam offset();
}
