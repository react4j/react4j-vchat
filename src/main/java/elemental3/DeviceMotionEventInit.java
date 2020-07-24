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
public interface DeviceMotionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static DeviceMotionEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  DeviceMotionEventAccelerationInit getAcceleration();

  @JsProperty
  void setAcceleration(@Nonnull DeviceMotionEventAccelerationInit acceleration);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventInit acceleration(
      @Nonnull final DeviceMotionEventAccelerationInit acceleration) {
    setAcceleration( acceleration );
    return this;
  }

  @JsProperty
  DeviceMotionEventAccelerationInit getAccelerationIncludingGravity();

  @JsProperty
  void setAccelerationIncludingGravity(
      @Nonnull DeviceMotionEventAccelerationInit accelerationIncludingGravity);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventInit accelerationIncludingGravity(
      @Nonnull final DeviceMotionEventAccelerationInit accelerationIncludingGravity) {
    setAccelerationIncludingGravity( accelerationIncludingGravity );
    return this;
  }

  @JsProperty
  double getInterval();

  @JsProperty
  void setInterval(double interval);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventInit interval(final double interval) {
    setInterval( interval );
    return this;
  }

  @JsProperty
  DeviceMotionEventRotationRateInit getRotationRate();

  @JsProperty
  void setRotationRate(@Nonnull DeviceMotionEventRotationRateInit rotationRate);

  @JsOverlay
  @Nonnull
  default DeviceMotionEventInit rotationRate(
      @Nonnull final DeviceMotionEventRotationRateInit rotationRate) {
    setRotationRate( rotationRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceMotionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceMotionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DeviceMotionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
