package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EventSource"
)
public class EventSource extends EventTarget {
  @JsOverlay
  public static final int CLOSED = 2;

  @JsOverlay
  public static final int CONNECTING = 0;

  @JsOverlay
  public static final int OPEN = 1;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onopen;

  public EventSource(@Nonnull final String url,
      @Nonnull final EventSourceInit eventSourceInitDict) {
  }

  public EventSource(@Nonnull final String url) {
  }

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  @JsProperty(
      name = "withCredentials"
  )
  public native boolean withCredentials();

  public native void close();
}
