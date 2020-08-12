package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Comment interface represents textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Comment">Comment - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Comment"
)
public class Comment extends CharacterData {
  public Comment(@Nonnull final String data) {
  }

  public Comment() {
  }
}
