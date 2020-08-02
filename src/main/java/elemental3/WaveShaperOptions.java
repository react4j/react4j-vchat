package elemental3;

import elemental2.core.JsArray;
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
public interface WaveShaperOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static WaveShaperOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "curve"
  )
  JsArray<Double> curve();

  @JsProperty
  void setCurve(@Nonnull JsArray<Double> curve);

  @JsOverlay
  @Nonnull
  default WaveShaperOptions curve(@Nonnull final JsArray<Double> curve) {
    setCurve( curve );
    return this;
  }

  @JsOverlay
  default void setCurve(@Nonnull final Double... curve) {
    setCurve( JsArray.asJsArray( curve ) );
  }

  @JsOverlay
  @Nonnull
  default WaveShaperOptions curve(@Nonnull final Double... curve) {
    setCurve( curve );
    return this;
  }

  @JsProperty(
      name = "oversample"
  )
  String oversample();

  @JsProperty
  void setOversample(@Nonnull String oversample);

  @JsOverlay
  @Nonnull
  default WaveShaperOptions oversample(@Nonnull final String oversample) {
    setOversample( oversample );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WaveShaperOptions channelInterpretation(@Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
