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
    name = "CSSStyleSheet"
)
public class CSSStyleSheet extends StyleSheet {
  CSSStyleSheet() {
  }

  @JsProperty(
      name = "cssRules"
  )
  @Nonnull
  public native CSSRuleList cssRules();

  @JsProperty(
      name = "ownerRule"
  )
  @Nullable
  public native CSSRule ownerRule();

  @JsProperty(
      name = "rules"
  )
  @Nonnull
  public native CSSRuleList rules();

  public native void deleteRule(int index);

  public native int insertRule(@Nonnull String rule, int index);

  public native int insertRule(@Nonnull String rule);

  public native int addRule(@Nonnull String selector, @Nonnull String style, int index);

  public native int addRule(@Nonnull String selector, @Nonnull String style);

  public native int addRule(@Nonnull String selector);

  public native int addRule();

  public native void removeRule(int index);

  public native void removeRule();
}
