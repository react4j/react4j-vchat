package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedNumber"
)
public class SVGAnimatedNumber {
  public float baseVal;

  SVGAnimatedNumber() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native float animVal();
}
