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
public interface PushSubscriptionJSON {
  @JsOverlay
  @Nonnull
  static PushSubscriptionJSON create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getEndpoint();

  @JsProperty
  void setEndpoint(@Nonnull String endpoint);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON endpoint(@Nonnull final String endpoint) {
    setEndpoint( endpoint );
    return this;
  }

  @JsProperty
  @Nullable
  int getExpirationTime();

  @JsProperty
  void setExpirationTime(@Nullable int expirationTime);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON expirationTime(final int expirationTime) {
    setExpirationTime( expirationTime );
    return this;
  }

  @JsProperty
  JsPropertyMap<String> getKeys();

  @JsProperty
  void setKeys(@Nonnull JsPropertyMap<String> keys);

  @JsOverlay
  @Nonnull
  default PushSubscriptionJSON keys(@Nonnull final JsPropertyMap<String> keys) {
    setKeys( keys );
    return this;
  }
}
