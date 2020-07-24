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
public interface PositionOptions {
  @JsOverlay
  @Nonnull
  static PositionOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isEnableHighAccuracy();

  @JsProperty
  void setEnableHighAccuracy(boolean enableHighAccuracy);

  @JsOverlay
  @Nonnull
  default PositionOptions enableHighAccuracy(final boolean enableHighAccuracy) {
    setEnableHighAccuracy( enableHighAccuracy );
    return this;
  }

  @JsProperty
  int getMaximumAge();

  @JsProperty
  void setMaximumAge(int maximumAge);

  @JsOverlay
  @Nonnull
  default PositionOptions maximumAge(final int maximumAge) {
    setMaximumAge( maximumAge );
    return this;
  }

  @JsProperty
  int getTimeout();

  @JsProperty
  void setTimeout(int timeout);

  @JsOverlay
  @Nonnull
  default PositionOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }
}
