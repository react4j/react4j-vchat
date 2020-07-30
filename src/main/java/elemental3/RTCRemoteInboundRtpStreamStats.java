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
public interface RTCRemoteInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCRemoteInboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCRemoteInboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty
  double getFractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats fractionLost(final double fractionLost) {
    setFractionLost( fractionLost );
    return this;
  }

  @JsProperty
  String getLocalId();

  @JsProperty
  void setLocalId(@Nonnull String localId);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats localId(@Nonnull final String localId) {
    setLocalId( localId );
    return this;
  }

  @JsProperty
  int getReportsReceived();

  @JsProperty
  void setReportsReceived(int reportsReceived);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats reportsReceived(final int reportsReceived) {
    setReportsReceived( reportsReceived );
    return this;
  }

  @JsProperty
  double getRoundTripTime();

  @JsProperty
  void setRoundTripTime(double roundTripTime);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats roundTripTime(final double roundTripTime) {
    setRoundTripTime( roundTripTime );
    return this;
  }

  @JsProperty
  int getRoundTripTimeMeasurements();

  @JsProperty
  void setRoundTripTimeMeasurements(int roundTripTimeMeasurements);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats roundTripTimeMeasurements(
      final int roundTripTimeMeasurements) {
    setRoundTripTimeMeasurements( roundTripTimeMeasurements );
    return this;
  }

  @JsProperty
  double getTotalRoundTripTime();

  @JsProperty
  void setTotalRoundTripTime(double totalRoundTripTime);

  @JsOverlay
  @Nonnull
  default RTCRemoteInboundRtpStreamStats totalRoundTripTime(final double totalRoundTripTime) {
    setTotalRoundTripTime( totalRoundTripTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRemoteInboundRtpStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
