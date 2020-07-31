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
public interface RTCReceivedRtpStreamStats extends RTCRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCReceivedRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCReceivedRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty
  int getBurstDiscardCount();

  @JsProperty
  void setBurstDiscardCount(int burstDiscardCount);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsProperty
  double getBurstDiscardRate();

  @JsProperty
  void setBurstDiscardRate(double burstDiscardRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsProperty
  int getBurstLossCount();

  @JsProperty
  void setBurstLossCount(int burstLossCount);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsProperty
  double getBurstLossRate();

  @JsProperty
  void setBurstLossRate(double burstLossRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsProperty
  int getBurstPacketsDiscarded();

  @JsProperty
  void setBurstPacketsDiscarded(int burstPacketsDiscarded);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsProperty
  int getBurstPacketsLost();

  @JsProperty
  void setBurstPacketsLost(int burstPacketsLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsProperty
  int getFramesDropped();

  @JsProperty
  void setFramesDropped(int framesDropped);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsProperty
  int getFullFramesLost();

  @JsProperty
  void setFullFramesLost(int fullFramesLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsProperty
  double getGapDiscardRate();

  @JsProperty
  void setGapDiscardRate(double gapDiscardRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsProperty
  double getGapLossRate();

  @JsProperty
  void setGapLossRate(double gapLossRate);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsProperty
  double getJitter();

  @JsProperty
  void setJitter(double jitter);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsProperty
  int getPacketsDiscarded();

  @JsProperty
  void setPacketsDiscarded(int packetsDiscarded);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsProperty
  int getPacketsLost();

  @JsProperty
  void setPacketsLost(int packetsLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsProperty
  int getPacketsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty
  int getPacketsRepaired();

  @JsProperty
  void setPacketsRepaired(int packetsRepaired);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsProperty
  int getPartialFramesLost();

  @JsProperty
  void setPartialFramesLost(int partialFramesLost);

  @JsOverlay
  @Nonnull
  default RTCReceivedRtpStreamStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCReceivedRtpStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}