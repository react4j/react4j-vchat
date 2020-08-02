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
public interface WorkletOptions {
  @JsOverlay
  @Nonnull
  static WorkletOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "credentials"
  )
  String credentials();

  @JsProperty
  void setCredentials(@Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default WorkletOptions credentials(@Nonnull final String credentials) {
    setCredentials( credentials );
    return this;
  }
}
