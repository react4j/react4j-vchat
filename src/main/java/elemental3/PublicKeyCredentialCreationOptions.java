package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
public interface PublicKeyCredentialCreationOptions {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final BufferSource challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBufferView challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int8Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int16Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint16Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8ClampedArray challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float32Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float64Array challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final DataView challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBuffer challenge,
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final BufferSource challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBufferView challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int8Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int16Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Int32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint16Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Uint8ClampedArray challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float32Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final Float64Array challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final DataView challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialCreationOptions create(@Nonnull final ArrayBuffer challenge,
      @Nonnull final PublicKeyCredentialParameters[] pubKeyCredParams,
      @Nonnull final PublicKeyCredentialRpEntity rp,
      @Nonnull final PublicKeyCredentialUserEntity user) {
    return Js.<PublicKeyCredentialCreationOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge ).pubKeyCredParams( pubKeyCredParams ).rp( rp ).user( user );
  }

  @JsProperty
  String getAttestation();

  @JsProperty
  void setAttestation(@Nonnull String attestation);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions attestation(@Nonnull final String attestation) {
    setAttestation( attestation );
    return this;
  }

  @JsProperty
  AuthenticatorSelectionCriteria getAuthenticatorSelection();

  @JsProperty
  void setAuthenticatorSelection(@Nonnull AuthenticatorSelectionCriteria authenticatorSelection);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions authenticatorSelection(
      @Nonnull final AuthenticatorSelectionCriteria authenticatorSelection) {
    setAuthenticatorSelection( authenticatorSelection );
    return this;
  }

  @JsProperty
  @Nonnull
  BufferSource getChallenge();

  @JsProperty
  void setChallenge(@Nonnull BufferSource challenge);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final BufferSource challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Int32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Float32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Float32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Float64Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final Float64Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final DataView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final DataView challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions challenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsProperty
  JsArray<PublicKeyCredentialDescriptor> getExcludeCredentials();

  @JsProperty
  void setExcludeCredentials(@Nonnull JsArray<PublicKeyCredentialDescriptor> excludeCredentials);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions excludeCredentials(
      @Nonnull final JsArray<PublicKeyCredentialDescriptor> excludeCredentials) {
    setExcludeCredentials( excludeCredentials );
    return this;
  }

  @JsOverlay
  default void setExcludeCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
    setExcludeCredentials( JsArray.asJsArray( excludeCredentials ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions excludeCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... excludeCredentials) {
    setExcludeCredentials( excludeCredentials );
    return this;
  }

  @JsProperty
  AuthenticationExtensionsClientInputs getExtensions();

  @JsProperty
  void setExtensions(@Nonnull AuthenticationExtensionsClientInputs extensions);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions extensions(
      @Nonnull final AuthenticationExtensionsClientInputs extensions) {
    setExtensions( extensions );
    return this;
  }

  @JsProperty
  @Nonnull
  JsArray<PublicKeyCredentialParameters> getPubKeyCredParams();

  @JsProperty
  void setPubKeyCredParams(@Nonnull JsArray<PublicKeyCredentialParameters> pubKeyCredParams);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions pubKeyCredParams(
      @Nonnull final JsArray<PublicKeyCredentialParameters> pubKeyCredParams) {
    setPubKeyCredParams( pubKeyCredParams );
    return this;
  }

  @JsOverlay
  default void setPubKeyCredParams(
      @Nonnull final PublicKeyCredentialParameters... pubKeyCredParams) {
    setPubKeyCredParams( JsArray.asJsArray( pubKeyCredParams ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions pubKeyCredParams(
      @Nonnull final PublicKeyCredentialParameters... pubKeyCredParams) {
    setPubKeyCredParams( pubKeyCredParams );
    return this;
  }

  @JsProperty
  @Nonnull
  PublicKeyCredentialRpEntity getRp();

  @JsProperty
  void setRp(@Nonnull PublicKeyCredentialRpEntity rp);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions rp(@Nonnull final PublicKeyCredentialRpEntity rp) {
    setRp( rp );
    return this;
  }

  @JsProperty
  int getTimeout();

  @JsProperty
  void setTimeout(int timeout);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }

  @JsProperty
  @Nonnull
  PublicKeyCredentialUserEntity getUser();

  @JsProperty
  void setUser(@Nonnull PublicKeyCredentialUserEntity user);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialCreationOptions user(
      @Nonnull final PublicKeyCredentialUserEntity user) {
    setUser( user );
    return this;
  }
}
