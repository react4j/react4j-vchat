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
public interface DoubleRange {
  @JsOverlay
  @Nonnull
  static DoubleRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  double getMax();

  @JsProperty
  void setMax(double max);

  @JsOverlay
  @Nonnull
  default DoubleRange max(final double max) {
    setMax( max );
    return this;
  }

  @JsProperty
  double getMin();

  @JsProperty
  void setMin(double min);

  @JsOverlay
  @Nonnull
  default DoubleRange min(final double min) {
    setMin( min );
    return this;
  }
}
