package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedString">SVGAnimatedString - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAnimatedString"
)
public class SVGAnimatedString {
  /**
   * BaseVal gets or sets the base value of the given attribute before any animations are applied.The base value of the given attribute before applying any animations. Setter throws DOMException.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedString/baseVal">SVGAnimatedString.baseVal - MDN</a>
   */
  @Nonnull
  public String baseVal;

  SVGAnimatedString() {
  }

  /**
   * AnimVal attribute or animVal property contains the same value as the baseVal property.If the given attribute or property is being animated, contains the current animated value of the attribute or property. If the given attribute or property is not currently being animated, then it contains the same value as baseVal
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAnimatedString/animVal">SVGAnimatedString.animVal - MDN</a>
   */
  @JsProperty(
      name = "animVal"
  )
  @Nonnull
  public native String animVal();
}
