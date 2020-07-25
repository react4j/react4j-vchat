package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaDevices"
)
public class MediaDevices extends EventTarget {
  @Nullable
  public EventHandler ondevicechange;

  MediaDevices() {
  }

  @Nonnull
  public native Promise<JsArray<MediaDeviceInfo>> enumerateDevices();

  @Nonnull
  public native MediaTrackSupportedConstraints getSupportedConstraints();

  @Nonnull
  public native Promise<MediaStream> getUserMedia(@Nonnull MediaStreamConstraints constraints);

  @Nonnull
  public native Promise<MediaStream> getUserMedia();

  @Nonnull
  public native Promise<MediaStream> getDisplayMedia(
      @Nonnull DisplayMediaStreamConstraints constraints);

  @Nonnull
  public native Promise<MediaStream> getDisplayMedia();
}
