package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Fired on an HTMLSlotElement instance (slot element) when the node(s) contained in that slot change.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement">HTMLSlotElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSlotElement"
)
public class HTMLSlotElement extends HTMLElement {
  /**
   * The name property of the HTMLSlotElement interface returns or sets the slot name. A slot is a placeholder inside a web component that users can fill with their own markup.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/name">HTMLSlotElement.name - MDN</a>
   */
  @Nonnull
  public String name;

  public HTMLSlotElement() {
  }

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedElements() property of the HTMLSlotElement interface returns a sequence of the elements assigned to this slot (and no other nodes). If the flatten option is set to true, it also returns the assigned elements of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedElements">HTMLSlotElement.assignedElements - MDN</a>
   */
  @Nonnull
  public native JsArray<Element> assignedElements();

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   */
  @Nonnull
  public native JsArray<Node> assignedNodes(@Nonnull AssignedNodesOptions options);

  /**
   * The assignedNodes() property of the HTMLSlotElement interface returns a sequence of the nodes assigned to this slot, and if the flatten option is set to true, the assigned nodes of any other slots that are descendants of this slot. If no assigned nodes are found, it returns the slot's fallback content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSlotElement/assignedNodes">HTMLSlotElement.assignedNodes - MDN</a>
   */
  @Nonnull
  public native JsArray<Node> assignedNodes();
}
