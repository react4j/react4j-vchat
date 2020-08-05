package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRInputSourceEventInit dictionary is used when calling the XRInputSourceEvent() constructor to provide configuration options for the newly-created XRInputSourceEvent object to take on.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceEventInit">XRInputSourceEventInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRInputSourceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRInputSourceEventInit create(@Nonnull final XRFrame frame,
      @Nonnull final XRInputSource inputSource) {
    return Js.<XRInputSourceEventInit>uncheckedCast( JsPropertyMap.of() ).frame( frame ).inputSource( inputSource );
  }

  @JsProperty(
      name = "frame"
  )
  @Nonnull
  XRFrame frame();

  @JsProperty
  void setFrame(@Nonnull XRFrame frame);

  @JsOverlay
  @Nonnull
  default XRInputSourceEventInit frame(@Nonnull final XRFrame frame) {
    setFrame( frame );
    return this;
  }

  @JsProperty(
      name = "inputSource"
  )
  @Nonnull
  XRInputSource inputSource();

  @JsProperty
  void setInputSource(@Nonnull XRInputSource inputSource);

  @JsOverlay
  @Nonnull
  default XRInputSourceEventInit inputSource(@Nonnull final XRInputSource inputSource) {
    setInputSource( inputSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourceEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
