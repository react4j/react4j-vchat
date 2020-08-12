package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest">IDBRequest - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBRequest"
)
public class IDBRequest extends EventTarget {
  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onsuccess;

  IDBRequest() {
  }

  /**
   * A DOMError containing the relevant error. In Chrome 48+/Firefox 58+ this property returns a DOMException because DOMError has been removed from the DOM standard. The following error codes are returned under certain conditions:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/error">IDBRequest.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * The IDBRequestReadyState of the request, which takes one of the following two values:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/readyState">IDBRequest.readyState - MDN</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  /**
   * any
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/result">IDBRequest.result - MDN</a>
   */
  @JsProperty(
      name = "result"
  )
  @Nullable
  public native Any result();

  /**
   * An object representing the source of the request, such as an IDBIndex, IDBObjectStore or IDBCursor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/source">IDBRequest.source - MDN</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nullable
  public native IDBObjectStoreOrIDBIndexOrIDBCursorUnion source();

  /**
   * An IDBTransaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/transaction">IDBRequest.transaction - MDN</a>
   */
  @JsProperty(
      name = "transaction"
  )
  @Nullable
  public native IDBTransaction transaction();
}
