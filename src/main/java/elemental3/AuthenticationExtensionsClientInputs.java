package elemental3;

import elemental2.core.JsArray;
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
public interface AuthenticationExtensionsClientInputs {
  @JsOverlay
  @Nonnull
  static AuthenticationExtensionsClientInputs create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getAppid();

  @JsProperty
  void setAppid(@Nonnull String appid);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs appid(@Nonnull final String appid) {
    setAppid( appid );
    return this;
  }

  @JsProperty
  String getTxAuthSimple();

  @JsProperty
  void setTxAuthSimple(@Nonnull String txAuthSimple);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs txAuthSimple(@Nonnull final String txAuthSimple) {
    setTxAuthSimple( txAuthSimple );
    return this;
  }

  @JsProperty
  txAuthGenericArg getTxAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull txAuthGenericArg txAuthGeneric);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs txAuthGeneric(
      @Nonnull final txAuthGenericArg txAuthGeneric) {
    setTxAuthGeneric( txAuthGeneric );
    return this;
  }

  @JsProperty
  JsArray<BufferSource> getAuthnSel();

  @JsProperty
  void setAuthnSel(@Nonnull JsArray<BufferSource> authnSel);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs authnSel(
      @Nonnull final JsArray<BufferSource> authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsOverlay
  default void setAuthnSel(@Nonnull final BufferSource... authnSel) {
    setAuthnSel( JsArray.asJsArray( authnSel ) );
  }

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs authnSel(@Nonnull final BufferSource... authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsProperty
  boolean isExts();

  @JsProperty
  void setExts(boolean exts);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs exts(final boolean exts) {
    setExts( exts );
    return this;
  }

  @JsProperty
  boolean isUvi();

  @JsProperty
  void setUvi(boolean uvi);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs uvi(final boolean uvi) {
    setUvi( uvi );
    return this;
  }

  @JsProperty
  boolean isLoc();

  @JsProperty
  void setLoc(boolean loc);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs loc(final boolean loc) {
    setLoc( loc );
    return this;
  }

  @JsProperty
  boolean isUvm();

  @JsProperty
  void setUvm(boolean uvm);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientInputs uvm(final boolean uvm) {
    setUvm( uvm );
    return this;
  }
}
