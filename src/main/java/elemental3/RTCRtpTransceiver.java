package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCRtpTransceiver"
)
public class RTCRtpTransceiver {
  @Nonnull
  public String direction;

  RTCRtpTransceiver() {
  }

  @JsProperty(
      name = "currentDirection"
  )
  @Nullable
  public native String currentDirection();

  @JsProperty(
      name = "mid"
  )
  @Nullable
  public native String mid();

  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  public native RTCRtpReceiver receiver();

  @JsProperty(
      name = "sender"
  )
  @Nonnull
  public native RTCRtpSender sender();

  public native void setCodecPreferences(@Nonnull JsArray<RTCRtpCodecCapability> codecs);

  public native void setCodecPreferences(@Nonnull RTCRtpCodecCapability[] codecs);

  public native void stop();
}
