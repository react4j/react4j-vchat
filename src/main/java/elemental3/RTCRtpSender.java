package elemental3;

import elemental2.promise.Promise;
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
    name = "RTCRtpSender"
)
public class RTCRtpSender {
  RTCRtpSender() {
  }

  @JsProperty(
      name = "track"
  )
  @Nullable
  public native MediaStreamTrack track();

  @JsProperty(
      name = "transport"
  )
  @Nullable
  public native RTCDtlsTransport transport();

  @JsProperty(
      name = "dtmf"
  )
  @Nullable
  public native RTCDTMFSender dtmf();

  @Nullable
  public static native RTCRtpCapabilities getCapabilities(@Nonnull String kind);

  @Nonnull
  public native RTCRtpSendParameters getParameters();

  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  @Nonnull
  public native Promise<Void> replaceTrack(@Nullable MediaStreamTrack withTrack);

  @Nonnull
  public native Promise<Void> setParameters(@Nonnull RTCRtpSendParameters parameters);

  public native void setStreams(@Nonnull MediaStream... streams);
}
