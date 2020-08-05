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
 * The RTCIceParameters dictionary specifies the username fragment and password assigned to an ICE session.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceParameters">RTCIceParameters - MDN</a>
 */
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

  @JsProperty(
      name = "password"
  )
  String password();

  @JsProperty
  void setPassword(@Nonnull String password);

  @JsOverlay
  @Nonnull
  default RTCIceParameters password(@Nonnull final String password) {
    setPassword( password );
    return this;
  }

  @JsProperty(
      name = "usernameFragment"
  )
  String usernameFragment();

  @JsProperty
  void setUsernameFragment(@Nonnull String usernameFragment);

  @JsOverlay
  @Nonnull
  default RTCIceParameters usernameFragment(@Nonnull final String usernameFragment) {
    setUsernameFragment( usernameFragment );
    return this;
  }
}
