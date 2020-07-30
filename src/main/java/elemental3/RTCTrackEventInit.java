package elemental3;

import elemental2.core.JsArray;
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
public interface RTCTrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static RTCTrackEventInit create(@Nonnull final RTCRtpReceiver receiver,
      @Nonnull final MediaStreamTrack track, @Nonnull final RTCRtpTransceiver transceiver) {
    return Js.<RTCTrackEventInit>uncheckedCast( JsPropertyMap.of() ).receiver( receiver ).track( track ).transceiver( transceiver );
  }

  @JsProperty
  @Nonnull
  RTCRtpReceiver getReceiver();

  @JsProperty
  void setReceiver(@Nonnull RTCRtpReceiver receiver);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit receiver(@Nonnull final RTCRtpReceiver receiver) {
    setReceiver( receiver );
    return this;
  }

  @JsProperty
  JsArray<MediaStream> getStreams();

  @JsProperty
  void setStreams(@Nonnull JsArray<MediaStream> streams);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit streams(@Nonnull final JsArray<MediaStream> streams) {
    setStreams( streams );
    return this;
  }

  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( JsArray.asJsArray( streams ) );
  }

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit streams(@Nonnull final MediaStream... streams) {
    setStreams( streams );
    return this;
  }

  @JsProperty
  @Nonnull
  MediaStreamTrack getTrack();

  @JsProperty
  void setTrack(@Nonnull MediaStreamTrack track);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit track(@Nonnull final MediaStreamTrack track) {
    setTrack( track );
    return this;
  }

  @JsProperty
  @Nonnull
  RTCRtpTransceiver getTransceiver();

  @JsProperty
  void setTransceiver(@Nonnull RTCRtpTransceiver transceiver);

  @JsOverlay
  @Nonnull
  default RTCTrackEventInit transceiver(@Nonnull final RTCRtpTransceiver transceiver) {
    setTransceiver( transceiver );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCTrackEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
