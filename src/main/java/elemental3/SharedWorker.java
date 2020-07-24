package elemental3;

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
    name = "SharedWorker"
)
public class SharedWorker extends EventTarget {
  @Nullable
  public EventHandler onerror;

  public SharedWorker(@Nonnull final String scriptURL, @Nonnull final String options) {
  }

  public SharedWorker(@Nonnull final String scriptURL, @Nonnull final WorkerOptions options) {
  }

  public SharedWorker(@Nonnull final String scriptURL) {
  }

  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
