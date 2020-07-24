package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSPseudoElement"
)
public class CSSPseudoElement extends EventTarget {
  CSSPseudoElement() {
  }

  @JsProperty(
      name = "element"
  )
  @Nonnull
  public native Element element();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nonnull
  public native Animation animate(@Nullable Object keyframes, double options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes,
      @Nonnull KeyframeAnimationOptions options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes);

  @Nonnull
  public native JsArray<Animation> getAnimations();
}
