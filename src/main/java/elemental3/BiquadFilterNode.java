package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BiquadFilterNode"
)
public class BiquadFilterNode extends AudioNode {
  @Nonnull
  public String type;

  public BiquadFilterNode(@Nonnull final BaseAudioContext context,
      @Nonnull final BiquadFilterOptions options) {
  }

  public BiquadFilterNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "Q"
  )
  @Nonnull
  public native AudioParam Q();

  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  @JsProperty(
      name = "frequency"
  )
  @Nonnull
  public native AudioParam frequency();

  @JsProperty(
      name = "gain"
  )
  @Nonnull
  public native AudioParam gain();

  public native void getFrequencyResponse(@Nonnull Float32Array frequencyHz,
      @Nonnull Float32Array magResponse, @Nonnull Float32Array phaseResponse);
}
