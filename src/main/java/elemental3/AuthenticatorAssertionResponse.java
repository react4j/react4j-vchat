package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AuthenticatorAssertionResponse"
)
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
  AuthenticatorAssertionResponse() {
  }

  @JsProperty(
      name = "authenticatorData"
  )
  @Nonnull
  public native ArrayBuffer authenticatorData();

  @JsProperty(
      name = "signature"
  )
  @Nonnull
  public native ArrayBuffer signature();

  @JsProperty(
      name = "userHandle"
  )
  @Nullable
  public native ArrayBuffer userHandle();
}
