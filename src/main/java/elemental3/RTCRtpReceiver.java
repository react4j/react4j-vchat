package elemental3;

import elemental2.core.JsArray;
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
    name = "RTCRtpReceiver"
)
public class RTCRtpReceiver {
  RTCRtpReceiver() {
  }

  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native MediaStreamTrack track();

  @JsProperty(
      name = "transport"
  )
  @Nullable
  public native RTCDtlsTransport transport();

  @Nullable
  public static native RTCRtpCapabilities getCapabilities(@Nonnull String kind);

  @Nonnull
  public native JsArray<RTCRtpContributingSource> getContributingSources();

  @Nonnull
  public native RTCRtpReceiveParameters getParameters();

  @Nonnull
  public native Promise<RTCStatsReport> getStats();

  @Nonnull
  public native JsArray<RTCRtpSynchronizationSource> getSynchronizationSources();
}
