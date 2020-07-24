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
    name = "MediaDeviceInfo"
)
public class MediaDeviceInfo {
  MediaDeviceInfo() {
  }

  @JsProperty(
      name = "deviceId"
  )
  @Nonnull
  public native String deviceId();

  @JsProperty(
      name = "groupId"
  )
  @Nonnull
  public native String groupId();

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @Nonnull
  public native Object toJSON();
}
