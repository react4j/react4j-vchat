package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The IDBTransaction interface of the IndexedDB API provides a static, asynchronous transaction on a database using event handler attributes. All reading and writing of data is done within transactions. You use IDBDatabase to start transactions, IDBTransaction to set the mode of the transaction (e.g. is it readonly or readwrite), and you access an IDBObjectStore to make a request. You can also use an IDBTransaction object to abort transactions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction">IDBTransaction - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBTransaction"
)
public class IDBTransaction extends EventTarget {
  /**
   * In the following code snippet, we open a read/write transaction on our database and add some data to an object store. Note also the functions attached to transaction event handlers to report on the outcome of the transaction opening in the event of success or failure. Note the transaction.onabort = function(event) { }; block, reporting when the transaction has been aborted. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/onabort">IDBTransaction.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The oncomplete event handler of the IDBTransaction interface handles the complete event, fired when the transaction successfully completes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/oncomplete">IDBTransaction.oncomplete - MDN</a>
   */
  @Nullable
  public EventHandler oncomplete;

  /**
   * The onerror event handler of the IDBTransaction interface handles the error event, fired when a request returns an error and bubbles up to the transaction object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/onerror">IDBTransaction.onerror - MDN</a>
   */
  @Nullable
  public EventHandler onerror;

  IDBTransaction() {
  }

  /**
   * An IDBDatabase object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/db">IDBTransaction.db - MDN</a>
   */
  @JsProperty(
      name = "db"
  )
  @Nonnull
  public native IDBDatabase db();

  @JsProperty(
      name = "durability"
  )
  @Nonnull
  public native String durability();

  /**
   * A DOMError containing the relevant error. In Chrome 48+/Firefox 58+ this property returns a DOMException because DOMError has been removed from the DOM standard. The exact error is one of serveral possibilities. It can be a reference to the same error as the request object that raised it, or a transaction failure (for example QuotaExceededError or UnknownError).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/error">IDBTransaction.error - MDN</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * An IDBTransactionMode object defining the mode for isolating access to data in the current object stores:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/mode">IDBTransaction.mode - MDN</a>
   */
  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native String mode();

  /**
   * The objectStoreNames read-only property of the IDBTransaction interface returns a DOMStringList of names of IDBObjectStore objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/objectStoreNames">IDBTransaction.objectStoreNames - MDN</a>
   */
  @JsProperty(
      name = "objectStoreNames"
  )
  @Nonnull
  public native DOMStringList objectStoreNames();

  /**
   * The abort() method of the IDBTransaction interface rolls back all the changes to objects in the database associated with this transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/abort">IDBTransaction.abort - MDN</a>
   */
  public native void abort();

  /**
   * The commit() method of the IDBTransaction interface commits the transaction if it is called on an active transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/commit">IDBTransaction.commit - MDN</a>
   */
  public native void commit();

  /**
   * The objectStore() method of the IDBTransaction interface returns an object store that has already been added to the scope of this transaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBTransaction/objectStore">IDBTransaction.objectStore - MDN</a>
   */
  @Nonnull
  public native IDBObjectStore objectStore(@Nonnull String name);
}
