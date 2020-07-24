package elemental3;

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
    name = "IDBRequest"
)
public class IDBRequest extends EventTarget {
  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onsuccess;

  IDBRequest() {
  }

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "result"
  )
  @Nullable
  public native Any result();

  @JsProperty(
      name = "source"
  )
  @Nullable
  public native IDBObjectStoreOrIDBIndexOrIDBCursorUnion source();

  @JsProperty(
      name = "transaction"
  )
  @Nullable
  public native IDBTransaction transaction();
}
