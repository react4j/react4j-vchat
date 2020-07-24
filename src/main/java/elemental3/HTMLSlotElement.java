package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSlotElement"
)
public class HTMLSlotElement extends HTMLElement {
  @Nonnull
  public String name;

  public HTMLSlotElement() {
  }

  @Nonnull
  public native JsArray<Element> assignedElements(@Nonnull AssignedNodesOptions options);

  @Nonnull
  public native JsArray<Element> assignedElements();

  @Nonnull
  public native JsArray<Node> assignedNodes(@Nonnull AssignedNodesOptions options);

  @Nonnull
  public native JsArray<Node> assignedNodes();
}
