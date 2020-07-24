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
public interface CryptoKeyPair {
  @JsOverlay
  @Nonnull
  static CryptoKeyPair create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  CryptoKey getPrivateKey();

  @JsProperty
  void setPrivateKey(@Nonnull CryptoKey privateKey);

  @JsOverlay
  @Nonnull
  default CryptoKeyPair privateKey(@Nonnull final CryptoKey privateKey) {
    setPrivateKey( privateKey );
    return this;
  }

  @JsProperty
  CryptoKey getPublicKey();

  @JsProperty
  void setPublicKey(@Nonnull CryptoKey publicKey);

  @JsOverlay
  @Nonnull
  default CryptoKeyPair publicKey(@Nonnull final CryptoKey publicKey) {
    setPublicKey( publicKey );
    return this;
  }
}
