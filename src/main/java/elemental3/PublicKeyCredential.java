package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PublicKeyCredential"
)
public class PublicKeyCredential extends Credential {
  PublicKeyCredential() {
  }

  @JsProperty(
      name = "rawId"
  )
  @Nonnull
  public native ArrayBuffer rawId();

  @JsProperty(
      name = "response"
  )
  @Nonnull
  public native AuthenticatorResponse response();

  @Nonnull
  public native AuthenticationExtensionsClientOutputs getClientExtensionResults();

  @Nonnull
  public static native Promise<Boolean> isUserVerifyingPlatformAuthenticatorAvailable();
}
