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
public interface RTCOutboundRtpStreamStats extends RTCSentRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCOutboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind, final int ssrc) {
    return Js.<RTCOutboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc );
  }

  @JsProperty
  double getAverageRtcpInterval();

  @JsProperty
  void setAverageRtcpInterval(double averageRtcpInterval);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats averageRtcpInterval(final double averageRtcpInterval) {
    setAverageRtcpInterval( averageRtcpInterval );
    return this;
  }

  @JsProperty
  int getBytesDiscardedOnSend();

  @JsProperty
  void setBytesDiscardedOnSend(int bytesDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats bytesDiscardedOnSend(final int bytesDiscardedOnSend) {
    setBytesDiscardedOnSend( bytesDiscardedOnSend );
    return this;
  }

  @JsProperty
  String getEncoderImplementation();

  @JsProperty
  void setEncoderImplementation(@Nonnull String encoderImplementation);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats encoderImplementation(
      @Nonnull final String encoderImplementation) {
    setEncoderImplementation( encoderImplementation );
    return this;
  }

  @JsProperty
  int getFecPacketsSent();

  @JsProperty
  void setFecPacketsSent(int fecPacketsSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats fecPacketsSent(final int fecPacketsSent) {
    setFecPacketsSent( fecPacketsSent );
    return this;
  }

  @JsProperty
  int getFirCount();

  @JsProperty
  void setFirCount(int firCount);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats firCount(final int firCount) {
    setFirCount( firCount );
    return this;
  }

  @JsProperty
  int getFrameBitDepth();

  @JsProperty
  void setFrameBitDepth(int frameBitDepth);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats frameBitDepth(final int frameBitDepth) {
    setFrameBitDepth( frameBitDepth );
    return this;
  }

  @JsProperty
  int getFrameHeight();

  @JsProperty
  void setFrameHeight(int frameHeight);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsProperty
  int getFrameWidth();

  @JsProperty
  void setFrameWidth(int frameWidth);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsProperty
  int getFramesDiscardedOnSend();

  @JsProperty
  void setFramesDiscardedOnSend(int framesDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats framesDiscardedOnSend(final int framesDiscardedOnSend) {
    setFramesDiscardedOnSend( framesDiscardedOnSend );
    return this;
  }

  @JsProperty
  int getFramesEncoded();

  @JsProperty
  void setFramesEncoded(int framesEncoded);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats framesEncoded(final int framesEncoded) {
    setFramesEncoded( framesEncoded );
    return this;
  }

  @JsProperty
  double getFramesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsProperty
  int getFramesSent();

  @JsProperty
  void setFramesSent(int framesSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats framesSent(final int framesSent) {
    setFramesSent( framesSent );
    return this;
  }

  @JsProperty
  int getHeaderBytesSent();

  @JsProperty
  void setHeaderBytesSent(int headerBytesSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats headerBytesSent(final int headerBytesSent) {
    setHeaderBytesSent( headerBytesSent );
    return this;
  }

  @JsProperty
  int getHugeFramesSent();

  @JsProperty
  void setHugeFramesSent(int hugeFramesSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats hugeFramesSent(final int hugeFramesSent) {
    setHugeFramesSent( hugeFramesSent );
    return this;
  }

  @JsProperty
  int getKeyFramesEncoded();

  @JsProperty
  void setKeyFramesEncoded(int keyFramesEncoded);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats keyFramesEncoded(final int keyFramesEncoded) {
    setKeyFramesEncoded( keyFramesEncoded );
    return this;
  }

  @JsProperty
  double getLastPacketSentTimestamp();

  @JsProperty
  void setLastPacketSentTimestamp(double lastPacketSentTimestamp);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats lastPacketSentTimestamp(final double lastPacketSentTimestamp) {
    setLastPacketSentTimestamp( lastPacketSentTimestamp );
    return this;
  }

  @JsProperty
  String getMediaSourceId();

  @JsProperty
  void setMediaSourceId(@Nonnull String mediaSourceId);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsProperty
  int getNackCount();

  @JsProperty
  void setNackCount(int nackCount);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats nackCount(final int nackCount) {
    setNackCount( nackCount );
    return this;
  }

  @JsProperty
  int getPacketsDiscardedOnSend();

  @JsProperty
  void setPacketsDiscardedOnSend(int packetsDiscardedOnSend);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats packetsDiscardedOnSend(final int packetsDiscardedOnSend) {
    setPacketsDiscardedOnSend( packetsDiscardedOnSend );
    return this;
  }

  @JsProperty
  JsPropertyMap<Double> getPerDscpPacketsSent();

  @JsProperty
  void setPerDscpPacketsSent(@Nonnull JsPropertyMap<Double> perDscpPacketsSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats perDscpPacketsSent(
      @Nonnull final JsPropertyMap<Double> perDscpPacketsSent) {
    setPerDscpPacketsSent( perDscpPacketsSent );
    return this;
  }

  @JsProperty
  int getPliCount();

  @JsProperty
  void setPliCount(int pliCount);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats pliCount(final int pliCount) {
    setPliCount( pliCount );
    return this;
  }

  @JsProperty
  int getQpSum();

  @JsProperty
  void setQpSum(int qpSum);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats qpSum(final int qpSum) {
    setQpSum( qpSum );
    return this;
  }

  @JsProperty
  JsPropertyMap<Double> getQualityLimitationDurations();

  @JsProperty
  void setQualityLimitationDurations(@Nonnull JsPropertyMap<Double> qualityLimitationDurations);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats qualityLimitationDurations(
      @Nonnull final JsPropertyMap<Double> qualityLimitationDurations) {
    setQualityLimitationDurations( qualityLimitationDurations );
    return this;
  }

  @JsProperty
  String getQualityLimitationReason();

  @JsProperty
  void setQualityLimitationReason(@Nonnull String qualityLimitationReason);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats qualityLimitationReason(
      @Nonnull final String qualityLimitationReason) {
    setQualityLimitationReason( qualityLimitationReason );
    return this;
  }

  @JsProperty
  int getQualityLimitationResolutionChanges();

  @JsProperty
  void setQualityLimitationResolutionChanges(int qualityLimitationResolutionChanges);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats qualityLimitationResolutionChanges(
      final int qualityLimitationResolutionChanges) {
    setQualityLimitationResolutionChanges( qualityLimitationResolutionChanges );
    return this;
  }

  @JsProperty
  String getRemoteId();

  @JsProperty
  void setRemoteId(@Nonnull String remoteId);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats remoteId(@Nonnull final String remoteId) {
    setRemoteId( remoteId );
    return this;
  }

  @JsProperty
  int getRetransmittedBytesSent();

  @JsProperty
  void setRetransmittedBytesSent(int retransmittedBytesSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats retransmittedBytesSent(final int retransmittedBytesSent) {
    setRetransmittedBytesSent( retransmittedBytesSent );
    return this;
  }

  @JsProperty
  int getRetransmittedPacketsSent();

  @JsProperty
  void setRetransmittedPacketsSent(int retransmittedPacketsSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats retransmittedPacketsSent(final int retransmittedPacketsSent) {
    setRetransmittedPacketsSent( retransmittedPacketsSent );
    return this;
  }

  @JsProperty
  String getRid();

  @JsProperty
  void setRid(@Nonnull String rid);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats rid(@Nonnull final String rid) {
    setRid( rid );
    return this;
  }

  @JsProperty
  int getRtxSsrc();

  @JsProperty
  void setRtxSsrc(int rtxSsrc);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats rtxSsrc(final int rtxSsrc) {
    setRtxSsrc( rtxSsrc );
    return this;
  }

  @JsProperty
  int getSamplesEncodedWithCelt();

  @JsProperty
  void setSamplesEncodedWithCelt(int samplesEncodedWithCelt);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats samplesEncodedWithCelt(final int samplesEncodedWithCelt) {
    setSamplesEncodedWithCelt( samplesEncodedWithCelt );
    return this;
  }

  @JsProperty
  int getSamplesEncodedWithSilk();

  @JsProperty
  void setSamplesEncodedWithSilk(int samplesEncodedWithSilk);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats samplesEncodedWithSilk(final int samplesEncodedWithSilk) {
    setSamplesEncodedWithSilk( samplesEncodedWithSilk );
    return this;
  }

  @JsProperty
  String getSenderId();

  @JsProperty
  void setSenderId(@Nonnull String senderId);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats senderId(@Nonnull final String senderId) {
    setSenderId( senderId );
    return this;
  }

  @JsProperty
  int getSliCount();

  @JsProperty
  void setSliCount(int sliCount);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats sliCount(final int sliCount) {
    setSliCount( sliCount );
    return this;
  }

  @JsProperty
  double getTargetBitrate();

  @JsProperty
  void setTargetBitrate(double targetBitrate);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats targetBitrate(final double targetBitrate) {
    setTargetBitrate( targetBitrate );
    return this;
  }

  @JsProperty
  double getTotalEncodeTime();

  @JsProperty
  void setTotalEncodeTime(double totalEncodeTime);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats totalEncodeTime(final double totalEncodeTime) {
    setTotalEncodeTime( totalEncodeTime );
    return this;
  }

  @JsProperty
  int getTotalEncodedBytesTarget();

  @JsProperty
  void setTotalEncodedBytesTarget(int totalEncodedBytesTarget);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats totalEncodedBytesTarget(final int totalEncodedBytesTarget) {
    setTotalEncodedBytesTarget( totalEncodedBytesTarget );
    return this;
  }

  @JsProperty
  double getTotalPacketSendDelay();

  @JsProperty
  void setTotalPacketSendDelay(double totalPacketSendDelay);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats totalPacketSendDelay(final double totalPacketSendDelay) {
    setTotalPacketSendDelay( totalPacketSendDelay );
    return this;
  }

  @JsProperty
  int getTotalSamplesSent();

  @JsProperty
  void setTotalSamplesSent(int totalSamplesSent);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats totalSamplesSent(final int totalSamplesSent) {
    setTotalSamplesSent( totalSamplesSent );
    return this;
  }

  @JsProperty
  boolean isVoiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsProperty
  String getTrackId();

  @JsProperty
  void setTrackId(@Nonnull String trackId);

  @JsOverlay
  @Nonnull
  default RTCOutboundRtpStreamStats trackId(@Nonnull final String trackId) {
    setTrackId( trackId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCOutboundRtpStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
