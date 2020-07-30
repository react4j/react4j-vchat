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
public interface RTCRtpTransceiverInit {
  @JsOverlay
  @Nonnull
  static RTCRtpTransceiverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getDirection();

  @JsProperty
  void setDirection(@Nonnull String direction);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit direction(@Nonnull final String direction) {
    setDirection( direction );
    return this;
  }

  @JsProperty
  JsArray<RTCRtpEncodingParameters> getSendEncodings();

  @JsProperty
  void setSendEncodings(@Nonnull JsArray<RTCRtpEncodingParameters> sendEncodings);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit sendEncodings(
      @Nonnull final JsArray<RTCRtpEncodingParameters> sendEncodings) {
    setSendEncodings( sendEncodings );
    return this;
  }

  @JsOverlay
  default void setSendEncodings(@Nonnull final RTCRtpEncodingParameters... sendEncodings) {
    setSendEncodings( JsArray.asJsArray( sendEncodings ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit sendEncodings(
      @Nonnull final RTCRtpEncodingParameters... sendEncodings) {
    setSendEncodings( sendEncodings );
    return this;
  }

  @JsProperty
  JsArray<MediaStream> getStreams();

  @JsProperty
  void setStreams(@Nonnull JsArray<MediaStream> streams);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit streams(@Nonnull final JsArray<MediaStream> streams) {
    setStreams( streams );
    return this;
  }

  @JsOverlay
  default void setStreams(@Nonnull final MediaStream... streams) {
    setStreams( JsArray.asJsArray( streams ) );
  }

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverInit streams(@Nonnull final MediaStream... streams) {
    setStreams( streams );
    return this;
  }
}
