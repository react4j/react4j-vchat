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
public interface CredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static CredentialRequestOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getMediation();

  @JsProperty
  void setMediation(@Nonnull String mediation);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions mediation(@Nonnull final String mediation) {
    setMediation( mediation );
    return this;
  }

  @JsProperty
  AbortSignal getSignal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions signal(@Nonnull final AbortSignal signal) {
    setSignal( signal );
    return this;
  }

  @JsProperty
  boolean isPassword();

  @JsProperty
  void setPassword(boolean password);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions password(final boolean password) {
    setPassword( password );
    return this;
  }

  @JsProperty
  FederatedCredentialRequestOptions getFederated();

  @JsProperty
  void setFederated(@Nonnull FederatedCredentialRequestOptions federated);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions federated(
      @Nonnull final FederatedCredentialRequestOptions federated) {
    setFederated( federated );
    return this;
  }

  @JsProperty
  PublicKeyCredentialRequestOptions getPublicKey();

  @JsProperty
  void setPublicKey(@Nonnull PublicKeyCredentialRequestOptions publicKey);

  @JsOverlay
  @Nonnull
  default CredentialRequestOptions publicKey(
      @Nonnull final PublicKeyCredentialRequestOptions publicKey) {
    setPublicKey( publicKey );
    return this;
  }
}
