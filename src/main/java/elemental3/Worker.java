package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The Worker interface of the Web Workers API represents a background task that can be created via script, which can send messages back to its creator.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker">Worker - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Worker"
)
public class Worker extends EventTarget {
  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  @Nullable
  public EventHandler onerror;

  public Worker(@Nonnull final String scriptURL, @Nonnull final WorkerOptions options) {
  }

  public Worker(@Nonnull final String scriptURL) {
  }

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull JsArray<Object> transfer);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull Object[] transfer);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull PostMessageOptions options);

  /**
   * The postMessage() method of the Worker interface sends a message to the worker's inner scope. This accepts a single parameter, which is the data to send to the worker. The data may be any value or JavaScript object handled by the structured clone algorithm, which includes cyclical references.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage">Worker.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message);

  /**
   * The terminate() method of the Worker interface immediately terminates the Worker. This does not offer the worker an opportunity to finish its operations; it is simply stopped at once.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worker/terminate">Worker.terminate - MDN</a>
   */
  public native void terminate();
}
