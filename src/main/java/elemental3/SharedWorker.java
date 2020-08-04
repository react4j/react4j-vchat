package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SharedWorker interface represents a specific kind of worker that can be accessed from several browsing contexts, such as several windows, iframes or even workers. They implement an interface different than dedicated workers and have a different global scope, SharedWorkerGlobalScope.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker">SharedWorker - MDN</a>
 */
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

  /**
   * The port property of the SharedWorker interface returns a MessagePort object used to communicate and control the shared worker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker/port">SharedWorker.port - MDN</a>
   */
  @JsProperty(
      name = "port"
  )
  @Nonnull
  public native MessagePort port();
}
