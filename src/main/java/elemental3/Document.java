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
    name = "Document"
)
public class Document extends Node {
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

  @JsProperty(
      name = "compatMode"
  )
  @Nonnull
  public native String compatMode();

  @JsProperty(
      name = "contentType"
  )
  @Nonnull
  public native String contentType();

  @JsProperty(
      name = "doctype"
  )
  @Nullable
  public native DocumentType doctype();

  @JsProperty(
      name = "documentElement"
  )
  @Nullable
  public native Element documentElement();

  @JsProperty(
      name = "documentURI"
  )
  @Nonnull
  public native String documentURI();

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

  @JsProperty(
      name = "scrollingElement"
  )
  @Nullable
  public native Element scrollingElement();

  @JsProperty(
      name = "hidden"
  )
  public native boolean hidden();

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

  @JsProperty(
      name = "embeds"
  )
  @Nonnull
  public native HTMLCollection embeds();

  @JsProperty(
      name = "forms"
  )
  @Nonnull
  public native HTMLCollection forms();

  @JsProperty(
      name = "head"
  )
  @Nullable
  public native HTMLHeadElement head();

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

  @Nonnull
  public native Node adoptNode(@Nonnull Node node);

  @Nonnull
  public native Attr createAttribute(@Nonnull String localName);

  @Nonnull
  public native Attr createAttributeNS(@Nullable String namespace, @Nonnull String qualifiedName);

  @Nonnull
  public native CDATASection createCDATASection(@Nonnull String data);

  @Nonnull
  public native Comment createComment(@Nonnull String data);

  @Nonnull
  public native DocumentFragment createDocumentFragment();

  @Nonnull
  public native Element createElement(@Nonnull String localName, @Nonnull String options);

  @Nonnull
  public native Element createElement(@Nonnull String localName,
      @Nonnull ElementCreationOptions options);

  @Nonnull
  public native Element createElement(@Nonnull String localName);

  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String options);

  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull ElementCreationOptions options);

  @Nonnull
  public native Element createElementNS(@Nullable String namespace, @Nonnull String qualifiedName);

  @Nonnull
  public native Event createEvent(@Nonnull String interface_);

  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root, int whatToShow);

  @Nonnull
  public native NodeIterator createNodeIterator(@Nonnull Node root);

  @Nonnull
  public native ProcessingInstruction createProcessingInstruction(@Nonnull String target,
      @Nonnull String data);

  @Nonnull
  public native Range createRange();

  @Nonnull
  public native Text createTextNode(@Nonnull String data);

  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow,
      @Nullable NodeFilter filter);

  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root, int whatToShow);

  @Nonnull
  public native TreeWalker createTreeWalker(@Nonnull Node root);

  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  @Nonnull
  public native HTMLCollection getElementsByTagName(@Nonnull String qualifiedName);

  @Nonnull
  public native HTMLCollection getElementsByTagNameNS(@Nullable String namespace,
      @Nonnull String localName);

  @Nonnull
  public native Node importNode(@Nonnull Node node, boolean deep);

  @Nonnull
  public native Node importNode(@Nonnull Node node);

  @Nullable
  public native CaretPosition caretPositionFromPoint(double x, double y);

  @Nullable
  public native Element elementFromPoint(double x, double y);

  @Nonnull
  public native JsArray<Element> elementsFromPoint(double x, double y);

  public native void exitPointerLock();

  @Nullable
  public native Selection getSelection();

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
