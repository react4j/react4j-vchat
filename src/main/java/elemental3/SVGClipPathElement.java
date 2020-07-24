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
    name = "SVGClipPathElement"
)
public class SVGClipPathElement extends SVGElement {
  SVGClipPathElement() {
  }

  @JsProperty(
      name = "clipPathUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration clipPathUnits();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native SVGAnimatedTransformList transform();
}
