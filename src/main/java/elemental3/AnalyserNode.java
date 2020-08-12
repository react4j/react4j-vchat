package elemental3;

import elemental2.core.Float32Array;
import elemental2.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AnalyserNode interface represents a node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode">AnalyserNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnalyserNode"
)
public class AnalyserNode extends AudioNode {
  /**
   * The fftSize property of the AnalyserNode interface is an unsigned long value and represents the window size in samples that is used when performing a Fast Fourier Transform (FFT) to get frequency domain data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/fftSize">AnalyserNode.fftSize - MDN</a>
   */
  public int fftSize;

  /**
   * The maxDecibels property of the AnalyserNode interface is a double value representing the maximum power value in the scaling range for the FFT analysis data, for conversion to unsigned byte/float values — basically, this specifies the maximum value for the range of results when using getFloatFrequencyData() or getByteFrequencyData().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/maxDecibels">AnalyserNode.maxDecibels - MDN</a>
   */
  public double maxDecibels;

  /**
   * The minDecibels property of the AnalyserNode interface is a double value representing the minimum power value in the scaling range for the FFT analysis data, for conversion to unsigned byte/float values — basically, this specifies the minimum value for the range of results when using getFloatFrequencyData() or getByteFrequencyData().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/minDecibels">AnalyserNode.minDecibels - MDN</a>
   */
  public double minDecibels;

  /**
   * The smoothingTimeConstant property of the AnalyserNode interface is a double value representing the averaging constant with the last analysis frame. It's basically an average between the current buffer and the last buffer the AnalyserNode processed, and results in a much smoother set of value changes over time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/smoothingTimeConstant">AnalyserNode.smoothingTimeConstant - MDN</a>
   */
  public double smoothingTimeConstant;

  public AnalyserNode(@Nonnull final BaseAudioContext context,
      @Nonnull final AnalyserOptions options) {
  }

  public AnalyserNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * The frequencyBinCount read-only property of the AnalyserNode interface is an unsigned integer half that of the AnalyserNode.fftSize. This generally equates to the number of data values you will have to play with for the visualization.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount">AnalyserNode.frequencyBinCount - MDN</a>
   */
  @JsProperty(
      name = "frequencyBinCount"
  )
  public native int frequencyBinCount();

  public native void getByteFrequencyData(@Nonnull Uint8Array array);

  public native void getByteTimeDomainData(@Nonnull Uint8Array array);

  /**
   * The getFloatFrequencyData() method of the AnalyserNode Interface copies the current frequency data into a Float32Array array passed into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getFloatFrequencyData">AnalyserNode.getFloatFrequencyData - MDN</a>
   */
  public native void getFloatFrequencyData(@Nonnull Float32Array array);

  public native void getFloatTimeDomainData(@Nonnull Float32Array array);
}
