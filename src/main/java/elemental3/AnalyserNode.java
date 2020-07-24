package elemental3;

import elemental2.core.Float32Array;
import elemental2.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnalyserNode"
)
public class AnalyserNode extends AudioNode {
  public int fftSize;

  public double maxDecibels;

  public double minDecibels;

  public double smoothingTimeConstant;

  public AnalyserNode(@Nonnull final BaseAudioContext context,
      @Nonnull final AnalyserOptions options) {
  }

  public AnalyserNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "frequencyBinCount"
  )
  public native int frequencyBinCount();

  public native void getByteFrequencyData(@Nonnull Uint8Array array);

  public native void getByteTimeDomainData(@Nonnull Uint8Array array);

  public native void getFloatFrequencyData(@Nonnull Float32Array array);

  public native void getFloatTimeDomainData(@Nonnull Float32Array array);
}
