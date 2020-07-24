package elemental3;

import elemental2.core.Float32Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioBuffer"
)
public class AudioBuffer {
  public AudioBuffer(@Nonnull final AudioBufferOptions options) {
  }

  @JsProperty(
      name = "duration"
  )
  public native double duration();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "numberOfChannels"
  )
  public native int numberOfChannels();

  @JsProperty(
      name = "sampleRate"
  )
  public native float sampleRate();

  public native void copyFromChannel(@Nonnull Float32Array destination, int channelNumber,
      int bufferOffset);

  public native void copyFromChannel(@Nonnull Float32Array destination, int channelNumber);

  public native void copyToChannel(@Nonnull Float32Array source, int channelNumber,
      int bufferOffset);

  public native void copyToChannel(@Nonnull Float32Array source, int channelNumber);

  @Nonnull
  public native Float32Array getChannelData(int channel);
}
