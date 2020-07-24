package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TreeWalker"
)
public class TreeWalker {
  @Nonnull
  public Node currentNode;

  TreeWalker() {
  }

  @JsProperty(
      name = "filter"
  )
  @Nullable
  public native NodeFilter filter();

  @JsProperty(
      name = "root"
  )
  @Nonnull
  public native Node root();

  @JsProperty(
      name = "whatToShow"
  )
  public native int whatToShow();

  @Nullable
  public native Node firstChild();

  @Nullable
  public native Node lastChild();

  @Nullable
  public native Node nextNode();

  @Nullable
  public native Node nextSibling();

  @Nullable
  public native Node parentNode();

  @Nullable
  public native Node previousNode();

  @Nullable
  public native Node previousSibling();
}
