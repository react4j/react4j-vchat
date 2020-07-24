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
    name = "SVGStopElement"
)
public class SVGStopElement extends SVGElement {
  SVGStopElement() {
  }

  @JsProperty(
      name = "offset"
  )
  @Nonnull
  public native SVGAnimatedNumber offset();
}
