package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushManager"
)
public class PushManager {
  PushManager() {
  }

  @JsProperty(
      name = "supportedContentEncodings"
  )
  @Nonnull
  public native JsArray<String> supportedContentEncodings();

  @Nonnull
  public native Promise<PushSubscription> getSubscription();

  @Nonnull
  public native Promise<String> permissionState(@Nonnull PushSubscriptionOptionsInit options);

  @Nonnull
  public native Promise<String> permissionState();

  @Nonnull
  public native Promise<PushSubscription> subscribe(@Nonnull PushSubscriptionOptionsInit options);

  @Nonnull
  public native Promise<PushSubscription> subscribe();
}
