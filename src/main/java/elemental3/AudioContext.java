package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class AudioContext extends BaseAudioContext {
  public AudioContext(@Nonnull final AudioContextOptions contextOptions) {
  }

  public AudioContext() {
  }

  @JsProperty(
      name = "baseLatency"
  )
  public native double baseLatency();

  @JsProperty(
      name = "outputLatency"
  )
  public native double outputLatency();

  @Nonnull
  public native Promise<Void> close();

  @Nonnull
  public native MediaElementAudioSourceNode createMediaElementSource(
      @Nonnull HTMLMediaElement mediaElement);

  @Nonnull
  public native MediaStreamAudioDestinationNode createMediaStreamDestination();

  @Nonnull
  public native MediaStreamAudioSourceNode createMediaStreamSource(
      @Nonnull MediaStream mediaStream);

  @Nonnull
  public native MediaStreamTrackAudioSourceNode createMediaStreamTrackSource(
      @Nonnull MediaStreamTrack mediaStreamTrack);

  @Nonnull
  public native AudioTimestamp getOutputTimestamp();

  @Nonnull
  public native Promise<Void> resume();

  @Nonnull
  public native Promise<Void> suspend();
}
