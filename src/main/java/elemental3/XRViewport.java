package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRViewport"
)
public class XRViewport {
  XRViewport() {
  }

  @JsProperty(
      name = "height"
  )
  public native int height();

  @JsProperty(
      name = "width"
  )
  public native int width();

  @JsProperty(
      name = "x"
  )
  public native int x();

  @JsProperty(
      name = "y"
  )
  public native int y();
}
