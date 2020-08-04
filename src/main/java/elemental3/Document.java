package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document">Document - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Document"
)
public class Document extends Node {
  /**
   * The Document.onvisibilitychange property represents the event handler that is called when a visibilitychange event reaches this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/onvisibilitychange">Document.onvisibilitychange - MDN</a>
   */
  @Nullable
  public EventHandler onvisibilitychange;

  @Nullable
  public EventHandler onpointerlockchange;

  @Nullable
  public EventHandler onpointerlockerror;

  @Nullable
  public EventHandler onfullscreenchange;

  @Nullable
  public EventHandler onfullscreenerror;

  /**
   * The Document.body property represents the body or frameset node of the current document, or null if no such element exists.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/body">Document.body - MDN</a>
   */
  @Nullable
  public HTMLElement body;

  @Nonnull
  public String cookie;

  @Nonnull
  public String designMode;

  @Nonnull
  public String dir;

  @Nonnull
  public String domain;

  @Nullable
  public EventHandler onreadystatechange;

  @Nonnull
  public String title;

  @Nonnull
  public String alinkColor;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String fgColor;

  @Nonnull
  public String linkColor;

  @Nonnull
  public String vlinkColor;

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

  @Nullable
  public EventHandler oncopy;

  @Nullable
  public EventHandler oncut;

  @Nullable
  public EventHandler onpaste;

  public Document() {
  }

  @JsProperty(
      name = "URL"
  )
  @Nonnull
  public native String URL();

  /**
   * The Document.characterSet read-only property returns the character encoding of the document that it's currently rendered with.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/characterSet">Document.characterSet - MDN</a>
   */
  @JsProperty(
      name = "characterSet"
  )
  @Nonnull
  public native String characterSet();

  @JsProperty(
      name = "charset"
  )
  @Nonnull
  public native String charset();

  /**
   * The Document.compatMode property indicates whether the document is rendered in Quirks mode or Standards mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/compatMode">Document.compatMode - MDN</a>
   */
  @JsProperty(
      name = "compatMode"
  )
  @Nonnull
  public native String compatMode();

  /**
   * The Document.contentType read-only property returns the MIME type that the document is being rendered as. This may come from HTTP headers or other sources of MIME information, and might be affected by automatic type conversions performed by either the browser or extensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/contentType">Document.contentType - MDN</a>
   */
  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  public native String contentType();

  /**
   * Returns the Document Type Declaration (DTD) associated with current document. The returned object implements the DocumentType interface. Use DOMImplementation.createDocumentType() to create a DocumentType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/doctype">Document.doctype - MDN</a>
   */
  @JsProperty(
      name = "doctype"
  )
  @Nullable
  public native DocumentType doctype();

  /**
   * Document.documentElement returns the Element that is the root element of the document (for example, the html element for HTML documents).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/documentElement">Document.documentElement - MDN</a>
   */
  @JsProperty(
      name = "documentElement"
  )
  @Nullable
  public native Element documentElement();

  /**
   * The documentURI read-only property of the Document interface returns the document location as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/documentURI">Document.documentURI - MDN</a>
   */
  @JsProperty(
      name = "documentURI"
  )
  @Nonnull
  public native String documentURI();

  /**
   * The Document.implementation property returns a DOMImplementation object associated with the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/implementation">Document.implementation - MDN</a>
   */
  @JsProperty(
      name = "implementation"
  )
  @Nonnull
  public native DOMImplementation implementation();

  @JsProperty(
      name = "inputEncoding"
  )
  @Nonnull
  public native String inputEncoding();

  /**
   * The scrollingElement read-only property of the Document interface returns a reference to the Element that scrolls the document. In standards mode, this is the root element of the document, document.documentElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scrollingElement">Document.scrollingElement - MDN</a>
   */
  @JsProperty(
      name = "scrollingElement"
  )
  @Nullable
  public native Element scrollingElement();

  /**
   * The Document.hidden read-only property returns a Boolean value indicating if the page is considered hidden or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/hidden">Document.hidden - MDN</a>
   */
  @JsProperty(
      name = "hidden"
  )
  public native boolean hidden();

  /**
   * The Document.visibilityState read-only property returns the visibility of the document, that is in which context this element is now visible. It is useful to know if the document is in the background or an invisible tab, or only loaded for pre-rendering.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/visibilityState">Document.visibilityState - MDN</a>
   */
  @JsProperty(
      name = "visibilityState"
  )
  @Nonnull
  public native String visibilityState();

  @JsProperty(
      name = "rootElement"
  )
  @Nullable
  public native SVGSVGElement rootElement();

  /**
   * The timeline readonly property of the Document interface represents the default timeline of the current document. This timeline is a special instance of DocumentTimeline that is automatically created on page load.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/timeline">Document.timeline - MDN</a>
   */
  @JsProperty(
      name = "timeline"
  )
  @Nonnull
  public native DocumentTimeline timeline();

  @JsProperty(
      name = "fullscreen"
  )
  public native boolean fullscreen();

  @JsProperty(
      name = "fullscreenEnabled"
  )
  public native boolean fullscreenEnabled();

  @JsProperty(
      name = "currentScript"
  )
  @Nullable
  public native HTMLOrSVGScriptElement currentScript();

  @JsProperty(
      name = "defaultView"
  )
  @Nullable
  public native Window defaultView();

  /**
   * The embeds read-only property of the Document interface returns a list of the embedded object elements within the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/embeds">Document.embeds - MDN</a>
   */
  @JsProperty(
      name = "embeds"
  )
  @Nonnull
  public native HTMLCollection embeds();

  /**
   * The forms read-only property of the Document interface returns an HTMLCollection listing all the form elements contained in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/forms">Document.forms - MDN</a>
   */
  @JsProperty(
      name = "forms"
  )
  @Nonnull
  public native HTMLCollection forms();

  /**
   * The head read-only property of the Document interface returns the head element of the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/head">Document.head - MDN</a>
   */
  @JsProperty(
      name = "head"
  )
  @Nullable
  public native HTMLHeadElement head();

  /**
   * The images read-only property of the Document interface returns a collection of the images in the current HTML document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/images">Document.images - MDN</a>
   */
  @JsProperty(
      name = "images"
  )
  @Nonnull
  public native HTMLCollection images();

  @JsProperty(
      name = "lastModified"
  )
  @Nonnull
  public native String lastModified();

  /**
   * The links read-only property of the Document interface returns a collection of all area elements and a elements in a document with a value for the href attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/links">Document.links - MDN</a>
   */
  @JsProperty(
      name = "links"
  )
  @Nonnull
  public native HTMLCollection links();

  @JsProperty(
      name = "location"
  )
  @Nullable
  public native Location location();

  /**
   * The plugins read-only property of the Document interface returns an HTMLCollection object containing one or more HTMLEmbedElements representing the embed elements in the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/plugins">Document.plugins - MDN</a>
   */
  @JsProperty(
      name = "plugins"
  )
  @Nonnull
  public native HTMLCollection plugins();

  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  public native String readyState();

  @JsProperty(
      name = "referrer"
  )
  @Nonnull
  public native String referrer();

  /**
   * The scripts property of the Document interface returns a list of the script elements in the document. The returned object is an HTMLCollection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/scripts">Document.scripts - MDN</a>
   */
  @JsProperty(
      name = "scripts"
  )
  @Nonnull
  public native HTMLCollection scripts();

  @JsProperty(
      name = "all"
  )
  @Nonnull
  public native HTMLAllCollection all();

  /**
   * The anchors read-only property of the Document interface returns a list of all of the anchors in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/anchors">Document.anchors - MDN</a>
   */
  @JsProperty(
      name = "anchors"
  )
  @Nonnull
  public native HTMLCollection anchors();

  @JsProperty(
      name = "applets"
  )
  @Nonnull
  public native HTMLCollection applets();

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
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();

  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();

  /**
   * Document.adoptNode() transfers a node from another document into the method's document. The adopted node and its subtree is removed from its original document (if any), and its ownerDocument is changed to the current document. The node can then be inserted into the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/adoptNode">Document.adoptNode - MDN</a>
   */
  @Nonnull
  public native Node adoptNode(@Nonnull Node node);

  /**
   * The Document.createAttribute() method creates a new attribute node, and returns it. The object created a node implementing the Attr interface. The DOM does not enforce what sort of attributes can be added to a particular element in this manner.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createAttribute">Document.createAttribute - MDN</a>
   */
  @Nonnull
  public native Attr createAttribute(@Nonnull String localName);

  @Nonnull
  public native Attr createAttributeNS(@Nullable String namespace, @Nonnull String qualifiedName);

  /**
   * createCDATASection() creates a new CDATA section node, and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createCDATASection">Document.createCDATASection - MDN</a>
   */
  @Nonnull
  public native CDATASection createCDATASection(@Nonnull String data);

  /**
   * createComment() creates a new comment node, and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createComment">Document.createComment - MDN</a>
   */
  @Nonnull
  public native Comment createComment(@Nonnull String data);

  /**
   * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createDocumentFragment">Document.createDocumentFragment - MDN</a>
   */
  @Nonnull
  public native DocumentFragment createDocumentFragment();

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName, @Nonnull String options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName,
      @Nonnull ElementCreationOptions options);

  /**
   * In an HTML document, the document.createElement() method creates the HTML element specified by tagName, or an HTMLUnknownElement if tagName isn't recognized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElement">Document.createElement - MDN</a>
   */
  @Nonnull
  public native Element createElement(@Nonnull String localName);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull ElementCreationOptions options);

  /**
   * Creates an element with the specified namespace URI and qualified name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createElementNS">Document.createElementNS - MDN</a>
   */
  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName);

  /**
   * Creates an event of the type specified. The returned object should be first initialized and can then be passed to EventTarget.dispatchEvent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createEvent">Document.createEvent - MDN</a>
   */
  @Nonnull
  public native Event createEvent(@Nonnull String interface_);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow);

  /**
   * Returns a new NodeIterator object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createNodeIterator">Document.createNodeIterator - MDN</a>
   */
  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root);

  /**
   * createProcessingInstruction() generates a new processing instruction node and returns it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createProcessingInstruction">Document.createProcessingInstruction - MDN</a>
   */
  @Nonnull
  public native ProcessingInstruction createProcessingInstruction(@Nonnull String target,
      @Nonnull String data);

  /**
   * The Document.createRange() method returns a new Range object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createRange">Document.createRange - MDN</a>
   */
  @Nonnull
  public native Range createRange();

  /**
   * Creates a new Text node. This method can be used to escape HTML characters.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTextNode">Document.createTextNode - MDN</a>
   */
  @Nonnull
  public native Text createTextNode(@Nonnull String data);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow);

  /**
   * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/createTreeWalker">Document.createTreeWalker - MDN</a>
   */
  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root);

  /**
   * returns an array-like object of all child elements which have all of the given class name(s).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByClassName">Document.getElementsByClassName - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  /**
   * returns an HTMLCollection of elements with the given tag name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByTagName">Document.getElementsByTagName - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagName(@Nonnull String qualifiedName);

  /**
   * Returns a list of elements with the given tag name belonging to the given namespace. The complete document is searched, including the root node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementsByTagNameNS">Document.getElementsByTagNameNS - MDN</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagNameNS(@Nullable String namespace,
      @Nonnull String localName);

  /**
   * The Document object's importNode() method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/importNode">Document.importNode - MDN</a>
   */
  @Nonnull
  public native Node importNode(@Nonnull Node node, boolean deep);

  /**
   * The Document object's importNode() method creates a copy of a Node or DocumentFragment from another document, to be inserted into the current document later.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/importNode">Document.importNode - MDN</a>
   */
  @Nonnull
  public native Node importNode(@Nonnull Node node);

  @Nullable
  public native CaretPosition caretPositionFromPoint(double x, double y);

  @Nullable
  public native Element elementFromPoint(double x, double y);

  @Nonnull
  public native JsArray<Element> elementsFromPoint(double x, double y);

  /**
   * The exitPointerLock() method asynchronously releases a pointer lock previously requested through Element.requestPointerLock.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/exitPointerLock">Document.exitPointerLock - MDN</a>
   */
  public native void exitPointerLock();

  @Nullable
  public native Selection getSelection();

  /**
   * The getAnimations() method of the Document interface returns an array of all Animation objects currently in effect whose target elements are descendants of the document. This array includes CSS Animations, CSS Transitions, and Web Animations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Document/getAnimations">Document.getAnimations - MDN</a>
   */
  @Nonnull
  public native JsArray<Animation> getAnimations();

  @Nonnull
  public native Promise<Void> exitFullscreen();

  public native void close();

  public native boolean execCommand(@Nonnull String commandId, boolean showUI,
      @Nonnull String value);

  public native boolean execCommand(@Nonnull String commandId, boolean showUI);

  public native boolean execCommand(@Nonnull String commandId);

  @Nonnull
  public native NodeList getElementsByName(@Nonnull String elementName);

  public native boolean hasFocus();

  @Nonnull
  public native Document open(@Nonnull String unused1, @Nonnull String unused2);

  @Nonnull
  public native Document open(@Nonnull String unused1);

  @Nonnull
  public native Document open();

  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String name, @Nonnull String features);

  public native boolean queryCommandEnabled(@Nonnull String commandId);

  public native boolean queryCommandIndeterm(@Nonnull String commandId);

  public native boolean queryCommandState(@Nonnull String commandId);

  public native boolean queryCommandSupported(@Nonnull String commandId);

  @Nonnull
  public native String queryCommandValue(@Nonnull String commandId);

  public native void write(@Nonnull String... text);

  public native void writeln(@Nonnull String... text);

  public native void captureEvents();

  public native void clear();

  public native void releaseEvents();

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

  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression,
      @Nullable XPathNSResolver resolver);

  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression);

  @Nonnull
  public native XPathNSResolver createNSResolver(@Nonnull Node nodeResolver);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type, @Nullable XPathResult result);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver);

  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode);

  @Nullable
  public native Element getElementById(@Nonnull String elementId);
}
