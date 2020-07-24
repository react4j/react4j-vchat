package elemental3;

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
    name = "CSSKeyframesRule"
)
public class CSSKeyframesRule extends CSSRule {
  @Nonnull
  public String name;

  CSSKeyframesRule() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  public native void appendRule(@Nonnull String rule);

  public native void deleteRule(@Nonnull String select);

  @Nullable
  public native CSSKeyframeRule findRule(@Nonnull String select);
}
