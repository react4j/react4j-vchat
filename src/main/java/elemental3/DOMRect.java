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

  DOMRect() {
  }

  @Nonnull
  public static native DOMRect fromRect(@Nonnull DOMRectInit other);

  @Nonnull
  public static native DOMRect fromRect();
}
