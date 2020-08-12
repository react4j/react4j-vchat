package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList">NodeList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeList"
)
public class NodeList {
  NodeList() {
  }

  /**
   * The NodeList.length property returns the number of items in a NodeList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/length">NodeList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();
}
