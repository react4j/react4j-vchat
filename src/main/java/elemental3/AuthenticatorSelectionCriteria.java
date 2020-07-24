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
public interface AuthenticatorSelectionCriteria {
  @JsOverlay
  @Nonnull
  static AuthenticatorSelectionCriteria create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getAuthenticatorAttachment();

  @JsProperty
  void setAuthenticatorAttachment(@Nonnull String authenticatorAttachment);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria authenticatorAttachment(
      @Nonnull final String authenticatorAttachment) {
    setAuthenticatorAttachment( authenticatorAttachment );
    return this;
  }

  @JsProperty
  boolean isRequireResidentKey();

  @JsProperty
  void setRequireResidentKey(boolean requireResidentKey);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria requireResidentKey(final boolean requireResidentKey) {
    setRequireResidentKey( requireResidentKey );
    return this;
  }

  @JsProperty
  String getUserVerification();

  @JsProperty
  void setUserVerification(@Nonnull String userVerification);

  @JsOverlay
  @Nonnull
  default AuthenticatorSelectionCriteria userVerification(@Nonnull final String userVerification) {
    setUserVerification( userVerification );
    return this;
  }
}
