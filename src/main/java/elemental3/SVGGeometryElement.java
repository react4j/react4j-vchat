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
    name = "SVGGeometryElement"
)
public class SVGGeometryElement extends SVGGraphicsElement {
  SVGGeometryElement() {
  }

  @JsProperty(
      name = "pathLength"
  )
  @Nonnull
  public native SVGAnimatedNumber pathLength();

  @Nonnull
  public native DOMPoint getPointAtLength(float distance);

  public native float getTotalLength();

  public native boolean isPointInFill(@Nonnull DOMPointInit point);

  public native boolean isPointInFill();

  public native boolean isPointInStroke(@Nonnull DOMPointInit point);

  public native boolean isPointInStroke();
}
