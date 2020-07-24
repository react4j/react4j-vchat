package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRWebGLLayer"
)
public class XRWebGLLayer {
  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context, @Nonnull final XRWebGLLayerInit layerInit) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final XRWebGLRenderingContext context) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGLRenderingContext context) {
  }

  public XRWebGLLayer(@Nonnull final XRSession session,
      @Nonnull final WebGL2RenderingContext context) {
  }

  @JsProperty(
      name = "antialias"
  )
  public native boolean antialias();

  @JsProperty(
      name = "framebuffer"
  )
  @Nonnull
  public native WebGLFramebuffer framebuffer();

  @JsProperty(
      name = "framebufferHeight"
  )
  public native int framebufferHeight();

  @JsProperty(
      name = "framebufferWidth"
  )
  public native int framebufferWidth();

  @JsProperty(
      name = "ignoreDepthValues"
  )
  public native boolean ignoreDepthValues();

  public static native double getNativeFramebufferScaleFactor(@Nonnull XRSession session);

  @Nullable
  public native XRViewport getViewport(@Nonnull XRView view);
}
