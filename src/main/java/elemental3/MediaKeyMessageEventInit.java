package elemental3;

import elemental2.core.ArrayBuffer;
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
public interface MediaKeyMessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaKeyMessageEventInit create(@Nonnull final ArrayBuffer message,
      @Nonnull final String messageType) {
    return Js.<MediaKeyMessageEventInit>uncheckedCast( JsPropertyMap.of() ).message( message ).messageType( messageType );
  }

  @JsProperty
  @Nonnull
  ArrayBuffer getMessage();

  @JsProperty
  void setMessage(@Nonnull ArrayBuffer message);

  @JsOverlay
  @Nonnull
  default MediaKeyMessageEventInit message(@Nonnull final ArrayBuffer message) {
    setMessage( message );
    return this;
  }

  @JsProperty
  @Nonnull
  String getMessageType();

  @JsProperty
  void setMessageType(@Nonnull String messageType);

  @JsOverlay
  @Nonnull
  default MediaKeyMessageEventInit messageType(@Nonnull final String messageType) {
    setMessageType( messageType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaKeyMessageEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
