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

  KeyframeEffect() {
  }

  @Nonnull
  public native JsArray<Object> getKeyframes();

  public native void setKeyframes(@Nullable Object keyframes);
}
