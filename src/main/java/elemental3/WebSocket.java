package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
    name = "WebSocket"
)
public class WebSocket extends EventTarget {
  @JsOverlay
  public static final int CLOSED = 3;

  @JsOverlay
  public static final int CLOSING = 2;

  @JsOverlay
  public static final int CONNECTING = 0;

  @JsOverlay
  public static final int OPEN = 1;

  @Nonnull
  public String binaryType;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onopen;

  public WebSocket(@Nonnull final String url, @Nonnull final String protocols) {
  }

  public WebSocket(@Nonnull final String url, @Nonnull final JsArray<String> protocols) {
  }

  public WebSocket(@Nonnull final String url, @Nonnull final String[] protocols) {
  }

  public WebSocket(@Nonnull final String url) {
  }

  @JsProperty(
      name = "bufferedAmount"
  )
  public native int bufferedAmount();

  @JsProperty(
      name = "extensions"
  )
  @Nonnull
  public native String extensions();

  @JsProperty(
      name = "protocol"
  )
  @Nonnull
  public native String protocol();

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  public native void close(int code, @Nonnull String reason);

  public native void close(int code);

  public native void close();

  public native void send(@Nonnull String data);

  public native void send(@Nonnull Blob data);

  public native void send(@Nonnull ArrayBuffer data);

  public native void send(@Nonnull ArrayBufferView data);

  public native void send(@Nonnull Int8Array data);

  public native void send(@Nonnull Int16Array data);

  public native void send(@Nonnull Int32Array data);

  public native void send(@Nonnull Uint8Array data);

  public native void send(@Nonnull Uint16Array data);

  public native void send(@Nonnull Uint32Array data);

  public native void send(@Nonnull Uint8ClampedArray data);

  public native void send(@Nonnull Float32Array data);

  public native void send(@Nonnull Float64Array data);

  public native void send(@Nonnull DataView data);
}
