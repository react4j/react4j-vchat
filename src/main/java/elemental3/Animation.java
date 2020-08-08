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
public class Animation extends EventTarget {
  @Nullable
  public Double currentTime;

  @Nullable
  public AnimationEffect effect;

  @Nonnull
  public String id;

  @Nullable
  public EventHandler oncancel;

  @Nullable
  public EventHandler onfinish;

  public double playbackRate;

  @Nullable
  public Double startTime;

  @Nullable
  public AnimationTimeline timeline;

  public Animation(@Nullable final AnimationEffect effect,
      @Nullable final AnimationTimeline timeline) {
  }

  public Animation(@Nullable final AnimationEffect effect) {
  }

  public Animation() {
  }

  @JsProperty(
      name = "finished"
  )
  @Nonnull
  public native Promise<Animation> finished();

  @JsProperty(
      name = "pending"
  )
  public native boolean pending();

  @JsProperty(
      name = "playState"
  )
  @Nonnull
  public native String playState();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Animation> ready();

  public native void cancel();

  public native void finish();

  public native void pause();

  public native void play();

  public native void reverse();

  public native void updatePlaybackRate(double playbackRate);
}
