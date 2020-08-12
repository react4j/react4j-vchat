package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The FocusEvent interface represents focus-related events, including focus, blur, focusin, and focusout.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent">FocusEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FocusEvent"
)
public class FocusEvent extends UIEvent {
  public FocusEvent(@Nonnull final String type, @Nonnull final FocusEventInit eventInitDict) {
    super( null );
  }

  public FocusEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The FocusEvent.relatedTarget read-only property is the secondary target, depending on the type of event:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/FocusEvent/relatedTarget">FocusEvent.relatedTarget - MDN</a>
   */
  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();
}
