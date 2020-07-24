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
    name = "SVGAnimatedTransformList"
)
public class SVGAnimatedTransformList {
  SVGAnimatedTransformList() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGTransformList animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGTransformList baseVal();
}
