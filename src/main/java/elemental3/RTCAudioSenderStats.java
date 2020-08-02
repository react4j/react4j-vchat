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
public interface RTCAudioSenderStats extends RTCAudioHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCAudioSenderStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCAudioSenderStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "mediaSourceId"
  )
  String mediaSourceId();

  @JsProperty
  void setMediaSourceId(@Nonnull String mediaSourceId);

  @JsOverlay
  @Nonnull
  default RTCAudioSenderStats mediaSourceId(@Nonnull final String mediaSourceId) {
    setMediaSourceId( mediaSourceId );
    return this;
  }

  @JsProperty(
      name = "echoReturnLoss"
  )
  double echoReturnLoss();

  @JsProperty
  void setEchoReturnLoss(double echoReturnLoss);

  @JsOverlay
  @Nonnull
  default RTCAudioSenderStats echoReturnLoss(final double echoReturnLoss) {
    setEchoReturnLoss( echoReturnLoss );
    return this;
  }

  @JsProperty(
      name = "echoReturnLossEnhancement"
  )
  double echoReturnLossEnhancement();

  @JsProperty
  void setEchoReturnLossEnhancement(double echoReturnLossEnhancement);

  @JsOverlay
  @Nonnull
  default RTCAudioSenderStats echoReturnLossEnhancement(final double echoReturnLossEnhancement) {
    setEchoReturnLossEnhancement( echoReturnLossEnhancement );
    return this;
  }

  @JsProperty(
      name = "totalSamplesSent"
  )
  int totalSamplesSent();

  @JsProperty
  void setTotalSamplesSent(int totalSamplesSent);

  @JsOverlay
  @Nonnull
  default RTCAudioSenderStats totalSamplesSent(final int totalSamplesSent) {
    setTotalSamplesSent( totalSamplesSent );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSenderStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
