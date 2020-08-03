package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaStreamTrack"
)
public class MediaStreamTrack extends EventTarget {
  public boolean enabled;

  @Nullable
  public EventHandler onended;

  @Nullable
  public EventHandler onmute;

  @Nullable
  public EventHandler onunmute;

  MediaStreamTrack() {
  }

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  @JsProperty(
      name = "label"
  )
  @Nonnull
  public native String label();

  @JsProperty(
      name = "muted"
  )
  public native boolean muted();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @Nonnull
  public native Promise<Void> applyConstraints(@Nonnull MediaTrackConstraints constraints);

  @Nonnull
  public native Promise<Void> applyConstraints();

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native MediaStreamTrack clone_();

  @Nonnull
  public native MediaTrackCapabilities getCapabilities();

  @Nonnull
  public native MediaTrackConstraints getConstraints();

  @Nonnull
  public native MediaTrackSettings getSettings();

  public native void stop();
}
