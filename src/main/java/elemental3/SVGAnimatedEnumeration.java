package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedEnumeration"
)
public class SVGAnimatedEnumeration {
  public int baseVal;

  SVGAnimatedEnumeration() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native int animVal();
}
