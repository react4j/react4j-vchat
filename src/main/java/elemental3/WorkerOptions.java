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
public interface WorkerOptions {
  @JsOverlay
  @Nonnull
  static WorkerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getCredentials();

  @JsProperty
  void setCredentials(@Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default WorkerOptions credentials(@Nonnull final String credentials) {
    setCredentials( credentials );
    return this;
  }

  @JsProperty
  String getName();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default WorkerOptions name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty
  String getType();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default WorkerOptions type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
