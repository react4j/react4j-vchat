package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Also inherits methods from its parents IDBRequest and EventTarget.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBOpenDBRequest">IDBOpenDBRequest - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBOpenDBRequest"
)
public class IDBOpenDBRequest extends IDBRequest {
  @Nullable
  public EventHandler onblocked;

  @Nullable
  public EventHandler onupgradeneeded;

  IDBOpenDBRequest() {
  }
}
