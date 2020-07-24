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

  @JsProperty
  double getW();

  @JsProperty
  void setW(double w);

  @JsOverlay
  @Nonnull
  default DOMPointInit w(final double w) {
    setW( w );
    return this;
  }

  @JsProperty
  double getX();

  @JsProperty
  void setX(double x);

  @JsOverlay
  @Nonnull
  default DOMPointInit x(final double x) {
    setX( x );
    return this;
  }

  @JsProperty
  double getY();

  @JsProperty
  void setY(double y);

  @JsOverlay
  @Nonnull
  default DOMPointInit y(final double y) {
    setY( y );
    return this;
  }

  @JsProperty
  double getZ();

  @JsProperty
  void setZ(double z);

  @JsOverlay
  @Nonnull
  default DOMPointInit z(final double z) {
    setZ( z );
    return this;
  }
}
