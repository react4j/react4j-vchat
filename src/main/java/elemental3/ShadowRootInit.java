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
public interface ShadowRootInit {
  @JsOverlay
  @Nonnull
  static ShadowRootInit create(@Nonnull final String mode) {
    return Js.<ShadowRootInit>uncheckedCast( JsPropertyMap.of() ).mode( mode );
  }

  @JsProperty(
      name = "delegatesFocus"
  )
  boolean delegatesFocus();

  @JsProperty
  void setDelegatesFocus(boolean delegatesFocus);

  @JsOverlay
  @Nonnull
  default ShadowRootInit delegatesFocus(final boolean delegatesFocus) {
    setDelegatesFocus( delegatesFocus );
    return this;
  }

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  String mode();

  @JsProperty
  void setMode(@Nonnull String mode);

  @JsOverlay
  @Nonnull
  default ShadowRootInit mode(@Nonnull final String mode) {
    setMode( mode );
    return this;
  }
}
