package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The StyleSheetList interface represents a list of StyleSheet.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheetList">StyleSheetList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StyleSheetList"
)
public class StyleSheetList {
  StyleSheetList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();
}
