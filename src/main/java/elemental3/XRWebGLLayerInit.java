package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRWebGLLayerInit {
  @JsOverlay
  @Nonnull
  static XRWebGLLayerInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  @JsProperty
  void setAlpha(boolean alpha);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }

  @JsProperty(
      name = "antialias"
  )
  boolean antialias();

  @JsProperty
  void setAntialias(boolean antialias);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit antialias(final boolean antialias) {
    setAntialias( antialias );
    return this;
  }

  @JsProperty(
      name = "depth"
  )
  boolean depth();

  @JsProperty
  void setDepth(boolean depth);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit depth(final boolean depth) {
    setDepth( depth );
    return this;
  }

  @JsProperty(
      name = "framebufferScaleFactor"
  )
  double framebufferScaleFactor();

  @JsProperty
  void setFramebufferScaleFactor(double framebufferScaleFactor);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit framebufferScaleFactor(final double framebufferScaleFactor) {
    setFramebufferScaleFactor( framebufferScaleFactor );
    return this;
  }

  @JsProperty(
      name = "ignoreDepthValues"
  )
  boolean ignoreDepthValues();

  @JsProperty
  void setIgnoreDepthValues(boolean ignoreDepthValues);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit ignoreDepthValues(final boolean ignoreDepthValues) {
    setIgnoreDepthValues( ignoreDepthValues );
    return this;
  }

  @JsProperty(
      name = "stencil"
  )
  boolean stencil();

  @JsProperty
  void setStencil(boolean stencil);

  @JsOverlay
  @Nonnull
  default XRWebGLLayerInit stencil(final boolean stencil) {
    setStencil( stencil );
    return this;
  }
}
