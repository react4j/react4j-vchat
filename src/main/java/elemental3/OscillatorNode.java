package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode">OscillatorNode - MDN</a>
 */
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

  /**
   * An a-rate AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/frequency">OscillatorNode.frequency - MDN</a>
   */
  @JsProperty(
      name = "frequency"
  )
  @Nonnull
  public native AudioParam frequency();

  /**
   * The setPeriodicWave() method of the OscillatorNode interface is used to point to a PeriodicWave defining a periodic waveform that can be used to shape the oscillator's output, when type is custom.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/OscillatorNode/setPeriodicWave">OscillatorNode.setPeriodicWave - MDN</a>
   */
  public native void setPeriodicWave(@Nonnull PeriodicWave periodicWave);
}
