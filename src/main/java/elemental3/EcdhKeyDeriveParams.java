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
  static EcdhKeyDeriveParams create(@Nonnull final String name, @Nonnull final CryptoKey _public) {
    return Js.<EcdhKeyDeriveParams>uncheckedCast( JsPropertyMap.of() ).name( name )._public( _public );
  }

  @JsProperty(
      name = "public"
  )
  @Nonnull
  CryptoKey _public();

  @JsProperty
  void setPublic(@Nonnull CryptoKey _public);

  @JsOverlay
  @Nonnull
  default EcdhKeyDeriveParams _public(@Nonnull final CryptoKey _public) {
    setPublic( _public );
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
