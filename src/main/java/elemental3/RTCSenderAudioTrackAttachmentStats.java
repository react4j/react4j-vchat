package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCSenderAudioTrackAttachmentStats extends RTCAudioSenderStats {
  @JsOverlay
  @Nonnull
  static RTCSenderAudioTrackAttachmentStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCSenderAudioTrackAttachmentStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats echoReturnLoss(final double echoReturnLoss) {
    setEchoReturnLoss( echoReturnLoss );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats echoReturnLossEnhancement(
      final double echoReturnLossEnhancement) {
    setEchoReturnLossEnhancement( echoReturnLossEnhancement );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats totalSamplesSent(final int totalSamplesSent) {
    setTotalSamplesSent( totalSamplesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats totalSamplesDuration(
      final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats trackIdentifier(
      @Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCSenderAudioTrackAttachmentStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
