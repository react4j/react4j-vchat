package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface CustomEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static CustomEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  @Nullable
  Any getDetail();

  @JsProperty
  void setDetail(@Nullable Any detail);

  @JsOverlay
  @Nonnull
  default CustomEventInit detail(@Nullable final Any detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CustomEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CustomEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CustomEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
