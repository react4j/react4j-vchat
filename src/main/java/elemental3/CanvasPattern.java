package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CanvasPattern"
)
public class CanvasPattern {
  CanvasPattern() {
  }

  public native void setTransform(@Nonnull DOMMatrix2DInit transform);

  public native void setTransform();
}
