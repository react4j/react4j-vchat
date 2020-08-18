package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The VTTRegion interface—part of the API for handling WebVTT (text tracks on media presentations)—describes a portion of the video to render a VTTCue onto.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTRegion">VTTRegion - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTRegion"
)
public class VTTRegion {
  @Nonnull
  public String id;

  public int lines;

  public double regionAnchorX;

  public double regionAnchorY;

  @Nonnull
  public String scroll;

  public double viewportAnchorX;

  public double viewportAnchorY;

  public double width;

  VTTRegion() {
  }
}
