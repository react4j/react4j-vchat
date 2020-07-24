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
    name = "AuthenticatorResponse"
)
public class AuthenticatorResponse {
  AuthenticatorResponse() {
  }

  @JsProperty(
      name = "clientDataJSON"
  )
  @Nonnull
  public native ArrayBuffer clientDataJSON();
}
