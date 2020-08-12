package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLCollection interface represents a generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCollection">HTMLCollection - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLCollection"
)
public class HTMLCollection {
  HTMLCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();
}
