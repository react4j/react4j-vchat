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
public interface DOMPointInit {
  @JsOverlay
  @Nonnull
  static DOMPointInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "w"
  )
  double w();

  @JsProperty
  void setW(double w);

  @JsOverlay
  @Nonnull
  default DOMPointInit w(final double w) {
    setW( w );
    return this;
  }

  @JsProperty(
      name = "x"
  )
  double x();

  @JsProperty
  void setX(double x);

  @JsOverlay
  @Nonnull
  default DOMPointInit x(final double x) {
    setX( x );
    return this;
  }

  @JsProperty(
      name = "y"
  )
  double y();

  @JsProperty
  void setY(double y);

  @JsOverlay
  @Nonnull
  default DOMPointInit y(final double y) {
    setY( y );
    return this;
  }

  @JsProperty(
      name = "z"
  )
  double z();

  @JsProperty
  void setZ(double z);

  @JsOverlay
  @Nonnull
  default DOMPointInit z(final double z) {
    setZ( z );
    return this;
  }
}
