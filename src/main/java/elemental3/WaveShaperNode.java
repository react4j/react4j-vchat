package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WaveShaperNode"
)
public class WaveShaperNode extends AudioNode {
  @Nullable
  public Float32Array curve;

  @Nonnull
  public String oversample;

  public WaveShaperNode(@Nonnull final BaseAudioContext context,
      @Nonnull final WaveShaperOptions options) {
  }

  public WaveShaperNode(@Nonnull final BaseAudioContext context) {
  }
}
