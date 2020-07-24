package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRPose"
)
public class XRPose {
  XRPose() {
  }

  @JsProperty(
      name = "emulatedPosition"
  )
  public native boolean emulatedPosition();

  @JsProperty(
      name = "transform"
  )
  @Nonnull
  public native XRRigidTransform transform();
}
