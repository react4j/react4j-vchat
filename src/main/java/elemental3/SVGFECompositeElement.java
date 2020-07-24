package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFECompositeElement"
)
public class SVGFECompositeElement extends SVGElement {
  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_ARITHMETIC = 6;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_ATOP = 4;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_IN = 2;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_OUT = 3;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_OVER = 1;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_FECOMPOSITE_OPERATOR_XOR = 5;

  SVGFECompositeElement() {
  }

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();

  @JsProperty(
      name = "in2"
  )
  @Nonnull
  public native SVGAnimatedString in2();

  @JsProperty(
      name = "k1"
  )
  @Nonnull
  public native SVGAnimatedNumber k1();

  @JsProperty(
      name = "k2"
  )
  @Nonnull
  public native SVGAnimatedNumber k2();

  @JsProperty(
      name = "k3"
  )
  @Nonnull
  public native SVGAnimatedNumber k3();

  @JsProperty(
      name = "k4"
  )
  @Nonnull
  public native SVGAnimatedNumber k4();

  @JsProperty(
      name = "operator"
  )
  @Nonnull
  public native SVGAnimatedEnumeration operator();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "result"
  )
  @Nonnull
  public native SVGAnimatedString result();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
