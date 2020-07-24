package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DeviceMotionEventRotationRate"
)
public class DeviceMotionEventRotationRate {
  DeviceMotionEventRotationRate() {
  }

  @JsProperty(
      name = "alpha"
  )
  @Nullable
  public native Double alpha();

  @JsProperty(
      name = "beta"
  )
  @Nullable
  public native Double beta();

  @JsProperty(
      name = "gamma"
  )
  @Nullable
  public native Double gamma();
}
