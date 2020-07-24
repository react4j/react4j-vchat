package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedInteger"
)
public class SVGAnimatedInteger {
  public int baseVal;

  SVGAnimatedInteger() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native int animVal();
}
