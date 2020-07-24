package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Node"
)
public class Node extends EventTarget {
  @JsOverlay
  public static final int ATTRIBUTE_NODE = 2;

  @JsOverlay
  public static final int CDATA_SECTION_NODE = 4;

  @JsOverlay
  public static final int COMMENT_NODE = 8;

  @JsOverlay
  public static final int DOCUMENT_FRAGMENT_NODE = 11;

  @JsOverlay
  public static final int DOCUMENT_NODE = 9;

  @JsOverlay
  public static final int DOCUMENT_POSITION_CONTAINED_BY = 0x10;

  @JsOverlay
  public static final int DOCUMENT_POSITION_CONTAINS = 0x08;

  @JsOverlay
  public static final int DOCUMENT_POSITION_DISCONNECTED = 0x01;

  @JsOverlay
  public static final int DOCUMENT_POSITION_FOLLOWING = 0x04;

  @JsOverlay
  public static final int DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 0x20;

  @JsOverlay
  public static final int DOCUMENT_POSITION_PRECEDING = 0x02;

  @JsOverlay
  public static final int DOCUMENT_TYPE_NODE = 10;

  @JsOverlay
  public static final int ELEMENT_NODE = 1;

  @JsOverlay
  public static final int ENTITY_NODE = 6;

  @JsOverlay
  public static final int ENTITY_REFERENCE_NODE = 5;

  @JsOverlay
  public static final int NOTATION_NODE = 12;

  @JsOverlay
  public static final int PROCESSING_INSTRUCTION_NODE = 7;

  @JsOverlay
  public static final int TEXT_NODE = 3;

  @Nullable
  public String nodeValue;

  @Nullable
  public String textContent;

  Node() {
  }

  @JsProperty(
      name = "baseURI"
  )
  @Nonnull
  public native String baseURI();

  @JsProperty(
      name = "childNodes"
  )
  @Nonnull
  public native NodeList childNodes();

  @JsProperty(
      name = "firstChild"
  )
  @Nullable
  public native Node firstChild();

  @JsProperty(
      name = "isConnected"
  )
  public native boolean isConnected();

  @JsProperty(
      name = "lastChild"
  )
  @Nullable
  public native Node lastChild();

  @JsProperty(
      name = "nextSibling"
  )
  @Nullable
  public native Node nextSibling();

  @JsProperty(
      name = "nodeName"
  )
  @Nonnull
  public native String nodeName();

  @JsProperty(
      name = "nodeType"
  )
  public native int nodeType();

  @JsProperty(
      name = "ownerDocument"
  )
  @Nullable
  public native Document ownerDocument();

  @JsProperty(
      name = "parentElement"
  )
  @Nullable
  public native Element parentElement();

  @JsProperty(
      name = "parentNode"
  )
  @Nullable
  public native Node parentNode();

  @JsProperty(
      name = "previousSibling"
  )
  @Nullable
  public native Node previousSibling();

  @Nonnull
  public native Node appendChild(@Nonnull Node node);

  @Nonnull
  public native Node cloneNode(boolean deep);

  @Nonnull
  public native Node cloneNode();

  public native int compareDocumentPosition(@Nonnull Node other);

  public native boolean contains(@Nullable Node other);

  @Nonnull
  public native Node getRootNode(@Nonnull GetRootNodeOptions options);

  @Nonnull
  public native Node getRootNode();

  public native boolean hasChildNodes();

  @Nonnull
  public native Node insertBefore(@Nonnull Node node, @Nullable Node child);

  public native boolean isDefaultNamespace(@Nullable String namespace);

  public native boolean isEqualNode(@Nullable Node otherNode);

  public native boolean isSameNode(@Nullable Node otherNode);

  @Nullable
  public native String lookupNamespaceURI(@Nullable String prefix);

  @Nullable
  public native String lookupPrefix(@Nullable String namespace);

  public native void normalize();

  @Nonnull
  public native Node removeChild(@Nonnull Node child);

  @Nonnull
  public native Node replaceChild(@Nonnull Node node, @Nonnull Node child);
}
