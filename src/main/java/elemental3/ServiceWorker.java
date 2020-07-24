package elemental3;

import elemental2.core.JsArray;
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
    name = "ServiceWorker"
)
public class ServiceWorker extends EventTarget {
  @Nullable
  public EventHandler onstatechange;

  @Nullable
  public EventHandler onerror;

  ServiceWorker() {
  }

  @JsProperty(
      name = "scriptURL"
  )
  @Nonnull
  public native String scriptURL();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  public native void postMessage(@Nullable Any message, @Nonnull JsArray<Object> transfer);

  public native void postMessage(@Nullable Any message, @Nonnull Object[] transfer);

  public native void postMessage(@Nullable Any message, @Nonnull PostMessageOptions options);

  public native void postMessage(@Nullable Any message);
}
