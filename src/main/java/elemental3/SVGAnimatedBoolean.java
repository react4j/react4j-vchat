package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedBoolean"
)
public class SVGAnimatedBoolean {
  public boolean baseVal;

  SVGAnimatedBoolean() {
  }

  @JsProperty(
      name = "animVal"
  )
  public native boolean animVal();
}
