package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration specifying the HTTP method to submit the form with.
 */
@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = FormMethodType.class
)
public @interface FormMethodType {
  /**
   * When the form is inside a &lt;dialog&gt;, closes the dialog on submission.
   */
  @Nonnull
  String dialog = "dialog";

  /**
   * The GET method; form data appended to the action URL with a ? separator. Use this method when the form has no side-effects.
   */
  @Nonnull
  String get = "get";

  /**
   * The POST method; form data sent as the request body.
   */
  @Nonnull
  String post = "post";
}
