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
public interface RegistrationOptions {
  @JsOverlay
  @Nonnull
  static RegistrationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getScope();

  @JsProperty
  void setScope(@Nonnull String scope);

  @JsOverlay
  @Nonnull
  default RegistrationOptions scope(@Nonnull final String scope) {
    setScope( scope );
    return this;
  }

  @JsProperty
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default RegistrationOptions type(@Nonnull final String type) {
    setType( type );
    return this;
  }

  @JsProperty
  String getUpdateViaCache();

  @JsProperty
  void setUpdateViaCache(@Nonnull String updateViaCache);

  @JsOverlay
  @Nonnull
  default RegistrationOptions updateViaCache(@Nonnull final String updateViaCache) {
    setUpdateViaCache( updateViaCache );
    return this;
  }
}
