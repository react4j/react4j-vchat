package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The ScreenOrientation interface of the the Screen Orientation API provides information about the current orientation of the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation">ScreenOrientation - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ScreenOrientation"
)
public class ScreenOrientation extends EventTarget {
  @Nullable
  public EventHandler onchange;

  ScreenOrientation() {
  }

  /**
   * The angle read-only property of the ScreenOrientation interface returns the document's current orientation angle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/angle">ScreenOrientation.angle - MDN</a>
   */
  @JsProperty(
      name = "angle"
  )
  public native int angle();

  /**
   * The type read-only property of the ScreenOrientation interface returns the document's current orientation type, one of "portrait-primary", "portrait-secondary", "landscape-primary", or "landscape-secondary".
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/type">ScreenOrientation.type - MDN</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * The lock() property of the ScreenOrientation interface locks the orientation of the containing document to its default orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/lock">ScreenOrientation.lock - MDN</a>
   */
  @Nonnull
  public native Promise<Void> lock(
      @MagicConstant(valuesFromClass = OrientationLockType.class) @Nonnull String orientation);

  /**
   * The unlock() property of the ScreenOrientation interface unlocks the orientation of the containing document from its default orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/unlock">ScreenOrientation.unlock - MDN</a>
   */
  public native void unlock();
}
