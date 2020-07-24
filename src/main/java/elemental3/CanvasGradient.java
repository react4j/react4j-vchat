package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CanvasGradient"
)
public class CanvasGradient {
  CanvasGradient() {
  }

  public native void addColorStop(double offset, @Nonnull String color);
}
