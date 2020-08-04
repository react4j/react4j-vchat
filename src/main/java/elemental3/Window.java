package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The Window interface represents a window containing a DOM document; the document property points to the DOM document loaded in that window.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window">Window - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Window"
)
public class Window extends EventTarget {
  @Nonnull
  public String name;

  @Nullable
  public Any opener;

  @Nonnull
  public String status;

  @Nullable
  public EventHandler ondeviceorientation;

  @Nullable
  public EventHandler ondeviceorientationabsolute;

  @Nullable
  public EventHandler oncompassneedscalibration;

  @Nullable
  public EventHandler ondevicemotion;

  @Nullable
  public EventHandler onorientationchange;

  @Nullable
  public EventHandler onafterprint;

  @Nullable
  public EventHandler onbeforeprint;

  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  @Nullable
  public EventHandler onhashchange;

  @Nullable
  public EventHandler onlanguagechange;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onpagehide;

  @Nullable
  public EventHandler onpageshow;

  @Nullable
  public EventHandler onpopstate;

  @Nullable
  public EventHandler onrejectionhandled;

  @Nullable
  public EventHandler onstorage;

  @Nullable
  public EventHandler onunhandledrejection;

  @Nullable
  public EventHandler onunload;

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

  Window() {
  }

  @JsProperty(
      name = "applicationCache"
  )
  @Nonnull
  public native ApplicationCache applicationCache();

  @JsProperty(
      name = "closed"
  )
  public native boolean closed();

  @JsProperty(
      name = "customElements"
  )
  @Nonnull
  public native CustomElementRegistry customElements();

  @JsProperty(
      name = "document"
  )
  @Nonnull
  public native Document document();

  @JsProperty(
      name = "frameElement"
  )
  @Nullable
  public native Element frameElement();

  @JsProperty(
      name = "frames"
  )
  @Nonnull
  public native Window frames();

  @JsProperty(
      name = "history"
  )
  @Nonnull
  public native History history();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "location"
  )
  @Nonnull
  public native Location location();

  @JsProperty(
      name = "locationbar"
  )
  @Nonnull
  public native BarProp locationbar();

  @JsProperty(
      name = "menubar"
  )
  @Nonnull
  public native BarProp menubar();

  @JsProperty(
      name = "navigator"
  )
  @Nonnull
  public native Navigator navigator();

  @JsProperty(
      name = "parent"
  )
  @Nullable
  public native Window parent();

  @JsProperty(
      name = "personalbar"
  )
  @Nonnull
  public native BarProp personalbar();

  @JsProperty(
      name = "scrollbars"
  )
  @Nonnull
  public native BarProp scrollbars();

  @JsProperty(
      name = "self"
  )
  @Nonnull
  public native Window self();

  @JsProperty(
      name = "statusbar"
  )
  @Nonnull
  public native BarProp statusbar();

  @JsProperty(
      name = "toolbar"
  )
  @Nonnull
  public native BarProp toolbar();

  @JsProperty(
      name = "top"
  )
  @Nullable
  public native Window top();

  @JsProperty(
      name = "window"
  )
  @Nonnull
  public native Window window();

  @JsProperty(
      name = "devicePixelRatio"
  )
  public native double devicePixelRatio();

  @JsProperty(
      name = "innerHeight"
  )
  public native int innerHeight();

  @JsProperty(
      name = "innerWidth"
  )
  public native int innerWidth();

  @JsProperty(
      name = "outerHeight"
  )
  public native int outerHeight();

  @JsProperty(
      name = "outerWidth"
  )
  public native int outerWidth();

  @JsProperty(
      name = "pageXOffset"
  )
  public native double pageXOffset();

  @JsProperty(
      name = "pageYOffset"
  )
  public native double pageYOffset();

  @JsProperty(
      name = "screen"
  )
  @Nonnull
  public native Screen screen();

  @JsProperty(
      name = "screenLeft"
  )
  public native int screenLeft();

  @JsProperty(
      name = "screenTop"
  )
  public native int screenTop();

  @JsProperty(
      name = "screenX"
  )
  public native int screenX();

  @JsProperty(
      name = "screenY"
  )
  public native int screenY();

  @JsProperty(
      name = "scrollX"
  )
  public native double scrollX();

  @JsProperty(
      name = "scrollY"
  )
  public native double scrollY();

  @JsProperty(
      name = "speechSynthesis"
  )
  @Nonnull
  public native SpeechSynthesis speechSynthesis();

  @JsProperty(
      name = "orientation"
  )
  public native short orientation();

  @JsProperty(
      name = "event"
  )
  @Nullable
  public native Any event();

  @JsProperty(
      name = "external"
  )
  @Nonnull
  public native External external();

  @JsProperty(
      name = "crossOriginIsolated"
  )
  public native boolean crossOriginIsolated();

  @JsProperty(
      name = "isSecureContext"
  )
  public native boolean isSecureContext();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  @JsProperty(
      name = "performance"
  )
  @Nonnull
  public native Performance performance();

  @JsProperty(
      name = "indexedDB"
  )
  @Nonnull
  public native IDBFactory indexedDB();

  @JsProperty(
      name = "caches"
  )
  @Nonnull
  public native CacheStorage caches();

  @JsProperty(
      name = "crypto"
  )
  @Nonnull
  public native Crypto crypto();

  @JsProperty(
      name = "localStorage"
  )
  @Nonnull
  public native Storage localStorage();

  @JsProperty(
      name = "sessionStorage"
  )
  @Nonnull
  public native Storage sessionStorage();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public native void alert();

  /**
   * The Window.alert() method displays an alert dialog with the optional specified content and an OK button.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/alert">Window.alert - MDN</a>
   */
  public native void alert(@Nonnull String message);

  /**
   * Shifts focus away from the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/blur">Window.blur - MDN</a>
   */
  public native void blur();

  /**
   * The Window.close() method closes the current window, or the window on which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/close">Window.close - MDN</a>
   */
  public native void close();

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public native boolean confirm(@Nonnull String message);

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and two buttons: OK and Cancel.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/confirm">Window.confirm - MDN</a>
   */
  public native boolean confirm();

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't guaranteed to be frontmost before this method returns.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/focus">Window.focus - MDN</a>
   */
  public native void focus();

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target, @Nonnull String features);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open(@Nonnull String url);

  /**
   * The Window interface's open() method loads the specified resource into the new or existing browsing context (window, iframe or tab) with the specified name. If the name doesn't exist, then a new browsing context is opened in a new tab or a new window, and the specified resource is loaded into it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/open">Window.open - MDN</a>
   */
  @Nullable
  public native Window open();

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin,
      @Nonnull JsArray<Object> transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin,
      @Nonnull Object[] transfer);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message, @Nonnull WindowPostMessageOptions options);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message);

  /**
   * Opens the Print Dialog to print the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/print">Window.print - MDN</a>
   */
  public native void print();

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt(@Nonnull String message, @Nonnull String default_);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt(@Nonnull String message);

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user to input some text.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/prompt">Window.prompt - MDN</a>
   */
  @Nullable
  public native String prompt();

  /**
   * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button in the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/stop">Window.stop - MDN</a>
   */
  public native void stop();

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   */
  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt,
      @Nonnull String pseudoElt);

  /**
   * The Window.getComputedStyle() method returns an object containing the values of all CSS properties of an element, after applying active stylesheets and resolving any basic computation those values may contain.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle">Window.getComputedStyle - MDN</a>
   */
  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt);

  /**
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/matchMedia">Window.matchMedia - MDN</a>
   */
  @Nonnull
  public native MediaQueryList matchMedia(@Nonnull String query);

  /**
   * The moveBy() method of the Window interface moves the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveBy">Window.moveBy - MDN</a>
   */
  public native void moveBy(int x, int y);

  /**
   * The moveTo() method of the Window interface moves the current window to the specified coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/moveTo">Window.moveTo - MDN</a>
   */
  public native void moveTo(int x, int y);

  /**
   * The Window.resizeBy() method resizes the current window by a specified amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeBy">Window.resizeBy - MDN</a>
   */
  public native void resizeBy(int x, int y);

  /**
   * The Window.resizeTo() method dynamically resizes the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/resizeTo">Window.resizeTo - MDN</a>
   */
  public native void resizeTo(int width, int height);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll(@Nonnull ScrollToOptions options);

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll();

  /**
   * The Window.scroll() method scrolls the window to a particular place in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scroll">Window.scroll - MDN</a>
   */
  public native void scroll(double x, double y);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy(@Nonnull ScrollToOptions options);

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy();

  /**
   * The Window.scrollBy() method scrolls the document in the window by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy">Window.scrollBy - MDN</a>
   */
  public native void scrollBy(double x, double y);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   */
  public native void scrollTo(@Nonnull ScrollToOptions options);

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   */
  public native void scrollTo();

  /**
   * Window.scrollTo() scrolls to a particular set of coordinates in the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollTo">Window.scrollTo - MDN</a>
   */
  public native void scrollTo(double x, double y);

  /**
   * The Window.getSelection() method returns a Selection object representing the range of text selected by the user or the current position of the caret.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/getSelection">Window.getSelection - MDN</a>
   */
  @Nullable
  public native Selection getSelection();

  public native void captureEvents();

  public native void releaseEvents();

  @Nonnull
  public native String atob(@Nonnull String data);

  @Nonnull
  public native String btoa(@Nonnull String data);

  public native void clearInterval(int handle);

  public native void clearInterval();

  public native void clearTimeout(int handle);

  public native void clearTimeout();

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image,
      @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh);

  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh);

  public native void queueMicrotask(@Nonnull VoidFunction callback);

  public native int setInterval(@Nonnull TimerHandler handler, int timeout,
      @Nullable Any... arguments);

  public native int setInterval(@Nonnull String handler, int timeout, @Nullable Any... arguments);

  public native int setInterval(@Nonnull Function handler, int timeout, @Nullable Any... arguments);

  public native int setInterval(@Nonnull TimerHandler handler, int timeout);

  public native int setInterval(@Nonnull String handler, int timeout);

  public native int setInterval(@Nonnull Function handler, int timeout);

  public native int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @Nullable Any... arguments);

  public native int setTimeout(@Nonnull String handler, int timeout, @Nullable Any... arguments);

  public native int setTimeout(@Nonnull Function handler, int timeout, @Nullable Any... arguments);

  public native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  public native int setTimeout(@Nonnull String handler, int timeout);

  public native int setTimeout(@Nonnull Function handler, int timeout);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input, @Nonnull RequestInit init);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input);

  @Nonnull
  public native Promise<Response> fetch(@Nonnull String input);

  /**
   * The window.cancelAnimationFrame() method cancels an animation frame request previously scheduled through a call to window.requestAnimationFrame().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/cancelAnimationFrame">Window.cancelAnimationFrame - MDN</a>
   */
  public native void cancelAnimationFrame(int handle);

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to perform an animation and requests that the browser calls a specified function to update an animation before the next repaint. The method takes a callback as an argument to be invoked before the repaint.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/requestAnimationFrame">Window.requestAnimationFrame - MDN</a>
   */
  public native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);
}
