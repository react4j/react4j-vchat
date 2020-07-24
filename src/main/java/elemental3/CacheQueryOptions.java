package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface CacheQueryOptions {
  @JsOverlay
  @Nonnull
  static CacheQueryOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isIgnoreMethod();

  @JsProperty
  void setIgnoreMethod(boolean ignoreMethod);

  @JsOverlay
  @Nonnull
  default CacheQueryOptions ignoreMethod(final boolean ignoreMethod) {
    setIgnoreMethod( ignoreMethod );
    return this;
  }

  @JsProperty
  boolean isIgnoreSearch();

  @JsProperty
  void setIgnoreSearch(boolean ignoreSearch);

  @JsOverlay
  @Nonnull
  default CacheQueryOptions ignoreSearch(final boolean ignoreSearch) {
    setIgnoreSearch( ignoreSearch );
    return this;
  }

  @JsProperty
  boolean isIgnoreVary();

  @JsProperty
  void setIgnoreVary(boolean ignoreVary);

  @JsOverlay
  @Nonnull
  default CacheQueryOptions ignoreVary(final boolean ignoreVary) {
    setIgnoreVary( ignoreVary );
    return this;
  }
}
