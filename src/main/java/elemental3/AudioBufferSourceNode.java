package elemental3;

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
    name = "AudioBufferSourceNode"
)
public class AudioBufferSourceNode extends AudioScheduledSourceNode {
  @Nullable
  public AudioBuffer buffer;

  public boolean loop;

  public double loopEnd;

  public double loopStart;

  public AudioBufferSourceNode(@Nonnull final BaseAudioContext context,
      @Nonnull final AudioBufferSourceOptions options) {
  }

  public AudioBufferSourceNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "detune"
  )
  @Nonnull
  public native AudioParam detune();

  @JsProperty(
      name = "playbackRate"
  )
  @Nonnull
  public native AudioParam playbackRate();

  public native void start(double when, double offset, double duration);

  public native void start(double when, double offset);

  public native void start(double when);

  public native void start();
}
