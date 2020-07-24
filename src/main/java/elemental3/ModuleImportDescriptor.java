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
public interface ModuleImportDescriptor {
  @JsOverlay
  @Nonnull
  static ModuleImportDescriptor create(@Nonnull final String kind, @Nonnull final String module,
      @Nonnull final String name) {
    return Js.<ModuleImportDescriptor>uncheckedCast( JsPropertyMap.of() ).kind( kind ).module( module ).name( name );
  }

  @JsProperty
  @Nonnull
  String getKind();

  @JsProperty
  void setKind(@Nonnull String kind);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsProperty
  @Nonnull
  String getModule();

  @JsProperty
  void setModule(@Nonnull String module);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor module(@Nonnull final String module) {
    setModule( module );
    return this;
  }

  @JsProperty
  @Nonnull
  String getName();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
