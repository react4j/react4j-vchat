package elemental3;

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
public interface BaseComputedKeyframe {
  @JsOverlay
  @Nonnull
  static BaseComputedKeyframe create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  String getComposite();

  @JsProperty
  void setComposite(@Nonnull String composite);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe composite(@Nonnull final String composite) {
    setComposite( composite );
    return this;
  }

  @JsProperty
  double getComputedOffset();

  @JsProperty
  void setComputedOffset(double computedOffset);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe computedOffset(final double computedOffset) {
    setComputedOffset( computedOffset );
    return this;
  }

  @JsProperty
  String getEasing();

  @JsProperty
  void setEasing(@Nonnull String easing);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe easing(@Nonnull final String easing) {
    setEasing( easing );
    return this;
  }

  @JsProperty
  @Nullable
  Double getOffset();

  @JsProperty
  void setOffset(@Nullable Double offset);

  @JsOverlay
  @Nonnull
  default BaseComputedKeyframe offset(@Nullable final Double offset) {
    setOffset( offset );
    return this;
  }
}
