package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Text interface represents the textual content of Element or Attr.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text">Text - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Text"
)
public class Text extends CharacterData {
  public Text(@Nonnull final String data) {
  }

  public Text() {
  }

  /**
   * The Text.wholeText read-only property returns the full text of all Text nodes logically adjacent to the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/wholeText">Text.wholeText - MDN</a>
   */
  @JsProperty(
      name = "wholeText"
  )
  @Nonnull
  public native String wholeText();

  /**
   * The assignedSlot property of the Text interface returns the HTMLSlotElement object associated with the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/assignedSlot">Text.assignedSlot - MDN</a>
   */
  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  @Nonnull
  public native Text splitText(int offset);
}
