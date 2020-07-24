package elemental3;

import elemental2.core.JsArray;
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
public interface ConstrainDOMStringParameters {
  @JsOverlay
  @Nonnull
  static ConstrainDOMStringParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  StringOrStringArrayUnion getExact();

  @JsProperty
  void setExact(@Nonnull StringOrStringArrayUnion exact);

  @JsOverlay
  default void setExact(@Nonnull final String exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final String exact) {
    setExact( exact );
    return this;
  }

  @JsOverlay
  default void setExact(@Nonnull final JsArray<String> exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final JsArray<String> exact) {
    setExact( exact );
    return this;
  }

  @JsOverlay
  default void setExact(@Nonnull final String... exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final String... exact) {
    setExact( exact );
    return this;
  }

  @JsProperty
  StringOrStringArrayUnion getIdeal();

  @JsProperty
  void setIdeal(@Nonnull StringOrStringArrayUnion ideal);

  @JsOverlay
  default void setIdeal(@Nonnull final String ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final String ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  default void setIdeal(@Nonnull final JsArray<String> ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final JsArray<String> ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  default void setIdeal(@Nonnull final String... ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final String... ideal) {
    setIdeal( ideal );
    return this;
  }
}
