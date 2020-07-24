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
    name = "DynamicsCompressorNode"
)
public class DynamicsCompressorNode extends AudioNode {
  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context,
      @Nonnull final DynamicsCompressorOptions options) {
  }

  public DynamicsCompressorNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "attack"
  )
  @Nonnull
  public native AudioParam attack();

  @JsProperty(
      name = "knee"
  )
  @Nonnull
  public native AudioParam knee();

  @JsProperty(
      name = "ratio"
  )
  @Nonnull
  public native AudioParam ratio();

  @JsProperty(
      name = "reduction"
  )
  public native float reduction();

  @JsProperty(
      name = "release"
  )
  @Nonnull
  public native AudioParam release();

  @JsProperty(
      name = "threshold"
  )
  @Nonnull
  public native AudioParam threshold();
}
