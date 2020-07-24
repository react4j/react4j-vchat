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
public interface PublicKeyCredentialParameters {
  @JsOverlay
  @Nonnull
  static PublicKeyCredentialParameters create(final int alg, @Nonnull final String type) {
    return Js.<PublicKeyCredentialParameters>uncheckedCast( JsPropertyMap.of() ).alg( alg ).type( type );
  }

  @JsProperty
  int getAlg();

  @JsProperty
  void setAlg(int alg);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialParameters alg(final int alg) {
    setAlg( alg );
    return this;
  }

  @JsProperty
  @Nonnull
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default PublicKeyCredentialParameters type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
