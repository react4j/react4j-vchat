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
    name = "SVGFilterElement"
)
public class SVGFilterElement extends SVGElement {
  SVGFilterElement() {
  }

  @JsProperty(
      name = "filterUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration filterUnits();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "primitiveUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration primitiveUnits();

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

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();
}
