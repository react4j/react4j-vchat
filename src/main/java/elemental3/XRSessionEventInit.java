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
 * The XRSessionEventInit dictionary is used when calling the XRSessionEvent() constructor to provide the new event's initial values.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRSessionEventInit">XRSessionEventInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRSessionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRSessionEventInit create(@Nonnull final XRSession session) {
    return Js.<XRSessionEventInit>uncheckedCast( JsPropertyMap.of() ).session( session );
  }

  @JsProperty(
      name = "session"
  )
  @Nonnull
  XRSession session();

  @JsProperty
  void setSession(@Nonnull XRSession session);

  @JsOverlay
  @Nonnull
  default XRSessionEventInit session(@Nonnull final XRSession session) {
    setSession( session );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRSessionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRSessionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRSessionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
