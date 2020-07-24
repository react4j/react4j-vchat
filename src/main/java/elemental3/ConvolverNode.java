package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ConvolverNode"
)
public class ConvolverNode extends AudioNode {
  @Nullable
  public AudioBuffer buffer;

  public boolean normalize;

  public ConvolverNode(@Nonnull final BaseAudioContext context,
      @Nonnull final ConvolverOptions options) {
  }

  public ConvolverNode(@Nonnull final BaseAudioContext context) {
  }
}
