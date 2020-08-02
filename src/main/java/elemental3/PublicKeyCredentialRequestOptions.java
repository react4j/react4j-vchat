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
public interface PublicKeyCredentialRequestOptions {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final BufferSource challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final ArrayBufferView challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int8Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int16Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Int32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint8Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint16Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Uint8ClampedArray challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Float32Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final Float64Array challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final DataView challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsOverlay
  @Nonnull
  static PublicKeyCredentialRequestOptions create(@Nonnull final ArrayBuffer challenge) {
    return Js.<PublicKeyCredentialRequestOptions>uncheckedCast( JsPropertyMap.of() ).challenge( challenge );
  }

  @JsProperty(
      name = "allowCredentials"
  )
  JsArray<PublicKeyCredentialDescriptor> allowCredentials();

  @JsProperty
  void setAllowCredentials(@Nonnull JsArray<PublicKeyCredentialDescriptor> allowCredentials);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions allowCredentials(
      @Nonnull final JsArray<PublicKeyCredentialDescriptor> allowCredentials) {
    setAllowCredentials( allowCredentials );
    return this;
  }

  @JsOverlay
  default void setAllowCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
    setAllowCredentials( JsArray.asJsArray( allowCredentials ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions allowCredentials(
      @Nonnull final PublicKeyCredentialDescriptor... allowCredentials) {
    setAllowCredentials( allowCredentials );
    return this;
  }

  @JsProperty(
      name = "challenge"
  )
  @Nonnull
  BufferSource challenge();

  @JsProperty
  void setChallenge(@Nonnull BufferSource challenge);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final BufferSource challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final ArrayBufferView challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Int32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Int32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint8Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint8Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint16Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint16Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Uint8ClampedArray challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Float32Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Float32Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final Float64Array challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final Float64Array challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final DataView challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final DataView challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsOverlay
  default void setChallenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( BufferSource.of( challenge ) );
  }

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions challenge(@Nonnull final ArrayBuffer challenge) {
    setChallenge( challenge );
    return this;
  }

  @JsProperty(
      name = "extensions"
  )
  AuthenticationExtensionsClientInputs extensions();

  @JsProperty
  void setExtensions(@Nonnull AuthenticationExtensionsClientInputs extensions);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions extensions(
      @Nonnull final AuthenticationExtensionsClientInputs extensions) {
    setExtensions( extensions );
    return this;
  }

  @JsProperty(
      name = "rpId"
  )
  String rpId();

  @JsProperty
  void setRpId(@Nonnull String rpId);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions rpId(@Nonnull final String rpId) {
    setRpId( rpId );
    return this;
  }

  @JsProperty(
      name = "timeout"
  )
  int timeout();

  @JsProperty
  void setTimeout(int timeout);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }

  @JsProperty(
      name = "userVerification"
  )
  String userVerification();

  @JsProperty
  void setUserVerification(@Nonnull String userVerification);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialRequestOptions userVerification(
      @Nonnull final String userVerification) {
    setUserVerification( userVerification );
    return this;
  }
}
