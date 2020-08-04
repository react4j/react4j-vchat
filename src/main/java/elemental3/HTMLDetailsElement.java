package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLDetailsElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating details elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDetailsElement">HTMLDetailsElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDetailsElement"
)
public class HTMLDetailsElement extends HTMLElement {
  public boolean open;

  public HTMLDetailsElement() {
  }
}
