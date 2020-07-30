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
public interface RTCCodecStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCCodecStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String mimeType, final int payloadType,
      @Nonnull final String transportId) {
    return Js.<RTCCodecStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).mimeType( mimeType ).payloadType( payloadType ).transportId( transportId );
  }

  @JsProperty
  int getChannels();

  @JsProperty
  void setChannels(int channels);

  @JsOverlay
  @Nonnull
  default RTCCodecStats channels(final int channels) {
    setChannels( channels );
    return this;
  }

  @JsProperty
  int getClockRate();

  @JsProperty
  void setClockRate(int clockRate);

  @JsOverlay
  @Nonnull
  default RTCCodecStats clockRate(final int clockRate) {
    setClockRate( clockRate );
    return this;
  }

  @JsProperty
  String getCodecType();

  @JsProperty
  void setCodecType(@Nonnull String codecType);

  @JsOverlay
  @Nonnull
  default RTCCodecStats codecType(@Nonnull final String codecType) {
    setCodecType( codecType );
    return this;
  }

  @JsProperty
  @Nonnull
  String getMimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsOverlay
  @Nonnull
  default RTCCodecStats mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty
  int getPayloadType();

  @JsProperty
  void setPayloadType(int payloadType);

  @JsOverlay
  @Nonnull
  default RTCCodecStats payloadType(final int payloadType) {
    setPayloadType( payloadType );
    return this;
  }

  @JsProperty
  String getSdpFmtpLine();

  @JsProperty
  void setSdpFmtpLine(@Nonnull String sdpFmtpLine);

  @JsOverlay
  @Nonnull
  default RTCCodecStats sdpFmtpLine(@Nonnull final String sdpFmtpLine) {
    setSdpFmtpLine( sdpFmtpLine );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTransportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCCodecStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsProperty
  String getImplementation();

  @JsProperty
  void setImplementation(@Nonnull String implementation);

  @JsOverlay
  @Nonnull
  default RTCCodecStats implementation(@Nonnull final String implementation) {
    setImplementation( implementation );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCCodecStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
