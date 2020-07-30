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

  @JsProperty
  String getCredential();

  @JsProperty
  void setCredential(@Nonnull String credential);

  @JsOverlay
  @Nonnull
  default RTCIceServer credential(@Nonnull final String credential) {
    setCredential( credential );
    return this;
  }

  @JsProperty
  String getCredentialType();

  @JsProperty
  void setCredentialType(@Nonnull String credentialType);

  @JsOverlay
  @Nonnull
  default RTCIceServer credentialType(@Nonnull final String credentialType) {
    setCredentialType( credentialType );
    return this;
  }

  @JsProperty
  @Nonnull
  StringOrStringArrayUnion getUrls();

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

  @JsProperty
  String getUsername();

  @JsProperty
  void setUsername(@Nonnull String username);

  @JsOverlay
  @Nonnull
  default RTCIceServer username(@Nonnull final String username) {
    setUsername( username );
    return this;
  }
}
