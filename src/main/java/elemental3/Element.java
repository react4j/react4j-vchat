package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
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
    name = "Element"
)
public class Element extends Node {
  @Nonnull
  public String className;

  @Nonnull
  public String id;

  @Nonnull
  public String slot;

  public double scrollLeft;

  public double scrollTop;

  @Nonnull
  public String outerHTML;

  @Nullable
  public EventHandler onfullscreenchange;

  @Nullable
  public EventHandler onfullscreenerror;

  @Nonnull
  public String innerHTML;

  Element() {
  }

  @JsProperty(
      name = "attributes"
  )
  @Nonnull
  public native NamedNodeMap attributes();

  @JsProperty(
      name = "classList"
  )
  @Nonnull
  public native DOMTokenList classList();

  @JsProperty(
      name = "localName"
  )
  @Nonnull
  public native String localName();

  @JsProperty(
      name = "namespaceURI"
  )
  @Nullable
  public native String namespaceURI();

  @JsProperty(
      name = "prefix"
  )
  @Nullable
  public native String prefix();

  @JsProperty(
      name = "shadowRoot"
  )
  @Nullable
  public native ShadowRoot shadowRoot();

  @JsProperty(
      name = "tagName"
  )
  @Nonnull
  public native String tagName();

  @JsProperty(
      name = "clientHeight"
  )
  public native int clientHeight();

  @JsProperty(
      name = "clientLeft"
  )
  public native int clientLeft();

  @JsProperty(
      name = "clientTop"
  )
  public native int clientTop();

  @JsProperty(
      name = "clientWidth"
  )
  public native int clientWidth();

  @JsProperty(
      name = "scrollHeight"
  )
  public native int scrollHeight();

  @JsProperty(
      name = "scrollWidth"
  )
  public native int scrollWidth();

  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  @JsProperty(
      name = "nextElementSibling"
  )
  @Nullable
  public native Element nextElementSibling();

  @JsProperty(
      name = "previousElementSibling"
  )
  @Nullable
  public native Element previousElementSibling();

  @Nonnull
  public native ShadowRoot attachShadow(@Nonnull ShadowRootInit init);

  @Nullable
  public native Element closest(@Nonnull String selectors);

  @Nullable
  public native String getAttribute(@Nonnull String qualifiedName);

  @Nullable
  public native String getAttributeNS(@Nullable String namespace, @Nonnull String localName);

  @Nonnull
  public native JsArray<String> getAttributeNames();

  @Nullable
  public native Attr getAttributeNode(@Nonnull String qualifiedName);

  @Nullable
  public native Attr getAttributeNodeNS(@Nullable String namespace, @Nonnull String localName);

  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  @Nonnull
  public native HTMLCollection getElementsByTagName(@Nonnull String qualifiedName);

  @Nonnull
  public native HTMLCollection getElementsByTagNameNS(@Nullable String namespace,
      @Nonnull String localName);

  public native boolean hasAttribute(@Nonnull String qualifiedName);

  public native boolean hasAttributeNS(@Nullable String namespace, @Nonnull String localName);

  public native boolean hasAttributes();

  @Nullable
  public native Element insertAdjacentElement(@Nonnull String where, @Nonnull Element element);

  public native void insertAdjacentText(@Nonnull String where, @Nonnull String data);

  public native boolean matches(@Nonnull String selectors);

  public native void removeAttribute(@Nonnull String qualifiedName);

  public native void removeAttributeNS(@Nullable String namespace, @Nonnull String localName);

  @Nonnull
  public native Attr removeAttributeNode(@Nonnull Attr attr);

  public native void setAttribute(@Nonnull String qualifiedName, @Nonnull String value);

  public native void setAttributeNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String value);

  @Nullable
  public native Attr setAttributeNode(@Nonnull Attr attr);

  @Nullable
  public native Attr setAttributeNodeNS(@Nonnull Attr attr);

  public native boolean toggleAttribute(@Nonnull String qualifiedName, boolean force);

  public native boolean toggleAttribute(@Nonnull String qualifiedName);

  public native boolean webkitMatchesSelector(@Nonnull String selectors);

  @Nullable
  public native CSSPseudoElement pseudo(@Nonnull String type);

  @Nonnull
  public native DOMRect getBoundingClientRect();

  @Nonnull
  public native DOMRectList getClientRects();

  public native void scroll(@Nonnull ScrollToOptions options);

  public native void scroll();

  public native void scroll(double x, double y);

  public native void scrollBy(@Nonnull ScrollToOptions options);

  public native void scrollBy();

  public native void scrollBy(double x, double y);

  public native void scrollIntoView(boolean arg);

  public native void scrollIntoView(@Nonnull ScrollIntoViewOptions arg);

  public native void scrollIntoView();

  public native void scrollTo(@Nonnull ScrollToOptions options);

  public native void scrollTo();

  public native void scrollTo(double x, double y);

  public native void insertAdjacentHTML(@Nonnull String position, @Nonnull String text);

  public native boolean hasPointerCapture(int pointerId);

  public native void releasePointerCapture(int pointerId);

  public native void setPointerCapture(int pointerId);

  public native void requestPointerLock();

  @Nonnull
  public native Promise<Void> requestFullscreen(@Nonnull FullscreenOptions options);

  @Nonnull
  public native Promise<Void> requestFullscreen();

  public native void append(@Nonnull Node... nodes);

  public native void append(@Nonnull String... nodes);

  public native void prepend(@Nonnull Node... nodes);

  public native void prepend(@Nonnull String... nodes);

  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  @Nonnull
  public native NodeList querySelectorAll(@Nonnull String selectors);

  public native void replaceChildren(@Nonnull Node... nodes);

  public native void replaceChildren(@Nonnull String... nodes);

  public native void after(@Nonnull Node... nodes);

  public native void after(@Nonnull String... nodes);

  public native void before(@Nonnull Node... nodes);

  public native void before(@Nonnull String... nodes);

  public native void remove();

  public native void replaceWith(@Nonnull Node... nodes);

  public native void replaceWith(@Nonnull String... nodes);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes, double options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes,
      @Nonnull KeyframeAnimationOptions options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes);

  @Nonnull
  public native JsArray<Animation> getAnimations();
}
