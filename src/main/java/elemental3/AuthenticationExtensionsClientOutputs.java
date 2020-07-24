package elemental3;

import elemental2.core.ArrayBuffer;
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
public interface AuthenticationExtensionsClientOutputs {
  @JsOverlay
  @Nonnull
  static AuthenticationExtensionsClientOutputs create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isAppid();

  @JsProperty
  void setAppid(boolean appid);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs appid(final boolean appid) {
    setAppid( appid );
    return this;
  }

  @JsProperty
  String getTxAuthSimple();

  @JsProperty
  void setTxAuthSimple(@Nonnull String txAuthSimple);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs txAuthSimple(@Nonnull final String txAuthSimple) {
    setTxAuthSimple( txAuthSimple );
    return this;
  }

  @JsProperty
  ArrayBuffer getTxAuthGeneric();

  @JsProperty
  void setTxAuthGeneric(@Nonnull ArrayBuffer txAuthGeneric);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs txAuthGeneric(
      @Nonnull final ArrayBuffer txAuthGeneric) {
    setTxAuthGeneric( txAuthGeneric );
    return this;
  }

  @JsProperty
  boolean isAuthnSel();

  @JsProperty
  void setAuthnSel(boolean authnSel);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs authnSel(final boolean authnSel) {
    setAuthnSel( authnSel );
    return this;
  }

  @JsProperty
  JsArray<String> getExts();

  @JsProperty
  void setExts(@Nonnull JsArray<String> exts);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs exts(@Nonnull final JsArray<String> exts) {
    setExts( exts );
    return this;
  }

  @JsOverlay
  default void setExts(@Nonnull final String... exts) {
    setExts( JsArray.asJsArray( exts ) );
  }

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs exts(@Nonnull final String... exts) {
    setExts( exts );
    return this;
  }

  @JsProperty
  ArrayBuffer getUvi();

  @JsProperty
  void setUvi(@Nonnull ArrayBuffer uvi);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs uvi(@Nonnull final ArrayBuffer uvi) {
    setUvi( uvi );
    return this;
  }

  @JsProperty
  Coordinates getLoc();

  @JsProperty
  void setLoc(@Nonnull Coordinates loc);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs loc(@Nonnull final Coordinates loc) {
    setLoc( loc );
    return this;
  }

  @JsProperty
  JsArray<JsArray<Double>> getUvm();

  @JsProperty
  void setUvm(@Nonnull JsArray<JsArray<Double>> uvm);

  @JsOverlay
  @Nonnull
  default AuthenticationExtensionsClientOutputs uvm(@Nonnull final JsArray<JsArray<Double>> uvm) {
    setUvm( uvm );
    return this;
  }

  @JsOverlay
  @SuppressWarnings("unchecked")
  default void setUvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( JsArray.asJsArray( uvm ) );
  }

  @JsOverlay
  @Nonnull
  @SuppressWarnings("unchecked")
  default AuthenticationExtensionsClientOutputs uvm(@Nonnull final JsArray<Double>... uvm) {
    setUvm( uvm );
    return this;
  }
}
