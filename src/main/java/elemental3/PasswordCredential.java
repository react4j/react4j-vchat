package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PasswordCredential"
)
public class PasswordCredential extends Credential {
  PasswordCredential() {
  }

  @JsProperty(
      name = "password"
  )
  @Nonnull
  public native String password();

  @JsProperty(
      name = "iconURL"
  )
  @Nonnull
  public native String iconURL();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
