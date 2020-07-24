package elemental3;

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
    name = "IDBIndex"
)
public class IDBIndex {
  @Nonnull
  public String name;

  IDBIndex() {
  }

  @JsProperty(
      name = "keyPath"
  )
  @Nullable
  public native Any keyPath();

  @JsProperty(
      name = "multiEntry"
  )
  public native boolean multiEntry();

  @JsProperty(
      name = "objectStore"
  )
  @Nonnull
  public native IDBObjectStore objectStore();

  @JsProperty(
      name = "unique"
  )
  public native boolean unique();

  @Nonnull
  public native IDBRequest count(@Nullable Any query);

  @Nonnull
  public native IDBRequest count();

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
}
