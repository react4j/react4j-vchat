package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRInputSourcesChangeEventInit dictionary is used to provide options to the XRInputSourcesChangeEvent() constructor in order to set the initial state of the new XRInputSourcesChangeEvent object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourcesChangeEventInit">XRInputSourcesChangeEventInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRInputSourcesChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRInputSourcesChangeEventInit create(@Nonnull final JsArray<XRInputSource> added,
      @Nonnull final JsArray<XRInputSource> removed, @Nonnull final XRSession session) {
    return Js.<XRInputSourcesChangeEventInit>uncheckedCast( JsPropertyMap.of() ).added( added ).removed( removed ).session( session );
  }

  @JsProperty(
      name = "added"
  )
  @Nonnull
  JsArray<XRInputSource> added();

  @JsProperty
  void setAdded(@Nonnull JsArray<XRInputSource> added);

  @JsOverlay
  @Nonnull
  default XRInputSourcesChangeEventInit added(@Nonnull final JsArray<XRInputSource> added) {
    setAdded( added );
    return this;
  }

  @JsProperty(
      name = "removed"
  )
  @Nonnull
  JsArray<XRInputSource> removed();

  @JsProperty
  void setRemoved(@Nonnull JsArray<XRInputSource> removed);

  @JsOverlay
  @Nonnull
  default XRInputSourcesChangeEventInit removed(@Nonnull final JsArray<XRInputSource> removed) {
    setRemoved( removed );
    return this;
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
  default XRInputSourcesChangeEventInit session(@Nonnull final XRSession session) {
    setSession( session );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRInputSourcesChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
