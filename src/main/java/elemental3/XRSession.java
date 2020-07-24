package elemental3;

import elemental2.promise.Promise;
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
    name = "XRSession"
)
public class XRSession extends EventTarget {
  @Nullable
  public EventHandler onend;

  @Nullable
  public EventHandler oninputsourceschange;

  @Nullable
  public EventHandler onselect;

  @Nullable
  public EventHandler onselectend;

  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler onvisibilitychange;

  XRSession() {
  }

  @JsProperty(
      name = "inputSources"
  )
  @Nonnull
  public native XRInputSourceArray inputSources();

  @JsProperty(
      name = "renderState"
  )
  @Nonnull
  public native XRRenderState renderState();

  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  public native String visibilityState();

  public native void cancelAnimationFrame(int handle);

  @Nonnull
  public native Promise<Void> end();

  public native int requestAnimationFrame(@Nonnull XRFrameRequestCallback callback);

  @Nonnull
  public native Promise<XRReferenceSpace> requestReferenceSpace(
      @MagicConstant(stringValues = {"bounded-floor", "local", "local-floor", "unbounded", "viewer"}) @Nonnull String type);

  public native void updateRenderState(@Nonnull XRRenderStateInit state);

  public native void updateRenderState();
}
