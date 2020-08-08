package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMRectReadOnly"
)
public class DOMRectReadOnly {
  public DOMRectReadOnly(final double x, final double y, final double width, final double height) {
  }

  public DOMRectReadOnly(final double x, final double y, final double width) {
  }

  public DOMRectReadOnly(final double x, final double y) {
  }

  public DOMRectReadOnly(final double x) {
  }

  public DOMRectReadOnly() {
  }

  @JsProperty(
      name = "bottom"
  )
  public native double bottom();

  @JsProperty(
      name = "height"
  )
  public native double height();

  @JsProperty(
      name = "left"
  )
  public native double left();

  @JsProperty(
      name = "right"
  )
  public native double right();

  @JsProperty(
      name = "top"
  )
  public native double top();

  @JsProperty(
      name = "width"
  )
  public native double width();

  @JsProperty(
      name = "x"
  )
  public native double x();

  @JsProperty(
      name = "y"
  )
  public native double y();

  @Nonnull
  public static native DOMRectReadOnly fromRect(@Nonnull DOMRectInit other);

  @Nonnull
  public static native DOMRectReadOnly fromRect();

  @Nonnull
  public native Object toJSON();
}
