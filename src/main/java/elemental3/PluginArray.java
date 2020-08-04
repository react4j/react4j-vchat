package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PluginArray interface is used to store a list of Plugin objects describing the available plugins; it's returned by the window.navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem("name") methods.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PluginArray">PluginArray - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PluginArray"
)
public class PluginArray {
  PluginArray() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native void refresh(boolean reload);

  public native void refresh();
}
