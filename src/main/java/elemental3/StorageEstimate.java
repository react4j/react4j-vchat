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
public interface StorageEstimate {
  @JsOverlay
  @Nonnull
  static StorageEstimate create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "quota"
  )
  int quota();

  @JsProperty
  void setQuota(int quota);

  @JsOverlay
  @Nonnull
  default StorageEstimate quota(final int quota) {
    setQuota( quota );
    return this;
  }

  @JsProperty(
      name = "usage"
  )
  int usage();

  @JsProperty
  void setUsage(int usage);

  @JsOverlay
  @Nonnull
  default StorageEstimate usage(final int usage) {
    setUsage( usage );
    return this;
  }
}
