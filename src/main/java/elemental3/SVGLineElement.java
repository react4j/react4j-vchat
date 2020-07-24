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
    name = "SVGLineElement"
)
public class SVGLineElement extends SVGGeometryElement {
  SVGLineElement() {
  }

  @JsProperty(
      name = "x1"
  )
  @Nonnull
  public native SVGAnimatedLength x1();

  @JsProperty(
      name = "x2"
  )
  @Nonnull
  public native SVGAnimatedLength x2();

  @JsProperty(
      name = "y1"
  )
  @Nonnull
  public native SVGAnimatedLength y1();

  @JsProperty(
      name = "y2"
  )
  @Nonnull
  public native SVGAnimatedLength y2();
}
