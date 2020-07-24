package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationEffect"
)
public class AnimationEffect {
  AnimationEffect() {
  }

  @Nonnull
  public native ComputedEffectTiming getComputedTiming();

  @Nonnull
  public native EffectTiming getTiming();

  public native void updateTiming(@Nonnull OptionalEffectTiming timing);

  public native void updateTiming();
}
