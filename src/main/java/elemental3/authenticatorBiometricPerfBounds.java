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
public interface authenticatorBiometricPerfBounds {
  @JsOverlay
  @Nonnull
  static authenticatorBiometricPerfBounds create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "FAR"
  )
  float FAR();

  @JsProperty
  void setFAR(float FAR);

  @JsOverlay
  @Nonnull
  default authenticatorBiometricPerfBounds FAR(final float FAR) {
    setFAR( FAR );
    return this;
  }

  @JsProperty(
      name = "FRR"
  )
  float FRR();

  @JsProperty
  void setFRR(float FRR);

  @JsOverlay
  @Nonnull
  default authenticatorBiometricPerfBounds FRR(final float FRR) {
    setFRR( FRR );
    return this;
  }
}
