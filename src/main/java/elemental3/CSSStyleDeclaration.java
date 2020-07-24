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
    name = "CSSStyleDeclaration"
)
public class CSSStyleDeclaration {
  @Nonnull
  public String cssFloat;

  @Nonnull
  public String cssText;

  CSSStyleDeclaration() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "parentRule"
  )
  @Nullable
  public native CSSRule parentRule();

  @Nonnull
  public native String getPropertyPriority(@Nonnull String property);

  @Nonnull
  public native String getPropertyValue(@Nonnull String property);

  @Nonnull
  public native String removeProperty(@Nonnull String property);

  public native void setProperty(@Nonnull String property, @Nonnull String value,
      @Nonnull String priority);

  public native void setProperty(@Nonnull String property, @Nonnull String value);
}
