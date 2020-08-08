package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMPoint"
)
public class DOMPoint extends DOMPointReadOnly {
  public double w;

  public double x;

  public double y;

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
