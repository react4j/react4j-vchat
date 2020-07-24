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
    name = "IDBTransaction"
)
public class IDBTransaction extends EventTarget {
  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler oncomplete;

  @Nullable
  public EventHandler onerror;

  IDBTransaction() {
  }

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

  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native String mode();

  @JsProperty(
      name = "objectStoreNames"
  )
  @Nonnull
  public native DOMStringList objectStoreNames();

  public native void abort();

  public native void commit();

  @Nonnull
  public native IDBObjectStore objectStore(@Nonnull String name);
}
