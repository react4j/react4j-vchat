package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSStyleDeclaration interface represents an object that is a CSS declaration block, and exposes style information and various style-related methods and properties.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration">CSSStyleDeclaration - MDN</a>
 */
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

  /**
   * The CSSStyleDeclaration.getPropertyPriority() method interface returns a DOMString that provides all explicitly set priorities on the CSS property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/getPropertyPriority">CSSStyleDeclaration.getPropertyPriority - MDN</a>
   */
  @Nonnull
  public native String getPropertyPriority(@Nonnull String property);

  /**
   * The CSSStyleDeclaration.getPropertyValue() method interface returns a DOMString containing the value of a specified CSS property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/getPropertyValue">CSSStyleDeclaration.getPropertyValue - MDN</a>
   */
  @Nonnull
  public native String getPropertyValue(@Nonnull String property);

  /**
   * The CSSStyleDeclaration.removeProperty() method interface removes a property from a CSS style declaration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/removeProperty">CSSStyleDeclaration.removeProperty - MDN</a>
   */
  @Nonnull
  public native String removeProperty(@Nonnull String property);

  /**
   * The CSSStyleDeclaration.setProperty() method interface sets a new value for a property on a CSS style declaration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/setProperty">CSSStyleDeclaration.setProperty - MDN</a>
   */
  public native void setProperty(@Nonnull String property, @Nonnull String value,
      @Nonnull String priority);

  /**
   * The CSSStyleDeclaration.setProperty() method interface sets a new value for a property on a CSS style declaration object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration/setProperty">CSSStyleDeclaration.setProperty - MDN</a>
   */
  public native void setProperty(@Nonnull String property, @Nonnull String value);
}
