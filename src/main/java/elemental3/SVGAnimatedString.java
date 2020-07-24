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
    name = "SVGAnimatedString"
)
public class SVGAnimatedString {
  @Nonnull
  public String baseVal;

  SVGAnimatedString() {
  }

  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native String animVal();
}
