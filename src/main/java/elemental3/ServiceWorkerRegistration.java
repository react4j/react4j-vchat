package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorkerRegistration"
)
public class ServiceWorkerRegistration extends EventTarget {
  @Nullable
  public EventHandler onupdatefound;

  ServiceWorkerRegistration() {
  }

  @JsProperty(
      name = "active"
  )
  @Nullable
  public native ServiceWorker active();

  @JsProperty(
      name = "installing"
  )
  @Nullable
  public native ServiceWorker installing();

  @JsProperty(
      name = "navigationPreload"
  )
  @Nonnull
  public native NavigationPreloadManager navigationPreload();

  @JsProperty(
      name = "scope"
  )
  @Nonnull
  public native String scope();

  @JsProperty(
      name = "updateViaCache"
  )
  @Nonnull
  public native String updateViaCache();

  @JsProperty(
      name = "waiting"
  )
  @Nullable
  public native ServiceWorker waiting();

  @JsProperty(
      name = "sync"
  )
  @Nonnull
  public native SyncManager sync();

  @JsProperty(
      name = "pushManager"
  )
  @Nonnull
  public native PushManager pushManager();

  @Nonnull
  public native Promise<Boolean> unregister();

  @Nonnull
  public native Promise<Void> update();

  @Nonnull
  public native Promise<JsArray<Notification>> getNotifications(
      @Nonnull GetNotificationOptions filter);

  @Nonnull
  public native Promise<JsArray<Notification>> getNotifications();

  @Nonnull
  public native Promise<Void> showNotification(@Nonnull String title,
      @Nonnull NotificationOptions options);

  @Nonnull
  public native Promise<Void> showNotification(@Nonnull String title);
}
