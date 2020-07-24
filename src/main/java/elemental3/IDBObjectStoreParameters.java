package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface IDBObjectStoreParameters {
  @JsOverlay
  @Nonnull
  static IDBObjectStoreParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isAutoIncrement();

  @JsProperty
  void setAutoIncrement(boolean autoIncrement);

  @JsOverlay
  @Nonnull
  default IDBObjectStoreParameters autoIncrement(final boolean autoIncrement) {
    setAutoIncrement( autoIncrement );
    return this;
  }

  @JsProperty
  @Nullable
  StringOrStringArrayUnion getKeyPath();

  @JsProperty
  void setKeyPath(@Nullable StringOrStringArrayUnion keyPath);

  @JsOverlay
  default void setKeyPath(@Nonnull final String keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @JsOverlay
  @Nonnull
  default IDBObjectStoreParameters keyPath(@Nonnull final String keyPath) {
    setKeyPath( keyPath );
    return this;
  }

  @JsOverlay
  default void setKeyPath(@Nonnull final JsArray<String> keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @JsOverlay
  @Nonnull
  default IDBObjectStoreParameters keyPath(@Nonnull final JsArray<String> keyPath) {
    setKeyPath( keyPath );
    return this;
  }

  @JsOverlay
  default void setKeyPath(@Nonnull final String... keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @JsOverlay
  @Nonnull
  default IDBObjectStoreParameters keyPath(@Nonnull final String... keyPath) {
    setKeyPath( keyPath );
    return this;
  }
}
