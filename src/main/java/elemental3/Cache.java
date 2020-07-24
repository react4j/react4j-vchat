package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Cache"
)
public class Cache {
  Cache() {
  }

  @Nonnull
  public native Promise<Void> add(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<Void> add(@Nonnull Request request);

  @Nonnull
  public native Promise<Void> add(@Nonnull String request);

  @Nonnull
  public native Promise<Void> addAll(@Nonnull JsArray<RequestInfo> requests);

  @Nonnull
  public native Promise<Void> addAll(@Nonnull RequestInfo[] requests);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull Request request);

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String request);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull Request request);

  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull String request);

  @Nonnull
  public native Promise<JsArray<Request>> keys();

  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull Request request, @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull String request, @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<Any> match(@Nonnull Request request);

  @Nonnull
  public native Promise<Any> match(@Nonnull String request);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull Request request);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull String request);

  @Nonnull
  public native Promise<JsArray<Response>> matchAll();

  @Nonnull
  public native Promise<Void> put(@Nonnull RequestInfo request, @Nonnull Response response);

  @Nonnull
  public native Promise<Void> put(@Nonnull Request request, @Nonnull Response response);

  @Nonnull
  public native Promise<Void> put(@Nonnull String request, @Nonnull Response response);
}
