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
public interface DOMMatrix2DInit {
  @JsOverlay
  @Nonnull
  static DOMMatrix2DInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getA();

  @JsProperty
  void setA(double a);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit a(final double a) {
    setA( a );
    return this;
  }

  @JsProperty
  double getB();

  @JsProperty
  void setB(double b);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit b(final double b) {
    setB( b );
    return this;
  }

  @JsProperty
  double getC();

  @JsProperty
  void setC(double c);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit c(final double c) {
    setC( c );
    return this;
  }

  @JsProperty
  double getD();

  @JsProperty
  void setD(double d);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit d(final double d) {
    setD( d );
    return this;
  }

  @JsProperty
  double getE();

  @JsProperty
  void setE(double e);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit e(final double e) {
    setE( e );
    return this;
  }

  @JsProperty
  double getF();

  @JsProperty
  void setF(double f);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit f(final double f) {
    setF( f );
    return this;
  }

  @JsProperty
  double getM11();

  @JsProperty
  void setM11(double m11);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m11(final double m11) {
    setM11( m11 );
    return this;
  }

  @JsProperty
  double getM12();

  @JsProperty
  void setM12(double m12);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m12(final double m12) {
    setM12( m12 );
    return this;
  }

  @JsProperty
  double getM21();

  @JsProperty
  void setM21(double m21);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m21(final double m21) {
    setM21( m21 );
    return this;
  }

  @JsProperty
  double getM22();

  @JsProperty
  void setM22(double m22);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m22(final double m22) {
    setM22( m22 );
    return this;
  }

  @JsProperty
  double getM41();

  @JsProperty
  void setM41(double m41);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m41(final double m41) {
    setM41( m41 );
    return this;
  }

  @JsProperty
  double getM42();

  @JsProperty
  void setM42(double m42);

  @JsOverlay
  @Nonnull
  default DOMMatrix2DInit m42(final double m42) {
    setM42( m42 );
    return this;
  }
}
