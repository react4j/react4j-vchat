package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBCursor"
)
public class IDBCursor {
  IDBCursor() {
  }

  @JsProperty(
      name = "direction"
  )
  @Nonnull
  public native String direction();

  @JsProperty(
      name = "key"
  )
  @Nullable
  public native Any key();

  @JsProperty(
      name = "primaryKey"
  )
  @Nullable
  public native Any primaryKey();

  @JsProperty(
      name = "request"
  )
  @Nonnull
  public native IDBRequest request();

  @JsProperty(
      name = "source"
  )
  @Nonnull
  public native IDBObjectStoreOrIDBIndexUnion source();

  public native void advance(int count);

  @JsMethod(
      name = "continue"
  )
  public native void _continue(@Nullable Any key);

  @JsMethod(
      name = "continue"
  )
  public native void _continue();

  public native void continuePrimaryKey(@Nullable Any key, @Nullable Any primaryKey);

  @Nonnull
  public native IDBRequest delete();

  @Nonnull
  public native IDBRequest update(@Nullable Any value);
}
