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
public interface ConstrainBooleanParameters {
  @JsOverlay
  @Nonnull
  static ConstrainBooleanParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isExact();

  @JsProperty
  void setExact(boolean exact);

  @JsOverlay
  @Nonnull
  default ConstrainBooleanParameters exact(final boolean exact) {
    setExact( exact );
    return this;
  }

  @JsProperty
  boolean isIdeal();

  @JsProperty
  void setIdeal(boolean ideal);

  @JsOverlay
  @Nonnull
  default ConstrainBooleanParameters ideal(final boolean ideal) {
    setIdeal( ideal );
    return this;
  }
}
