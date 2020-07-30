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
    name = "MediaRecorder"
)
public class MediaRecorder extends EventTarget {
  @Nullable
  public EventHandler ondataavailable;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onpause;

  @Nullable
  public EventHandler onresume;

  @Nullable
  public EventHandler onstart;

  @Nullable
  public EventHandler onstop;

  MediaRecorder() {
  }

  @JsProperty(
      name = "audioBitrateMode"
  )
  @Nonnull
  public native String audioBitrateMode();

  @JsProperty(
      name = "audioBitsPerSecond"
  )
  public native int audioBitsPerSecond();

  @JsProperty(
      name = "mimeType"
  )
  @Nonnull
  public native String mimeType();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();

  @JsProperty(
      name = "videoBitsPerSecond"
  )
  public native int videoBitsPerSecond();

  public static native boolean isTypeSupported(@Nonnull String type);

  public native void pause();

  public native void requestData();

  public native void resume();

  public native void start(int timeslice);

  public native void start();

  public native void stop();
}
