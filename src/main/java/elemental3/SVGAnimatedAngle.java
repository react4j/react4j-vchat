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
    name = "SVGAnimatedAngle"
)
public class SVGAnimatedAngle {
  SVGAnimatedAngle() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native SVGAngle animVal();

  @JsProperty(
      name = "baseVal"
  )
  @Nonnull
  public native SVGAngle baseVal();
}
