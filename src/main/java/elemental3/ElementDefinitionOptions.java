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
public interface ElementDefinitionOptions {
  @JsOverlay
  @Nonnull
  static ElementDefinitionOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "extends"
  )
  String _extends();

  @JsProperty
  void setExtends(@Nonnull String _extends);

  @JsOverlay
  @Nonnull
  default ElementDefinitionOptions _extends(@Nonnull final String _extends) {
    setExtends( _extends );
    return this;
  }
}
