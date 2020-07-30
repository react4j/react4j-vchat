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
    name = "RTCDTMFSender"
)
public class RTCDTMFSender extends EventTarget {
  @Nullable
  public EventHandler ontonechange;

  RTCDTMFSender() {
  }

  @JsProperty(
      name = "canInsertDTMF"
  )
  public native boolean canInsertDTMF();

  @JsProperty(
      name = "toneBuffer"
  )
  @Nonnull
  public native String toneBuffer();

  public native void insertDTMF(@Nonnull String tones, int duration, int interToneGap);

  public native void insertDTMF(@Nonnull String tones, int duration);

  public native void insertDTMF(@Nonnull String tones);
}
