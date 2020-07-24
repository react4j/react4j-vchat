package elemental3;

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
    name = "Object"
)
public class OfflineAudioContext extends BaseAudioContext {
  @Nullable
  public EventHandler oncomplete;

  public OfflineAudioContext(@Nonnull final OfflineAudioContextOptions contextOptions) {
  }

  public OfflineAudioContext(final int numberOfChannels, final int length, final float sampleRate) {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nonnull
  public native Promise<Void> resume();

  @Nonnull
  public native Promise<AudioBuffer> startRendering();

  @Nonnull
  public native Promise<Void> suspend(double suspendTime);
}
