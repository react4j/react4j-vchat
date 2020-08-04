package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SubmitEvent interface defines the object used to represent an HTML form's submit event. This event is fired at the form when the form's submit action is invoked.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubmitEvent">SubmitEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SubmitEvent"
)
public class SubmitEvent extends Event {
  public SubmitEvent(@Nonnull final String type, @Nonnull final SubmitEventInit eventInitDict) {
    super( null );
  }

  public SubmitEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The read-only submitter property found on the SubmitEvent interface specifies the submit button or other element that was invoked to cause the form to be submitted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SubmitEvent/submitter">SubmitEvent.submitter - MDN</a>
   */
  @JsProperty(
      name = "submitter"
  )
  @Nullable
  public native HTMLElement submitter();
}
