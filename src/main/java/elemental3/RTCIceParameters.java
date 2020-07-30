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
public interface RTCIceParameters {
  @JsOverlay
  @Nonnull
  static RTCIceParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getPassword();

  @JsProperty
  void setPassword(@Nonnull String password);

  @JsOverlay
  @Nonnull
  default RTCIceParameters password(@Nonnull final String password) {
    setPassword( password );
    return this;
  }

  @JsProperty
  String getUsernameFragment();

  @JsProperty
  void setUsernameFragment(@Nonnull String usernameFragment);

  @JsOverlay
  @Nonnull
  default RTCIceParameters usernameFragment(@Nonnull final String usernameFragment) {
    setUsernameFragment( usernameFragment );
    return this;
  }
}
