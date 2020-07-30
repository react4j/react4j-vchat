package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCTrackEvent"
)
public class RTCTrackEvent extends Event {
  public RTCTrackEvent(@Nonnull final String type, @Nonnull final RTCTrackEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "receiver"
  )
  @Nonnull
  public native RTCRtpReceiver receiver();

  @JsProperty(
      name = "streams"
  )
  @Nonnull
  public native JsArray<MediaStream> streams();

  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native MediaStreamTrack track();

  @JsProperty(
      name = "transceiver"
  )
  @Nonnull
  public native RTCRtpTransceiver transceiver();
}
