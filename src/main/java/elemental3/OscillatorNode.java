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
    name = "OscillatorNode"
)
public class OscillatorNode extends AudioScheduledSourceNode {
  @Nonnull
  public String type;

  public OscillatorNode(@Nonnull final BaseAudioContext context,
      @Nonnull final OscillatorOptions options) {
  }

  public OscillatorNode(@Nonnull final BaseAudioContext context) {
  }

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

  public native void setPeriodicWave(@Nonnull PeriodicWave periodicWave);
}
