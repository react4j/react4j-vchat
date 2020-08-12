package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A DOMPoint object represents a 2D or 3D point in a coordinate system; it includes values for the coordinates in up to three dimensions, as well as an optional perspective value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint">DOMPoint - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMPoint"
)
public class DOMPoint extends DOMPointReadOnly {
  /**
   * The DOMPoint interface's w property holds the point's perspective value, w, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/w">DOMPoint.w - MDN</a>
   */
  public double w;

  /**
   * The DOMPoint interface's x property holds the horizontal coordinate, x, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/x">DOMPoint.x - MDN</a>
   */
  public double x;

  /**
   * The DOMPoint interface's y property holds the vertical coordinate, y, for a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/y">DOMPoint.y - MDN</a>
   */
  public double y;

  /**
   * The DOMPoint interface's z property specifies the depth coordinate of a point in space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMPoint/z">DOMPoint.z - MDN</a>
   */
  public double z;

  public DOMPoint(final double x, final double y, final double z, final double w) {
  }

  public DOMPoint(final double x, final double y, final double z) {
  }

  public DOMPoint(final double x, final double y) {
  }

  public DOMPoint(final double x) {
  }

  public DOMPoint() {
  }

  @Nonnull
  public static native DOMPoint fromPoint(@Nonnull DOMPointInit other);

  @Nonnull
  public static native DOMPoint fromPoint();
}
