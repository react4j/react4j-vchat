package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BaseAudioContext"
)
public class BaseAudioContext extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  BaseAudioContext() {
  }

  @JsProperty(
      name = "audioWorklet"
  )
  @Nonnull
  public native AudioWorklet audioWorklet();

  @JsProperty(
      name = "currentTime"
  )
  public native double currentTime();

  @JsProperty(
      name = "destination"
  )
  @Nonnull
  public native AudioDestinationNode destination();

  @JsProperty(
      name = "listener"
  )
  @Nonnull
  public native AudioListener listener();

  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @Nonnull
  public native AnalyserNode createAnalyser();

  @Nonnull
  public native BiquadFilterNode createBiquadFilter();

  @Nonnull
  public native AudioBuffer createBuffer(int numberOfChannels, int length, float sampleRate);

  @Nonnull
  public native AudioBufferSourceNode createBufferSource();

  @Nonnull
  public native ChannelMergerNode createChannelMerger(int numberOfInputs);

  @Nonnull
  public native ChannelMergerNode createChannelMerger();

  @Nonnull
  public native ChannelSplitterNode createChannelSplitter(int numberOfOutputs);

  @Nonnull
  public native ChannelSplitterNode createChannelSplitter();

  @Nonnull
  public native ConstantSourceNode createConstantSource();

  @Nonnull
  public native ConvolverNode createConvolver();

  @Nonnull
  public native DelayNode createDelay(double maxDelayTime);

  @Nonnull
  public native DelayNode createDelay();

  @Nonnull
  public native DynamicsCompressorNode createDynamicsCompressor();

  @Nonnull
  public native GainNode createGain();

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull JsArray<Double> feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull Double[] feedforward,
      @Nonnull JsArray<Double> feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull JsArray<Double> feedforward,
      @Nonnull Double[] feedback);

  @Nonnull
  public native IIRFilterNode createIIRFilter(@Nonnull Double[] feedforward,
      @Nonnull Double[] feedback);

  @Nonnull
  public native OscillatorNode createOscillator();

  @Nonnull
  public native PannerNode createPanner();

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real,
      @Nonnull JsArray<Double> imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull Double[] imag, @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real, @Nonnull Double[] imag,
      @Nonnull PeriodicWaveConstraints constraints);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull JsArray<Double> imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real,
      @Nonnull JsArray<Double> imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull JsArray<Double> real,
      @Nonnull Double[] imag);

  @Nonnull
  public native PeriodicWave createPeriodicWave(@Nonnull Double[] real, @Nonnull Double[] imag);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels,
      int numberOfOutputChannels);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize,
      int numberOfInputChannels);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor(int bufferSize);

  @Nonnull
  public native ScriptProcessorNode createScriptProcessor();

  @Nonnull
  public native StereoPannerNode createStereoPanner();

  @Nonnull
  public native WaveShaperNode createWaveShaper();

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback, @Nullable DecodeErrorCallback errorCallback);

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData,
      @Nullable DecodeSuccessCallback successCallback);

  @Nonnull
  public native Promise<AudioBuffer> decodeAudioData(@Nonnull ArrayBuffer audioData);
}
