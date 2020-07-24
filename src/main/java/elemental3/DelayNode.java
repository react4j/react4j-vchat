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
    name = "DelayNode"
)
public class DelayNode extends AudioNode {
  public DelayNode(@Nonnull final BaseAudioContext context, @Nonnull final DelayOptions options) {
  }

  public DelayNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "delayTime"
  )
  @Nonnull
  public native AudioParam delayTime();
}
