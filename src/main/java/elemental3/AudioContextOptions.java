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
public interface AudioContextOptions {
  @JsOverlay
  @Nonnull
  static AudioContextOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  AudioContextLatencyCategoryOrDoubleUnion getLatencyHint();

  @JsProperty
  void setLatencyHint(@Nonnull AudioContextLatencyCategoryOrDoubleUnion latencyHint);

  @JsOverlay
  default void setLatencyHint(@Nonnull final String latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  @JsOverlay
  @Nonnull
  default AudioContextOptions latencyHint(@Nonnull final String latencyHint) {
    setLatencyHint( latencyHint );
    return this;
  }

  @JsOverlay
  default void setLatencyHint(final double latencyHint) {
    setLatencyHint( AudioContextLatencyCategoryOrDoubleUnion.of( latencyHint ) );
  }

  @JsOverlay
  @Nonnull
  default AudioContextOptions latencyHint(final double latencyHint) {
    setLatencyHint( latencyHint );
    return this;
  }

  @JsProperty
  float getSampleRate();

  @JsProperty
  void setSampleRate(float sampleRate);

  @JsOverlay
  @Nonnull
  default AudioContextOptions sampleRate(final float sampleRate) {
    setSampleRate( sampleRate );
    return this;
  }
}
