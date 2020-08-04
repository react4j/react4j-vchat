package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLFormElement interface represents a form element in the DOM. It allows access to—and, in some cases, modification of—aspects of the form, as well as access to its component elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement">HTMLFormElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFormElement"
)
public class HTMLFormElement extends HTMLElement {
  /**
   * The HTMLFormElement.acceptCharset property represents a list of the supported character encodings for the given form element. This list can be comma-separated or space-separated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/acceptCharset">HTMLFormElement.acceptCharset - MDN</a>
   */
  @Nonnull
  public String acceptCharset;

  /**
   * The HTMLFormElement.action property represents the action of the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/action">HTMLFormElement.action - MDN</a>
   */
  @Nonnull
  public String action;

  @Nonnull
  public String autocomplete;

  /**
   * The HTMLFormElement.encoding property is an alternative name for the enctype element on the DOM HTMLFormElement object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/encoding">HTMLFormElement.encoding - MDN</a>
   */
  @Nonnull
  public String encoding;

  /**
   * The HTMLFormElement.enctype property is the MIME type of content that is used to submit the form to the server. Possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/enctype">HTMLFormElement.enctype - MDN</a>
   */
  @Nonnull
  public String enctype;

  /**
   * The HTMLFormElement.method property represents the HTTP method used to submit the form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/method">HTMLFormElement.method - MDN</a>
   */
  @Nonnull
  public String method;

  /**
   * The HTMLFormElement.name property represents the name of the current form element as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/name">HTMLFormElement.name - MDN</a>
   */
  @Nonnull
  public String name;

  public boolean noValidate;

  @Nonnull
  public String rel;

  /**
   * The target property of the HTMLFormElement interface represents the target of the form's action (i.e., the frame in which to render its output).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/target">HTMLFormElement.target - MDN</a>
   */
  @Nonnull
  public String target;

  public HTMLFormElement() {
  }

  /**
   * The HTMLFormElement property elements returns an HTMLFormControlsCollection listing all the form controls contained in the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/elements">HTMLFormElement.elements - MDN</a>
   */
  @JsProperty(
      name = "elements"
  )
  @Nonnull
  public native HTMLFormControlsCollection elements();

  /**
   * The HTMLFormElement.length read-only property returns the number of controls in the form element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/length">HTMLFormElement.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  public native boolean checkValidity();

  /**
   * The HTMLFormElement.reportValidity() method returns true if the element's child controls satisfy their validation constraints. When false is returned, cancelable invalid events are fired for each invalid child and validation problems are reported to the user.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/reportValidity">HTMLFormElement.reportValidity - MDN</a>
   */
  public native boolean reportValidity();

  /**
   * The HTMLFormElement method requestSubmit() requests that the form be submitted using a specific submit button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/requestSubmit">HTMLFormElement.requestSubmit - MDN</a>
   */
  public native void requestSubmit(@Nullable HTMLElement submitter);

  /**
   * The HTMLFormElement method requestSubmit() requests that the form be submitted using a specific submit button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/requestSubmit">HTMLFormElement.requestSubmit - MDN</a>
   */
  public native void requestSubmit();

  /**
   * The HTMLFormElement.reset() method restores a form element's default values. This method does the same thing as clicking the form's reset button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/reset">HTMLFormElement.reset - MDN</a>
   */
  public native void reset();

  /**
   * The HTMLFormElement.submit() method submits a given form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement/submit">HTMLFormElement.submit - MDN</a>
   */
  public native void submit();
}
