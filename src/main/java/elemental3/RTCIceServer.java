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
 * The RTCIceServer dictionary defines how to connect to a single ICE server (such as a STUN or TURN server). It includes both the URL and the necessary credentials, if any, to connect to the server.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCIceServer">RTCIceServer - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCIceServer {
  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final String urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final JsArray<String> urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  @JsOverlay
  @Nonnull
  static RTCIceServer create(@Nonnull final String[] urls) {
    return Js.<RTCIceServer>uncheckedCast( JsPropertyMap.of() ).urls( urls );
  }

  @JsProperty(
      name = "credential"
  )
  String credential();

  @JsProperty
  void setCredential(@Nonnull String credential);

  @JsOverlay
  @Nonnull
  default RTCIceServer credential(@Nonnull final String credential) {
    setCredential( credential );
    return this;
  }

  @JsProperty(
      name = "credentialType"
  )
  String credentialType();

  @JsProperty
  void setCredentialType(@Nonnull String credentialType);

  @JsOverlay
  @Nonnull
  default RTCIceServer credentialType(@Nonnull final String credentialType) {
    setCredentialType( credentialType );
    return this;
  }

  @JsProperty(
      name = "urls"
  )
  @Nonnull
  StringOrStringArrayUnion urls();

  @JsProperty
  void setUrls(@Nonnull StringOrStringArrayUnion urls);

  @JsOverlay
  default void setUrls(@Nonnull final String urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final String urls) {
    setUrls( urls );
    return this;
  }

  @JsOverlay
  default void setUrls(@Nonnull final JsArray<String> urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final JsArray<String> urls) {
    setUrls( urls );
    return this;
  }

  @JsOverlay
  default void setUrls(@Nonnull final String... urls) {
    setUrls( StringOrStringArrayUnion.of( urls ) );
  }

  @JsOverlay
  @Nonnull
  default RTCIceServer urls(@Nonnull final String... urls) {
    setUrls( urls );
    return this;
  }

  @JsProperty(
      name = "username"
  )
  String username();

  @JsProperty
  void setUsername(@Nonnull String username);

  @JsOverlay
  @Nonnull
  default RTCIceServer username(@Nonnull final String username) {
    setUsername( username );
    return this;
  }
}
