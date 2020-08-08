package elemental3;

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
    name = "FederatedCredential"
)
public class FederatedCredential extends Credential {
  public FederatedCredential(@Nonnull final FederatedCredentialInit data) {
  }

  @JsProperty(
      name = "protocol"
  )
  @Nullable
  public native String protocol();

  @JsProperty(
      name = "provider"
  )
  @Nonnull
  public native String provider();

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
