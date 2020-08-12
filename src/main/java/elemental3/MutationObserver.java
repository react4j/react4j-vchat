package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The MutationObserver interface provides the ability to watch for changes being made to the DOM tree. It is designed as a replacement for the older Mutation Events feature, which was part of the DOM3 Events specification.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver">MutationObserver - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MutationObserver"
)
public class MutationObserver {
  public MutationObserver(@Nonnull final MutationCallback callback) {
  }

  /**
   * The MutationObserver method disconnect() tells the observer to stop watching for mutations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver/disconnect">MutationObserver.disconnect - MDN</a>
   */
  public native void disconnect();

  /**
   * The MutationObserver method observe() configures the MutationObserver callback to begin receiving notifications of changes to the DOM that match the given options.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver/observe">MutationObserver.observe - MDN</a>
   */
  public native void observe(@Nonnull Node target, @Nonnull MutationObserverInit options);

  /**
   * The MutationObserver method observe() configures the MutationObserver callback to begin receiving notifications of changes to the DOM that match the given options.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver/observe">MutationObserver.observe - MDN</a>
   */
  public native void observe(@Nonnull Node target);

  /**
   * The MutationObserver method takeRecords() returns a list of all matching DOM changes that have been detected but not yet processed by the observer's callback function, leaving the mutation queue empty.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver/takeRecords">MutationObserver.takeRecords - MDN</a>
   */
  @Nonnull
  public native JsArray<MutationRecord> takeRecords();
}
