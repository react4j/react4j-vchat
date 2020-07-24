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
public interface AudioWorkletNodeOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static AudioWorkletNodeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  int getNumberOfInputs();

  @JsProperty
  void setNumberOfInputs(int numberOfInputs);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions numberOfInputs(final int numberOfInputs) {
    setNumberOfInputs( numberOfInputs );
    return this;
  }

  @JsProperty
  int getNumberOfOutputs();

  @JsProperty
  void setNumberOfOutputs(int numberOfOutputs);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions numberOfOutputs(final int numberOfOutputs) {
    setNumberOfOutputs( numberOfOutputs );
    return this;
  }

  @JsProperty
  JsArray<Double> getOutputChannelCount();

  @JsProperty
  void setOutputChannelCount(@Nonnull JsArray<Double> outputChannelCount);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions outputChannelCount(
      @Nonnull final JsArray<Double> outputChannelCount) {
    setOutputChannelCount( outputChannelCount );
    return this;
  }

  @JsOverlay
  default void setOutputChannelCount(@Nonnull final Double... outputChannelCount) {
    setOutputChannelCount( JsArray.asJsArray( outputChannelCount ) );
  }

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions outputChannelCount(@Nonnull final Double... outputChannelCount) {
    setOutputChannelCount( outputChannelCount );
    return this;
  }

  @JsProperty
  JsPropertyMap<Double> getParameterData();

  @JsProperty
  void setParameterData(@Nonnull JsPropertyMap<Double> parameterData);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions parameterData(
      @Nonnull final JsPropertyMap<Double> parameterData) {
    setParameterData( parameterData );
    return this;
  }

  @JsProperty
  Object getProcessorOptions();

  @JsProperty
  void setProcessorOptions(@Nonnull Object processorOptions);

  @JsOverlay
  @Nonnull
  default AudioWorkletNodeOptions processorOptions(@Nonnull final Object processorOptions) {
    setProcessorOptions( processorOptions );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelCount(final int channelCount) {
    setChannelCount( channelCount );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelCountMode(@Nonnull final String channelCountMode) {
    setChannelCountMode( channelCountMode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AudioWorkletNodeOptions channelInterpretation(
      @Nonnull final String channelInterpretation) {
    setChannelInterpretation( channelInterpretation );
    return this;
  }
}
