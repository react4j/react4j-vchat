package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface XRRenderStateInit {
  @JsOverlay
  @Nonnull
  static XRRenderStateInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  @Nullable
  XRWebGLLayer getBaseLayer();

  @JsProperty
  void setBaseLayer(@Nullable XRWebGLLayer baseLayer);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit baseLayer(@Nullable final XRWebGLLayer baseLayer) {
    setBaseLayer( baseLayer );
    return this;
  }

  @JsProperty
  double getDepthFar();

  @JsProperty
  void setDepthFar(double depthFar);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit depthFar(final double depthFar) {
    setDepthFar( depthFar );
    return this;
  }

  @JsProperty
  double getDepthNear();

  @JsProperty
  void setDepthNear(double depthNear);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit depthNear(final double depthNear) {
    setDepthNear( depthNear );
    return this;
  }

  @JsProperty
  double getInlineVerticalFieldOfView();

  @JsProperty
  void setInlineVerticalFieldOfView(double inlineVerticalFieldOfView);

  @JsOverlay
  @Nonnull
  default XRRenderStateInit inlineVerticalFieldOfView(final double inlineVerticalFieldOfView) {
    setInlineVerticalFieldOfView( inlineVerticalFieldOfView );
    return this;
  }
}
