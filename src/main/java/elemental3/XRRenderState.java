package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRRenderState"
)
public class XRRenderState {
  XRRenderState() {
  }

  @JsProperty(
      name = "baseLayer"
  )
  @Nullable
  public native XRWebGLLayer baseLayer();

  @JsProperty(
      name = "depthFar"
  )
  public native double depthFar();

  @JsProperty(
      name = "depthNear"
  )
  public native double depthNear();

  @JsProperty(
      name = "inlineVerticalFieldOfView"
  )
  @Nullable
  public native Double inlineVerticalFieldOfView();
}
