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
public interface RTCAudioReceiverStats extends RTCAudioHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCAudioReceiverStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCAudioReceiverStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty
  int getConcealedSamples();

  @JsProperty
  void setConcealedSamples(int concealedSamples);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats concealedSamples(final int concealedSamples) {
    setConcealedSamples( concealedSamples );
    return this;
  }

  @JsProperty
  int getConcealmentEvents();

  @JsProperty
  void setConcealmentEvents(int concealmentEvents);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats concealmentEvents(final int concealmentEvents) {
    setConcealmentEvents( concealmentEvents );
    return this;
  }

  @JsProperty
  double getEstimatedPlayoutTimestamp();

  @JsProperty
  void setEstimatedPlayoutTimestamp(double estimatedPlayoutTimestamp);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats estimatedPlayoutTimestamp(final double estimatedPlayoutTimestamp) {
    setEstimatedPlayoutTimestamp( estimatedPlayoutTimestamp );
    return this;
  }

  @JsProperty
  int getInsertedSamplesForDeceleration();

  @JsProperty
  void setInsertedSamplesForDeceleration(int insertedSamplesForDeceleration);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats insertedSamplesForDeceleration(
      final int insertedSamplesForDeceleration) {
    setInsertedSamplesForDeceleration( insertedSamplesForDeceleration );
    return this;
  }

  @JsProperty
  double getJitterBufferDelay();

  @JsProperty
  void setJitterBufferDelay(double jitterBufferDelay);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats jitterBufferDelay(final double jitterBufferDelay) {
    setJitterBufferDelay( jitterBufferDelay );
    return this;
  }

  @JsProperty
  int getJitterBufferEmittedCount();

  @JsProperty
  void setJitterBufferEmittedCount(int jitterBufferEmittedCount);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats jitterBufferEmittedCount(final int jitterBufferEmittedCount) {
    setJitterBufferEmittedCount( jitterBufferEmittedCount );
    return this;
  }

  @JsProperty
  int getRemovedSamplesForAcceleration();

  @JsProperty
  void setRemovedSamplesForAcceleration(int removedSamplesForAcceleration);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats removedSamplesForAcceleration(
      final int removedSamplesForAcceleration) {
    setRemovedSamplesForAcceleration( removedSamplesForAcceleration );
    return this;
  }

  @JsProperty
  int getSilentConcealedSamples();

  @JsProperty
  void setSilentConcealedSamples(int silentConcealedSamples);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats silentConcealedSamples(final int silentConcealedSamples) {
    setSilentConcealedSamples( silentConcealedSamples );
    return this;
  }

  @JsProperty
  int getTotalSamplesReceived();

  @JsProperty
  void setTotalSamplesReceived(int totalSamplesReceived);

  @JsOverlay
  @Nonnull
  default RTCAudioReceiverStats totalSamplesReceived(final int totalSamplesReceived) {
    setTotalSamplesReceived( totalSamplesReceived );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioReceiverStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
