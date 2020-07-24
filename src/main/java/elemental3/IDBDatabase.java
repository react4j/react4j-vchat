package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBDatabase"
)
public class IDBDatabase extends EventTarget {
  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler onerror;

  @Nullable
  public EventHandler onversionchange;

  IDBDatabase() {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "objectStoreNames"
  )
  @Nonnull
  public native DOMStringList objectStoreNames();

  @JsProperty(
      name = "version"
  )
  public native int version();

  public native void close();

  @Nonnull
  public native IDBObjectStore createObjectStore(@Nonnull String name,
      @Nonnull IDBObjectStoreParameters options);

  @Nonnull
  public native IDBObjectStore createObjectStore(@Nonnull String name);

  public native void deleteObjectStore(@Nonnull String name);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode,
      @Nonnull IDBTransactionOptions options);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames,
      @MagicConstant(stringValues = {"readonly", "readwrite", "versionchange"}) @Nonnull String mode);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String storeNames);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull JsArray<String> storeNames);

  @Nonnull
  public native IDBTransaction transaction(@Nonnull String[] storeNames);
}
