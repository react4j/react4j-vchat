package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLUListElement interface provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating unordered list elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLUListElement">HTMLUListElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLUListElement"
)
public class HTMLUListElement extends HTMLElement {
  public boolean compact;

  @Nonnull
  public String type;

  protected HTMLUListElement() {
  }
}
