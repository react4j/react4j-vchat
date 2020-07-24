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
    name = "CacheStorage"
)
public class CacheStorage {
  CacheStorage() {
  }

  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String cacheName);

  @Nonnull
  public native Promise<Boolean> has(@Nonnull String cacheName);

  @Nonnull
  public native Promise<JsArray<String>> keys();

  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request,
      @Nonnull MultiCacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull Request request,
      @Nonnull MultiCacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull String request,
      @Nonnull MultiCacheQueryOptions options);

  @Nonnull
  public native Promise<Any> match(@Nonnull RequestInfo request);

  @Nonnull
  public native Promise<Any> match(@Nonnull Request request);

  @Nonnull
  public native Promise<Any> match(@Nonnull String request);

  @Nonnull
  public native Promise<Cache> open(@Nonnull String cacheName);
}
