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
    name = "FileReader"
)
public class FileReader extends EventTarget {
  @JsOverlay
  public static final int DONE = 2;

  @JsOverlay
  public static final int EMPTY = 0;

  @JsOverlay
  public static final int LOADING = 1;

  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onload;

  @Nullable
  public EventHandler onloadend;

  @Nullable
  public EventHandler onloadstart;

  @Nullable
  public EventHandler onprogress;

  public FileReader() {
  }

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "result"
  )
  @Nullable
  public native StringOrArrayBufferUnion result();

  public native void abort();

  public native void readAsArrayBuffer(@Nonnull Blob blob);

  public native void readAsBinaryString(@Nonnull Blob blob);

  public native void readAsDataURL(@Nonnull Blob blob);

  public native void readAsText(@Nonnull Blob blob, @Nonnull String encoding);

  public native void readAsText(@Nonnull Blob blob);
}
