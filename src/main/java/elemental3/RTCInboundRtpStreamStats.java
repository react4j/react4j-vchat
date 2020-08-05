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
 * The WebRTC API's RTCInboundRtpStreamStats dictionary, based upon RTCReceivedRtpStreamStats and RTCStats, contains statistics related to the receiving end of an RTP stream on the local end of the RTCPeerConnection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCInboundRtpStreamStats">RTCInboundRtpStreamStats - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCInboundRtpStreamStats extends RTCReceivedRtpStreamStats {
  @JsOverlay
  @Nonnull
  static RTCInboundRtpStreamStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind, final int ssrc,
      @Nonnull final String receiverId) {
    return Js.<RTCInboundRtpStreamStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).ssrc( ssrc ).receiverId( receiverId );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsProperty(
      name = "averageRtcpInterval"
  )
  double averageRtcpInterval();

  @JsProperty
  void setAverageRtcpInterval(double averageRtcpInterval);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats averageRtcpInterval(final double averageRtcpInterval) {
    setAverageRtcpInterval( averageRtcpInterval );
    return this;
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty(
      name = "concealedSamples"
  )
  int concealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats concealedSamples(final int concealedSamples) {
    setConcealedSamples( concealedSamples );
    return this;
  }

  @JsProperty(
      name = "concealmentEvents"
  )
  int concealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats concealmentEvents(final int concealmentEvents) {
    setConcealmentEvents( concealmentEvents );
    return this;
  }

  @JsProperty(
      name = "decoderImplementation"
  )
  String decoderImplementation();

  @JsProperty
  void setDecoderImplementation(@Nonnull String decoderImplementation);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats decoderImplementation(
      @Nonnull final String decoderImplementation) {
    setDecoderImplementation( decoderImplementation );
    return this;
  }

  @JsProperty(
      name = "estimatedPlayoutTimestamp"
  )
  double estimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats estimatedPlayoutTimestamp(
      final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsProperty(
      name = "fecPacketsDiscarded"
  )
  int fecPacketsDiscarded();

  @JsProperty
  void setFecPacketsDiscarded(int fecPacketsDiscarded);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fecPacketsDiscarded(final int fecPacketsDiscarded) {
    setFecPacketsDiscarded( fecPacketsDiscarded );
    return this;
  }

  @JsProperty(
      name = "fecPacketsReceived"
  )
  int fecPacketsReceived();

  @JsProperty
  void setFecPacketsReceived(int fecPacketsReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fecPacketsReceived(final int fecPacketsReceived) {
    setFecPacketsReceived( fecPacketsReceived );
    return this;
  }

  @JsProperty(
      name = "firCount"
  )
  int firCount();

  @JsProperty
  void setFirCount(int firCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats firCount(final int firCount) {
    setFirCount( firCount );
    return this;
  }

  @JsProperty(
      name = "frameBitDepth"
  )
  int frameBitDepth();

  @JsProperty
  void setFrameBitDepth(int frameBitDepth);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameBitDepth(final int frameBitDepth) {
    setFrameBitDepth( frameBitDepth );
    return this;
  }

  @JsProperty(
      name = "frameHeight"
  )
  int frameHeight();

  @JsProperty
  void setFrameHeight(int frameHeight);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameHeight(final int frameHeight) {
    setFrameHeight( frameHeight );
    return this;
  }

  @JsProperty(
      name = "frameWidth"
  )
  int frameWidth();

  @JsProperty
  void setFrameWidth(int frameWidth);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats frameWidth(final int frameWidth) {
    setFrameWidth( frameWidth );
    return this;
  }

  @JsProperty(
      name = "framesDecoded"
  )
  int framesDecoded();

  @JsProperty
  void setFramesDecoded(int framesDecoded);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesDecoded(final int framesDecoded) {
    setFramesDecoded( framesDecoded );
    return this;
  }

  @JsProperty(
      name = "framesPerSecond"
  )
  double framesPerSecond();

  @JsProperty
  void setFramesPerSecond(double framesPerSecond);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesPerSecond(final double framesPerSecond) {
    setFramesPerSecond( framesPerSecond );
    return this;
  }

  @JsProperty(
      name = "framesReceived"
  )
  int framesReceived();

  @JsProperty
  void setFramesReceived(int framesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats framesReceived(final int framesReceived) {
    setFramesReceived( framesReceived );
    return this;
  }

  @JsProperty(
      name = "headerBytesReceived"
  )
  int headerBytesReceived();

  @JsProperty
  void setHeaderBytesReceived(int headerBytesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats headerBytesReceived(final int headerBytesReceived) {
    setHeaderBytesReceived( headerBytesReceived );
    return this;
  }

  @JsProperty(
      name = "insertedSamplesForDeceleration"
  )
  int insertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats insertedSamplesForDeceleration(
      final int insertedSamplesForDeceleration) {
    setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
    return this;
  }

  @JsProperty(
      name = "jitterBufferDelay"
  )
  double jitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsProperty(
      name = "jitterBufferEmittedCount"
  )
  int jitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty(
      name = "keyFramesDecoded"
  )
  int keyFramesDecoded();

  @JsProperty
  void setKeyFramesDecoded(int keyFramesDecoded);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats keyFramesDecoded(final int keyFramesDecoded) {
    setKeyFramesDecoded( keyFramesDecoded );
    return this;
  }

  @JsProperty(
      name = "lastPacketReceivedTimestamp"
  )
  double lastPacketReceivedTimestamp();

  @JsProperty
  void setLastPacketReceivedTimestamp(double lastPacketReceivedTimestamp);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats lastPacketReceivedTimestamp(
      final double lastPacketReceivedTimestamp) {
    setLastPacketReceivedTimestamp( lastPacketReceivedTimestamp );
    return this;
  }

  @JsProperty(
      name = "nackCount"
  )
  int nackCount();

  @JsProperty
  void setNackCount(int nackCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats nackCount(final int nackCount) {
    setNackCount( nackCount );
    return this;
  }

  @JsProperty(
      name = "packetsDuplicated"
  )
  int packetsDuplicated();

  @JsProperty
  void setPacketsDuplicated(int packetsDuplicated);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats packetsDuplicated(final int packetsDuplicated) {
    setPacketsDuplicated( packetsDuplicated );
    return this;
  }

  @JsProperty(
      name = "packetsFailedDecryption"
  )
  int packetsFailedDecryption();

  @JsProperty
  void setPacketsFailedDecryption(int packetsFailedDecryption);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats packetsFailedDecryption(final int packetsFailedDecryption) {
    setPacketsFailedDecryption( packetsFailedDecryption );
    return this;
  }

  @JsProperty(
      name = "perDscpPacketsReceived"
  )
  JsPropertyMap<Double> perDscpPacketsReceived();

  @JsProperty
  void setPerDscpPacketsReceived(@Nonnull JsPropertyMap<Double> perDscpPacketsReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats perDscpPacketsReceived(
      @Nonnull final JsPropertyMap<Double> perDscpPacketsReceived) {
    setPerDscpPacketsReceived( perDscpPacketsReceived );
    return this;
  }

  @JsProperty(
      name = "pliCount"
  )
  int pliCount();

  @JsProperty
  void setPliCount(int pliCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats pliCount(final int pliCount) {
    setPliCount( pliCount );
    return this;
  }

  @JsProperty(
      name = "qpSum"
  )
  int qpSum();

  @JsProperty
  void setQpSum(int qpSum);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats qpSum(final int qpSum) {
    setQpSum( qpSum );
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
  default RTCInboundRtpStreamStats receiverId(@Nonnull final String receiverId) {
    setReceiverId( receiverId );
    return this;
  }

  @JsProperty(
      name = "remoteId"
  )
  String remoteId();

  @JsProperty
  void setRemoteId(@Nonnull String remoteId);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats remoteId(@Nonnull final String remoteId) {
    setRemoteId( remoteId );
    return this;
  }

  @JsProperty(
      name = "removedSamplesForAcceleration"
  )
  int removedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats removedSamplesForAcceleration(
      final int removedSamplesForAcceleration) {
    setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
    return this;
  }

  @JsProperty(
      name = "samplesDecodedWithCelt"
  )
  int samplesDecodedWithCelt();

  @JsProperty
  void setSamplesDecodedWithCelt(int samplesDecodedWithCelt);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats samplesDecodedWithCelt(final int samplesDecodedWithCelt) {
    setSamplesDecodedWithCelt( samplesDecodedWithCelt );
    return this;
  }

  @JsProperty(
      name = "samplesDecodedWithSilk"
  )
  int samplesDecodedWithSilk();

  @JsProperty
  void setSamplesDecodedWithSilk(int samplesDecodedWithSilk);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats samplesDecodedWithSilk(final int samplesDecodedWithSilk) {
    setSamplesDecodedWithSilk( samplesDecodedWithSilk );
    return this;
  }

  @JsProperty(
      name = "silentConcealedSamples"
  )
  int silentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats silentConcealedSamples(final int silentConcealedSamples) {
    setSilentConcealedSamples( silentConcealedSamples );
    return this;
  }

  @JsProperty(
      name = "sliCount"
  )
  int sliCount();

  @JsProperty
  void setSliCount(int sliCount);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats sliCount(final int sliCount) {
    setSliCount( sliCount );
    return this;
  }

  @JsProperty(
      name = "totalAudioEnergy"
  )
  double totalAudioEnergy();

  @JsProperty
  void setTotalAudioEnergy(double totalAudioEnergy);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsProperty(
      name = "totalDecodeTime"
  )
  double totalDecodeTime();

  @JsProperty
  void setTotalDecodeTime(double totalDecodeTime);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalDecodeTime(final double totalDecodeTime) {
    setTotalDecodeTime( totalDecodeTime );
    return this;
  }

  @JsProperty(
      name = "totalInterFrameDelay"
  )
  double totalInterFrameDelay();

  @JsProperty
  void setTotalInterFrameDelay(double totalInterFrameDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalInterFrameDelay(final double totalInterFrameDelay) {
    setTotalInterFrameDelay( totalInterFrameDelay );
    return this;
  }

  @JsProperty(
      name = "totalSamplesDuration"
  )
  double totalSamplesDuration();

  @JsProperty
  void setTotalSamplesDuration(double totalSamplesDuration);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsProperty(
      name = "totalSamplesReceived"
  )
  int totalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSamplesReceived(final int totalSamplesReceived) {
    setTotalSamplesReceived( totalSamplesReceived );
    return this;
  }

  @JsProperty(
      name = "totalSquaredInterFrameDelay"
  )
  double totalSquaredInterFrameDelay();

  @JsProperty
  void setTotalSquaredInterFrameDelay(double totalSquaredInterFrameDelay);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats totalSquaredInterFrameDelay(
      final double totalSquaredInterFrameDelay) {
    setTotalSquaredInterFrameDelay( totalSquaredInterFrameDelay );
    return this;
  }

  @JsProperty(
      name = "voiceActivityFlag"
  )
  boolean voiceActivityFlag();

  @JsProperty
  void setVoiceActivityFlag(boolean voiceActivityFlag);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsProperty(
      name = "fractionLost"
  )
  double fractionLost();

  @JsProperty
  void setFractionLost(double fractionLost);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats fractionLost(final double fractionLost) {
    setFractionLost( fractionLost );
    return this;
  }

  @JsProperty(
      name = "trackId"
  )
  String trackId();

  @JsProperty
  void setTrackId(@Nonnull String trackId);

  @JsOverlay
  @Nonnull
  default RTCInboundRtpStreamStats trackId(@Nonnull final String trackId) {
    setTrackId( trackId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstDiscardCount(final int burstDiscardCount) {
    setBurstDiscardCount( burstDiscardCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstDiscardRate(final double burstDiscardRate) {
    setBurstDiscardRate( burstDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstLossCount(final int burstLossCount) {
    setBurstLossCount( burstLossCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstLossRate(final double burstLossRate) {
    setBurstLossRate( burstLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstPacketsDiscarded(final int burstPacketsDiscarded) {
    setBurstPacketsDiscarded( burstPacketsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats burstPacketsLost(final int burstPacketsLost) {
    setBurstPacketsLost( burstPacketsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats framesDropped(final int framesDropped) {
    setFramesDropped( framesDropped );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats fullFramesLost(final int fullFramesLost) {
    setFullFramesLost( fullFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats gapDiscardRate(final double gapDiscardRate) {
    setGapDiscardRate( gapDiscardRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats gapLossRate(final double gapLossRate) {
    setGapLossRate( gapLossRate );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats jitter(final double jitter) {
    setJitter( jitter );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsDiscarded(final int packetsDiscarded) {
    setPacketsDiscarded( packetsDiscarded );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsLost(final int packetsLost) {
    setPacketsLost( packetsLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats packetsRepaired(final int packetsRepaired) {
    setPacketsRepaired( packetsRepaired );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats partialFramesLost(final int partialFramesLost) {
    setPartialFramesLost( partialFramesLost );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats codecId(@Nonnull final String codecId) {
    setCodecId( codecId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats ssrc(final int ssrc) {
    setSsrc( ssrc );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats averageRTCPInterval(final double averageRTCPInterval) {
    setAverageRTCPInterval( averageRTCPInterval );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats mediaType(@Nonnull final String mediaType) {
    setMediaType( mediaType );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCInboundRtpStreamStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
