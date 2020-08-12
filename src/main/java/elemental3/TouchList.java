package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TouchList interface represents a list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList">TouchList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TouchList"
)
public class TouchList {
  TouchList() {
  }

  /**
   * The length read-only property indicates the number of items (touch points) in a given TouchList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList/length">TouchList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();
}
