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
public interface RTCAudioSourceStats extends RTCMediaSourceStats {
  @JsOverlay
  @Nonnull
  static RTCAudioSourceStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind,
      @Nonnull final String trackIdentifier) {
    return Js.<RTCAudioSourceStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind ).trackIdentifier( trackIdentifier );
  }

  @JsProperty
  double getAudioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCAudioSourceStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsProperty
  double getEchoReturnLoss();

  @JsProperty
  void setEchoReturnLoss(double echoReturnLoss);

  @JsOverlay
  @Nonnull
  default RTCAudioSourceStats echoReturnLoss(final double echoReturnLoss) {
    setEchoReturnLoss( echoReturnLoss );
    return this;
  }

  @JsProperty
  double getEchoReturnLossEnhancement();

  @JsProperty
  void setEchoReturnLossEnhancement(double echoReturnLossEnhancement);

  @JsOverlay
  @Nonnull
  default RTCAudioSourceStats echoReturnLossEnhancement(final double echoReturnLossEnhancement) {
    setEchoReturnLossEnhancement( echoReturnLossEnhancement );
    return this;
  }

  @JsProperty
  double getTotalAudioEnergy();

  @JsProperty
  void setTotalAudioEnergy(double totalAudioEnergy);

  @JsOverlay
  @Nonnull
  default RTCAudioSourceStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
    return this;
  }

  @JsProperty
  double getTotalSamplesDuration();

  @JsProperty
  void setTotalSamplesDuration(double totalSamplesDuration);

  @JsOverlay
  @Nonnull
  default RTCAudioSourceStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats relayedSource(final boolean relayedSource) {
    setRelayedSource( relayedSource );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioSourceStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
