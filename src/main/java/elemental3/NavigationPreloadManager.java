package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NavigationPreloadManager"
)
public class NavigationPreloadManager {
  NavigationPreloadManager() {
  }

  @Nonnull
  public native Promise<Void> disable();

  @Nonnull
  public native Promise<Void> enable();

  @Nonnull
  public native Promise<NavigationPreloadState> getState();

  @Nonnull
  public native Promise<Void> setHeaderValue(@Nonnull String value);
}
