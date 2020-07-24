package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ServiceWorkerContainer"
)
public class ServiceWorkerContainer extends EventTarget {
  @Nullable
  public EventHandler oncontrollerchange;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  ServiceWorkerContainer() {
  }

  @JsProperty(
      name = "controller"
  )
  @Nullable
  public native ServiceWorker controller();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<ServiceWorkerRegistration> ready();

  @Nonnull
  public native Promise<Any> getRegistration(@Nonnull String clientURL);

  @Nonnull
  public native Promise<Any> getRegistration();

  @Nonnull
  public native Promise<JsArray<ServiceWorkerRegistration>> getRegistrations();

  @Nonnull
  public native Promise<ServiceWorkerRegistration> register(@Nonnull String scriptURL,
      @Nonnull RegistrationOptions options);

  @Nonnull
  public native Promise<ServiceWorkerRegistration> register(@Nonnull String scriptURL);

  public native void startMessages();
}
