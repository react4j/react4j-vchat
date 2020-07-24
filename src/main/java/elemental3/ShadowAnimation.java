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
    name = "ShadowAnimation"
)
public class ShadowAnimation extends Animation {
  ShadowAnimation() {
  }

  @JsProperty(
      name = "sourceAnimation"
  )
  @Nonnull
  public native Animation sourceAnimation();
}
