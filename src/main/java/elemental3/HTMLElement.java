package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLElement interface represents any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement">HTMLElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLElement"
)
public class HTMLElement extends Element {
  @Nonnull
  public String accessKey;

  @Nonnull
  public String autocapitalize;

  /**
   * The HTMLElement.dir property gets or sets the text writing directionality of the content of the current element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/dir">HTMLElement.dir - MDN</a>
   */
  @Nonnull
  public String dir;

  public boolean draggable;

  /**
   * The HTMLElement property hidden is a Boolean which is true if the element is hidden; otherwise the value is false. This is quite different from using the CSS property display to control the visibility of an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/hidden">HTMLElement.hidden - MDN</a>
   */
  public boolean hidden;

  /**
   * The innerText property of the HTMLElement interface represents the "rendered" text content of a node and its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/innerText">HTMLElement.innerText - MDN</a>
   */
  @Nonnull
  public String innerText;

  /**
   * The HTMLElement.lang property gets or sets the base language of an element's attribute values and text content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/lang">HTMLElement.lang - MDN</a>
   */
  @Nonnull
  public String lang;

  public boolean spellcheck;

  /**
   * The HTMLElement.title property represents the title of the element: the text usually displayed in a 'tooltip' popup when the mouse is over the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/title">HTMLElement.title - MDN</a>
   */
  @Nonnull
  public String title;

  public boolean translate;

  /**
   * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/contentEditable">HTMLElement.contentEditable - MDN</a>
   */
  @Nonnull
  public String contentEditable;

  @Nonnull
  public String enterKeyHint;

  @Nonnull
  public String inputMode;

  @Nullable
  public EventHandler onabort;

  @Nullable
  public EventHandler onauxclick;

  @Nullable
  public EventHandler onblur;

  @Nullable
  public EventHandler oncancel;

  @Nullable
  public EventHandler oncanplay;

  @Nullable
  public EventHandler oncanplaythrough;

  @Nullable
  public EventHandler onchange;

  @Nullable
  public EventHandler onclick;

  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler oncontextmenu;

  @Nullable
  public EventHandler oncuechange;

  @Nullable
  public EventHandler ondblclick;

  @Nullable
  public EventHandler ondrag;

  @Nullable
  public EventHandler ondragend;

  @Nullable
  public EventHandler ondragenter;

  @Nullable
  public EventHandler ondragexit;

  @Nullable
  public EventHandler ondragleave;

  @Nullable
  public EventHandler ondragover;

  @Nullable
  public EventHandler ondragstart;

  @Nullable
  public EventHandler ondrop;

  @Nullable
  public EventHandler ondurationchange;

  @Nullable
  public EventHandler onemptied;

  @Nullable
  public EventHandler onended;

  @Nullable
  public OnErrorEventHandler onerror;

  @Nullable
  public EventHandler onfocus;

  @Nullable
  public EventHandler onformdata;

  @Nullable
  public EventHandler oninput;

  @Nullable
  public EventHandler oninvalid;

  @Nullable
  public EventHandler onkeydown;

  @Nullable
  public EventHandler onkeypress;

  @Nullable
  public EventHandler onkeyup;

  @Nullable
  public EventHandler onload;

  @Nullable
  public EventHandler onloadeddata;

  @Nullable
  public EventHandler onloadedmetadata;

  @Nullable
  public EventHandler onloadstart;

  @Nullable
  public EventHandler onmousedown;

  @Nullable
  public EventHandler onmouseenter;

  @Nullable
  public EventHandler onmouseleave;

  @Nullable
  public EventHandler onmousemove;

  @Nullable
  public EventHandler onmouseout;

  @Nullable
  public EventHandler onmouseover;

  @Nullable
  public EventHandler onmouseup;

  @Nullable
  public EventHandler onpause;

  @Nullable
  public EventHandler onplay;

  @Nullable
  public EventHandler onplaying;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  @Nullable
  public EventHandler onreset;

  @Nullable
  public EventHandler onresize;

  @Nullable
  public EventHandler onscroll;

  @Nullable
  public EventHandler onsecuritypolicyviolation;

  @Nullable
  public EventHandler onseeked;

  @Nullable
  public EventHandler onseeking;

  @Nullable
  public EventHandler onselect;

  @Nullable
  public EventHandler onslotchange;

  @Nullable
  public EventHandler onstalled;

  @Nullable
  public EventHandler onsubmit;

  @Nullable
  public EventHandler onsuspend;

  @Nullable
  public EventHandler ontimeupdate;

  @Nullable
  public EventHandler ontoggle;

  @Nullable
  public EventHandler onvolumechange;

  @Nullable
  public EventHandler onwaiting;

  @Nullable
  public EventHandler onwebkitanimationend;

  @Nullable
  public EventHandler onwebkitanimationiteration;

  @Nullable
  public EventHandler onwebkitanimationstart;

  @Nullable
  public EventHandler onwebkittransitionend;

  @Nullable
  public EventHandler onwheel;

  @Nullable
  public EventHandler onanimationcancel;

  @Nullable
  public EventHandler onanimationend;

  @Nullable
  public EventHandler onanimationiteration;

  @Nullable
  public EventHandler onanimationstart;

  @Nullable
  public EventHandler ontransitioncancel;

  @Nullable
  public EventHandler ontransitionend;

  @Nullable
  public EventHandler ontransitionrun;

  @Nullable
  public EventHandler ontransitionstart;

  @Nullable
  public EventHandler ongotpointercapture;

  @Nullable
  public EventHandler onlostpointercapture;

  @Nullable
  public EventHandler onpointercancel;

  @Nullable
  public EventHandler onpointerdown;

  @Nullable
  public EventHandler onpointerenter;

  @Nullable
  public EventHandler onpointerleave;

  @Nullable
  public EventHandler onpointermove;

  @Nullable
  public EventHandler onpointerout;

  @Nullable
  public EventHandler onpointerover;

  @Nullable
  public EventHandler onpointerup;

  @Nullable
  public EventHandler onselectionchange;

  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler ontouchcancel;

  @Nullable
  public EventHandler ontouchend;

  @Nullable
  public EventHandler ontouchmove;

  @Nullable
  public EventHandler ontouchstart;

  public boolean autofocus;

  @Nonnull
  public String nonce;

  public int tabIndex;

  @Nullable
  public EventHandler oncopy;

  @Nullable
  public EventHandler oncut;

  @Nullable
  public EventHandler onpaste;

  public HTMLElement() {
  }

  /**
   * The HTMLElement.accessKeyLabel read-only property returns a String that represents the element's assigned access key (if any); otherwise it returns an empty string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/accessKeyLabel">HTMLElement.accessKeyLabel - MDN</a>
   */
  @JsProperty(
      name = "accessKeyLabel"
  )
  @Nonnull
  public native String accessKeyLabel();

  /**
   * The HTMLElement.offsetHeight read-only property returns the height of an element, including vertical padding and borders, as an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetHeight">HTMLElement.offsetHeight - MDN</a>
   */
  @JsProperty(
      name = "offsetHeight"
  )
  public native int offsetHeight();

  /**
   * The HTMLElement.offsetLeft read-only property returns the number of pixels that the upper left corner of the current element is offset to the left within the HTMLElement.offsetParent node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetLeft">HTMLElement.offsetLeft - MDN</a>
   */
  @JsProperty(
      name = "offsetLeft"
  )
  public native int offsetLeft();

  /**
   * The HTMLElement.offsetParent read-only property returns a reference to the element which is the closest (nearest in the containment hierarchy) positioned ancestor element. If there is no positioned ancestor element, the nearest ancestor td, th, table will be returned, or the body if there are no ancestor table elements either.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetParent">HTMLElement.offsetParent - MDN</a>
   */
  @JsProperty(
      name = "offsetParent"
  )
  @Nullable
  public native Element offsetParent();

  /**
   * The HTMLElement.offsetTop read-only property returns the distance of the current element relative to the top of the offsetParent node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetTop">HTMLElement.offsetTop - MDN</a>
   */
  @JsProperty(
      name = "offsetTop"
  )
  public native int offsetTop();

  /**
   * The HTMLElement.offsetWidth read-only property returns the layout width of an element as an integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/offsetWidth">HTMLElement.offsetWidth - MDN</a>
   */
  @JsProperty(
      name = "offsetWidth"
  )
  public native int offsetWidth();

  /**
   * The HTMLElement.isContentEditable read-only property returns a Boolean that is true if the contents of the element are editable; otherwise it returns false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/isContentEditable">HTMLElement.isContentEditable - MDN</a>
   */
  @JsProperty(
      name = "isContentEditable"
  )
  public native boolean isContentEditable();

  /**
   * The style property is used to get as well as set the inline style of an element. When getting, it returns a CSSStyleDeclaration object that contains a list of all styles properties for that element with values assigned for the attributes that are defined in the element's inline style attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/style">HTMLElement.style - MDN</a>
   */
  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();

  @JsProperty(
      name = "dataset"
  )
  @Nonnull
  public native DOMStringMap dataset();

  @Nonnull
  public native ElementInternals attachInternals();

  /**
   * The HTMLElement.click() method simulates a mouse click on an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/click">HTMLElement.click - MDN</a>
   */
  public native void click();

  public native void blur();

  public native void focus(@Nonnull FocusOptions options);

  public native void focus();
}
