package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSGroupingRule"
)
public class CSSGroupingRule extends CSSRule {
  CSSGroupingRule() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  public native void deleteRule(int index);

  public native int insertRule(@Nonnull String rule, int index);

  public native int insertRule(@Nonnull String rule);
}
