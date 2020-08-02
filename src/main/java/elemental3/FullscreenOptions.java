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
public interface FullscreenOptions {
  @JsOverlay
  @Nonnull
  static FullscreenOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "navigationUI"
  )
  String navigationUI();

  @JsProperty
  void setNavigationUI(@Nonnull String navigationUI);

  @JsOverlay
  @Nonnull
  default FullscreenOptions navigationUI(@Nonnull final String navigationUI) {
    setNavigationUI( navigationUI );
    return this;
  }
}
