package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The WebRTC statistics model's RTCRemoteOutboundRtpStreamStats dictionary extends the underlying RTCSentRtpStreamStats dictionary with properties measuring metrics specific to outgoing RTP streams.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRemoteOutboundRtpStreamStats">RTCRemoteOutboundRtpStreamStats - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRemoteOutboundRtpStreamStats extends RTCSentRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCRemoteOutboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCRemoteOutboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty(
      name = "localId"
  )
  String localId();

  @JsProperty
  void setLocalId(@Nonnull String localId);

  @JsOverlay
  @Nonnull
  default RTCRemoteOutboundRtpStreamStats localId(@Nonnull final String localId) {
    setLocalId( localId );
    return this;
  }

  @JsProperty(
      name = "remoteTimestamp"
  )
  double remoteTimestamp();

  @JsProperty
  void setRemoteTimestamp(double remoteTimestamp);

  @JsOverlay
  @Nonnull
  default RTCRemoteOutboundRtpStreamStats remoteTimestamp(final double remoteTimestamp) {
    setRemoteTimestamp( remoteTimestamp );
    return this;
  }

  @JsProperty(
      name = "reportsSent"
  )
  int reportsSent();

  @JsProperty
  void setReportsSent(int reportsSent);

  @JsOverlay
  @Nonnull
  default RTCRemoteOutboundRtpStreamStats reportsSent(final int reportsSent) {
    setReportsSent( reportsSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteOutboundRtpStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
