package elemental3;

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
public interface RTCRtpTransceiverStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCRtpTransceiverStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String receiverId,
      @Nonnull final String senderId) {
    return Js.<RTCRtpTransceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).receiverId( receiverId ).senderId( senderId );
  }

  @JsProperty(
      name = "mid"
  )
  String mid();

  @JsProperty
  void setMid(@Nonnull String mid);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats mid(@Nonnull final String mid) {
    setMid( mid );
    return this;
  }

  @JsProperty(
      name = "receiverId"
  )
  @Nonnull
  String receiverId();

  @JsProperty
  void setReceiverId(@Nonnull String receiverId);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats receiverId(@Nonnull final String receiverId) {
    setReceiverId( receiverId );
    return this;
  }

  @JsProperty(
      name = "senderId"
  )
  @Nonnull
  String senderId();

  @JsProperty
  void setSenderId(@Nonnull String senderId);

  @JsOverlay
  @Nonnull
  default RTCRtpTransceiverStats senderId(@Nonnull final String senderId) {
    setSenderId( senderId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpTransceiverStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpTransceiverStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpTransceiverStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
