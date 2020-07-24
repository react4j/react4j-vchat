package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBObjectStore"
)
public class IDBObjectStore {
  @Nonnull
  public String name;

  IDBObjectStore() {
  }

  @JsProperty(
      name = "autoIncrement"
  )
  public native boolean autoIncrement();

  @JsProperty(
      name = "indexNames"
  )
  @Nonnull
  public native DOMStringList indexNames();

  @JsProperty(
      name = "keyPath"
  )
  @Nullable
  public native Any keyPath();

  @JsProperty(
      name = "transaction"
  )
  @Nonnull
  public native IDBTransaction transaction();

  @Nonnull
  public native IDBRequest add(@Nullable Any value, @Nullable Any key);

  @Nonnull
  public native IDBRequest add(@Nullable Any value);

  @Nonnull
  public native IDBRequest clear();

  @Nonnull
  public native IDBRequest count(@Nullable Any query);

  @Nonnull
  public native IDBRequest count();

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String keyPath,
      @Nonnull IDBIndexParameters options);

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull JsArray<String> keyPath,
      @Nonnull IDBIndexParameters options);

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String[] keyPath,
      @Nonnull IDBIndexParameters options);

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String keyPath);

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull JsArray<String> keyPath);

  @Nonnull
  public native IDBIndex createIndex(@Nonnull String name, @Nonnull String[] keyPath);

  @Nonnull
  public native IDBRequest delete(@Nullable Any query);

  public native void deleteIndex(@Nonnull String name);

  @Nonnull
  public native IDBRequest get(@Nullable Any query);

  @Nonnull
  public native IDBRequest getAll(@Nullable Any query, int count);

  @Nonnull
  public native IDBRequest getAll(@Nullable Any query);

  @Nonnull
  public native IDBRequest getAll();

  @Nonnull
  public native IDBRequest getAllKeys(@Nullable Any query, int count);

  @Nonnull
  public native IDBRequest getAllKeys(@Nullable Any query);

  @Nonnull
  public native IDBRequest getAllKeys();

  @Nonnull
  public native IDBRequest getKey(@Nullable Any query);

  @Nonnull
  public native IDBIndex index(@Nonnull String name);

  @Nonnull
  public native IDBRequest openCursor(@Nullable Any query,
      @MagicConstant(stringValues = {"next", "nextunique", "prev", "prevunique"}) @Nonnull String direction);

  @Nonnull
  public native IDBRequest openCursor(@Nullable Any query);

  @Nonnull
  public native IDBRequest openCursor();

  @Nonnull
  public native IDBRequest openKeyCursor(@Nullable Any query,
      @MagicConstant(stringValues = {"next", "nextunique", "prev", "prevunique"}) @Nonnull String direction);

  @Nonnull
  public native IDBRequest openKeyCursor(@Nullable Any query);

  @Nonnull
  public native IDBRequest openKeyCursor();

  @Nonnull
  public native IDBRequest put(@Nullable Any value, @Nullable Any key);

  @Nonnull
  public native IDBRequest put(@Nullable Any value);
}
