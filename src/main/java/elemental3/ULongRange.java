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
public interface ULongRange {
  @JsOverlay
  @Nonnull
  static ULongRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  int getMax();

  @JsProperty
  void setMax(int max);

  @JsOverlay
  @Nonnull
  default ULongRange max(final int max) {
    setMax( max );
    return this;
  }

  @JsProperty
  int getMin();

  @JsProperty
  void setMin(int min);

  @JsOverlay
  @Nonnull
  default ULongRange min(final int min) {
    setMin( min );
    return this;
  }
}
