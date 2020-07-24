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
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Response"
)
public class Response {
  public Response(@Nonnull final BodyInit body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final ReadableStream body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final XMLHttpRequestBodyInit body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Blob body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final BufferSource body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final ArrayBufferView body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Int8Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Int16Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Int32Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Uint8Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Uint16Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Uint32Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Uint8ClampedArray body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Float32Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final Float64Array body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final DataView body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final ArrayBuffer body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final FormData body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final URLSearchParams body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final String body, @Nonnull final ResponseInit init) {
  }

  public Response(@Nonnull final BodyInit body) {
  }

  public Response(@Nonnull final ReadableStream body) {
  }

  public Response(@Nonnull final XMLHttpRequestBodyInit body) {
  }

  public Response(@Nonnull final Blob body) {
  }

  public Response(@Nonnull final BufferSource body) {
  }

  public Response(@Nonnull final ArrayBufferView body) {
  }

  public Response(@Nonnull final Int8Array body) {
  }

  public Response(@Nonnull final Int16Array body) {
  }

  public Response(@Nonnull final Int32Array body) {
  }

  public Response(@Nonnull final Uint8Array body) {
  }

  public Response(@Nonnull final Uint16Array body) {
  }

  public Response(@Nonnull final Uint32Array body) {
  }

  public Response(@Nonnull final Uint8ClampedArray body) {
  }

  public Response(@Nonnull final Float32Array body) {
  }

  public Response(@Nonnull final Float64Array body) {
  }

  public Response(@Nonnull final DataView body) {
  }

  public Response(@Nonnull final ArrayBuffer body) {
  }

  public Response(@Nonnull final FormData body) {
  }

  public Response(@Nonnull final URLSearchParams body) {
  }

  public Response(@Nonnull final String body) {
  }

  public Response() {
  }

  @JsProperty(
      name = "headers"
  )
  @Nonnull
  public native Headers headers();

  @JsProperty(
      name = "ok"
  )
  public native boolean ok();

  @JsProperty(
      name = "redirected"
  )
  public native boolean redirected();

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
      name = "type"
  )
  @Nonnull
  public native String type();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  @JsProperty(
      name = "body"
  )
  @Nullable
  public native ReadableStream body();

  @JsProperty(
      name = "bodyUsed"
  )
  public native boolean bodyUsed();

  @Nonnull
  public static native Response error();

  @Nonnull
  public static native Response redirect(@Nonnull String url, int status);

  @Nonnull
  public static native Response redirect(@Nonnull String url);

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native Response _clone();

  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  @Nonnull
  public native Promise<Blob> blob();

  @Nonnull
  public native Promise<FormData> formData();

  @Nonnull
  public native Promise<Any> json();

  @Nonnull
  public native Promise<String> text();
}
