package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
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
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLHttpRequest"
)
public class XMLHttpRequest extends XMLHttpRequestEventTarget {
  @JsOverlay
  public static final int DONE = 4;

  @JsOverlay
  public static final int HEADERS_RECEIVED = 2;

  @JsOverlay
  public static final int LOADING = 3;

  @JsOverlay
  public static final int OPENED = 1;

  @JsOverlay
  public static final int UNSENT = 0;

  @Nullable
  public EventHandler onreadystatechange;

  @Nonnull
  public String responseType;

  public int timeout;

  public boolean withCredentials;

  public XMLHttpRequest() {
  }

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "response"
  )
  @Nullable
  public native Any response();

  @JsProperty(
      name = "responseText"
  )
  @Nonnull
  public native String responseText();

  @JsProperty(
      name = "responseURL"
  )
  @Nonnull
  public native String responseURL();

  @JsProperty(
      name = "responseXML"
  )
  @Nullable
  public native Document responseXML();

  @JsProperty(
      name = "status"
  )
  public native int status();

  @JsProperty(
      name = "statusText"
  )
  @Nonnull
  public native String statusText();

  @JsProperty(
      name = "upload"
  )
  @Nonnull
  public native XMLHttpRequestUpload upload();

  public native void abort();

  @Nonnull
  public native String getAllResponseHeaders();

  @Nullable
  public native String getResponseHeader(@Nonnull String name);

  public native void open(@Nonnull String method, @Nonnull String url);

  public native void open(@Nonnull String method, @Nonnull String url, boolean async,
      @Nullable String username, @Nullable String password);

  public native void open(@Nonnull String method, @Nonnull String url, boolean async,
      @Nullable String username);

  public native void open(@Nonnull String method, @Nonnull String url, boolean async);

  public native void overrideMimeType(@Nonnull String mime);

  public native void send(@Nonnull Document body);

  public native void send(@Nonnull XMLHttpRequestBodyInit body);

  public native void send(@Nonnull Blob body);

  public native void send(@Nonnull BufferSource body);

  public native void send(@Nonnull ArrayBufferView body);

  public native void send(@Nonnull Int8Array body);

  public native void send(@Nonnull Int16Array body);

  public native void send(@Nonnull Int32Array body);

  public native void send(@Nonnull Uint8Array body);

  public native void send(@Nonnull Uint16Array body);

  public native void send(@Nonnull Uint32Array body);

  public native void send(@Nonnull Uint8ClampedArray body);

  public native void send(@Nonnull Float32Array body);

  public native void send(@Nonnull Float64Array body);

  public native void send(@Nonnull DataView body);

  public native void send(@Nonnull ArrayBuffer body);

  public native void send(@Nonnull FormData body);

  public native void send(@Nonnull URLSearchParams body);

  public native void send(@Nonnull String body);

  public native void send();

  public native void setRequestHeader(@Nonnull String name, @Nonnull String value);
}
