package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorAttestationResponse"
)
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
  AuthenticatorAttestationResponse() {
  }

  @JsProperty(
      name = "attestationObject"
  )
  @Nonnull
  public native ArrayBuffer attestationObject();
}
