package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "KeyframeEffect"
)
public class KeyframeEffect extends AnimationEffect {
  @Nonnull
  public String composite;

  @Nonnull
  public String iterationComposite;

  @Nullable
  public ElementOrCSSPseudoElementUnion target;

  public KeyframeEffect(@Nonnull final Element target, @Nullable final Object keyframes,
      final double options) {
  }

  public KeyframeEffect(@Nonnull final CSSPseudoElement target, @Nullable final Object keyframes,
      final double options) {
  }

  public KeyframeEffect(@Nonnull final Element target, @Nullable final Object keyframes,
      @Nonnull final KeyframeEffectOptions options) {
  }

  public KeyframeEffect(@Nonnull final CSSPseudoElement target, @Nullable final Object keyframes,
      @Nonnull final KeyframeEffectOptions options) {
  }

  public KeyframeEffect(@Nonnull final Element target, @Nullable final Object keyframes) {
  }

  public KeyframeEffect(@Nonnull final CSSPseudoElement target, @Nullable final Object keyframes) {
  }

  public KeyframeEffect(@Nonnull final KeyframeEffect source) {
  }

  @Nonnull
  public native JsArray<Object> getKeyframes();

  public native void setKeyframes(@Nullable Object keyframes);
}
