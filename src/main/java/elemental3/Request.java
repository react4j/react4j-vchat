package elemental3;

import elemental2.core.ArrayBuffer;
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
    name = "Request"
)
public class Request {
  public Request(@Nonnull final RequestInfo input, @Nonnull final RequestInit init) {
  }

  public Request(@Nonnull final Request input, @Nonnull final RequestInit init) {
  }

  public Request(@Nonnull final String input, @Nonnull final RequestInit init) {
  }

  public Request(@Nonnull final RequestInfo input) {
  }

  public Request(@Nonnull final Request input) {
  }

  public Request(@Nonnull final String input) {
  }

  @JsProperty(
      name = "cache"
  )
  @Nonnull
  public native String cache();

  @JsProperty(
      name = "credentials"
  )
  @Nonnull
  public native String credentials();

  @JsProperty(
      name = "destination"
  )
  @Nonnull
  public native String destination();

  @JsProperty(
      name = "headers"
  )
  @Nonnull
  public native Headers headers();

  @JsProperty(
      name = "integrity"
  )
  @Nonnull
  public native String integrity();

  @JsProperty(
      name = "isHistoryNavigation"
  )
  public native boolean isHistoryNavigation();

  @JsProperty(
      name = "isReloadNavigation"
  )
  public native boolean isReloadNavigation();

  @JsProperty(
      name = "keepalive"
  )
  public native boolean keepalive();

  @JsProperty(
      name = "method"
  )
  @Nonnull
  public native String method();

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native String mode();

  @JsProperty(
      name = "redirect"
  )
  @Nonnull
  public native String redirect();

  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  @JsProperty(
      name = "referrerPolicy"
  )
  @Nonnull
  public native String referrerPolicy();

  @JsProperty(
      name = "signal"
  )
  @Nonnull
  public native AbortSignal signal();

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

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native Request clone_();

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
