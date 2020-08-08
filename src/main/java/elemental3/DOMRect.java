package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMRect"
)
public class DOMRect extends DOMRectReadOnly {
  public double height;

  public double width;

  public double x;

  public double y;

  public DOMRect(final double x, final double y, final double width, final double height) {
  }

  public DOMRect(final double x, final double y, final double width) {
  }

  public DOMRect(final double x, final double y) {
  }

  public DOMRect(final double x) {
  }

  public DOMRect() {
  }

  @Nonnull
  public static native DOMRect fromRect(@Nonnull DOMRectInit other);

  @Nonnull
  public static native DOMRect fromRect();
}
