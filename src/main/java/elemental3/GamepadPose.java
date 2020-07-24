package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GamepadPose"
)
public class GamepadPose {
  GamepadPose() {
  }

  @JsProperty(
      name = "angularAcceleration"
  )
  @Nullable
  public native Float32Array angularAcceleration();

  @JsProperty(
      name = "angularVelocity"
  )
  @Nullable
  public native Float32Array angularVelocity();

  @JsProperty(
      name = "hasOrientation"
  )
  public native boolean hasOrientation();

  @JsProperty(
      name = "hasPosition"
  )
  public native boolean hasPosition();

  @JsProperty(
      name = "linearAcceleration"
  )
  @Nullable
  public native Float32Array linearAcceleration();

  @JsProperty(
      name = "linearVelocity"
  )
  @Nullable
  public native Float32Array linearVelocity();

  @JsProperty(
      name = "orientation"
  )
  @Nullable
  public native Float32Array orientation();

  @JsProperty(
      name = "position"
  )
  @Nullable
  public native Float32Array position();
}
