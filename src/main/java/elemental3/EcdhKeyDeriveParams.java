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
public interface EcdhKeyDeriveParams extends Algorithm {
  @JsOverlay
  @Nonnull
  static EcdhKeyDeriveParams create(@Nonnull final String name, @Nonnull final CryptoKey public_) {
    return Js.<EcdhKeyDeriveParams>uncheckedCast( JsPropertyMap.of() ).name( name ).public_( public_ );
  }

  @JsProperty(
      name = "public"
  )
  @Nonnull
  CryptoKey public_();

  @JsProperty
  void setPublic(@Nonnull CryptoKey public_);

  @JsOverlay
  @Nonnull
  default EcdhKeyDeriveParams public_(@Nonnull final CryptoKey public_) {
    setPublic( public_ );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EcdhKeyDeriveParams name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
