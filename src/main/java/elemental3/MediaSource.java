package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaSource"
)
public class MediaSource extends EventTarget {
  public double duration;

  @Nullable
  public EventHandler onsourceclose;

  @Nullable
  public EventHandler onsourceended;

  @Nullable
  public EventHandler onsourceopen;

  MediaSource() {
  }

  @JsProperty(
      name = "activeSourceBuffers"
  )
  @Nonnull
  public native SourceBufferList activeSourceBuffers();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "sourceBuffers"
  )
  @Nonnull
  public native SourceBufferList sourceBuffers();

  public static native boolean isTypeSupported(@Nonnull String type);

  @Nonnull
  public native SourceBuffer addSourceBuffer(@Nonnull String type);

  public native void clearLiveSeekableRange();

  public native void endOfStream(
      @MagicConstant(stringValues = {"decode", "network"}) @Nonnull String error);

  public native void endOfStream();

  public native void removeSourceBuffer(@Nonnull SourceBuffer sourceBuffer);

  public native void setLiveSeekableRange(double start, double end);
}
