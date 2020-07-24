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
    name = "SVGAnimatedLengthList"
)
public class SVGAnimatedLengthList {
  SVGAnimatedLengthList() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGLengthList animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGLengthList baseVal();
}
