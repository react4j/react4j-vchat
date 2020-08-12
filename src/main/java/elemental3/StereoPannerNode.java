package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode">StereoPannerNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StereoPannerNode"
)
public class StereoPannerNode extends AudioNode {
  public StereoPannerNode(@Nonnull final BaseAudioContext context,
      @Nonnull final StereoPannerOptions options) {
  }

  public StereoPannerNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An a-rate AudioParam containing the panning to apply.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StereoPannerNode/pan">StereoPannerNode.pan - MDN</a>
   */
  @JsProperty(
      name = "pan"
  )
  @Nonnull
  public native AudioParam pan();
}
