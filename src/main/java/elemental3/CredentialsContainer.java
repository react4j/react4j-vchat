package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CredentialsContainer"
)
public class CredentialsContainer {
  CredentialsContainer() {
  }

  @Nonnull
  public native Promise<Credential> create(@Nonnull CredentialCreationOptions options);

  @Nonnull
  public native Promise<Credential> create();

  @Nonnull
  public native Promise<Credential> get(@Nonnull CredentialRequestOptions options);

  @Nonnull
  public native Promise<Credential> get();

  @Nonnull
  public native Promise<Void> preventSilentAccess();

  @Nonnull
  public native Promise<Credential> store(@Nonnull Credential credential);
}
