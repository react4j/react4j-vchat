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
    name = "NodeIterator"
)
public class NodeIterator {
  NodeIterator() {
  }

  @JsProperty(
      name = "filter"
  )
  @Nullable
  public native NodeFilter filter();

  @JsProperty(
      name = "pointerBeforeReferenceNode"
  )
  public native boolean pointerBeforeReferenceNode();

  @JsProperty(
      name = "referenceNode"
  )
  @Nonnull
  public native Node referenceNode();

  @JsProperty(
      name = "root"
  )
  @Nonnull
  public native Node root();

  @JsProperty(
      name = "whatToShow"
  )
  public native int whatToShow();

  public native void detach();

  @Nullable
  public native Node nextNode();

  @Nullable
  public native Node previousNode();
}
