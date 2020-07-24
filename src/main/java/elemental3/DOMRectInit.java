package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface DOMRectInit {
  @JsOverlay
  @Nonnull
  static DOMRectInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getHeight();

  @JsProperty
  void setHeight(double height);

  @JsOverlay
  @Nonnull
  default DOMRectInit height(final double height) {
    setHeight( height );
    return this;
  }

  @JsProperty
  double getWidth();

  @JsProperty
  void setWidth(double width);

  @JsOverlay
  @Nonnull
  default DOMRectInit width(final double width) {
    setWidth( width );
    return this;
  }

  @JsProperty
  double getX();

  @JsProperty
  void setX(double x);

  @JsOverlay
  @Nonnull
  default DOMRectInit x(final double x) {
    setX( x );
    return this;
  }

  @JsProperty
  double getY();

  @JsProperty
  void setY(double y);

  @JsOverlay
  @Nonnull
  default DOMRectInit y(final double y) {
    setY( y );
    return this;
  }
}
