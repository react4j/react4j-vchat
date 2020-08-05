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
public interface RTCAudioHandlerStats extends RTCMediaHandlerStats {
  @JsOverlay
  @Nonnull
  static RTCAudioHandlerStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String kind) {
    return Js.<RTCAudioHandlerStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).kind( kind );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCAudioHandlerStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
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
  default RTCAudioHandlerStats totalAudioEnergy(final double totalAudioEnergy) {
    setTotalAudioEnergy( totalAudioEnergy );
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
  default RTCAudioHandlerStats totalSamplesDuration(final double totalSamplesDuration) {
    setTotalSamplesDuration( totalSamplesDuration );
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
  default RTCAudioHandlerStats voiceActivityFlag(final boolean voiceActivityFlag) {
    setVoiceActivityFlag( voiceActivityFlag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats ended(final boolean ended) {
    setEnded( ended );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats kind(@Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats trackIdentifier(@Nonnull final String trackIdentifier) {
    setTrackIdentifier( trackIdentifier );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats priority(@Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats remoteSource(final boolean remoteSource) {
    setRemoteSource( remoteSource );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCAudioHandlerStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
