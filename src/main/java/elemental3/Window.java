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

  public native void alert();

  public native void alert(@Nonnull String message);

  public native void blur();

  public native void close();

  public native boolean confirm(@Nonnull String message);

  public native boolean confirm();

  public native void focus();

  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target, @Nonnull String features);

  @Nullable
  public native Window open(@Nonnull String url, @Nonnull String target);

  @Nullable
  public native Window open(@Nonnull String url);

  @Nullable
  public native Window open();

  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin,
      @Nonnull JsArray<Object> transfer);

  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin,
      @Nonnull Object[] transfer);

  public native void postMessage(@Nullable Any message, @Nonnull String targetOrigin);

  public native void postMessage(@Nullable Any message, @Nonnull WindowPostMessageOptions options);

  public native void postMessage(@Nullable Any message);

  public native void print();

  @Nullable
  public native String prompt(@Nonnull String message, @Nonnull String default_);

  @Nullable
  public native String prompt(@Nonnull String message);

  @Nullable
  public native String prompt();

  public native void stop();

  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt,
      @Nonnull String pseudoElt);

  @Nonnull
  public native CSSStyleDeclaration getComputedStyle(@Nonnull Element elt);

  @Nonnull
  public native MediaQueryList matchMedia(@Nonnull String query);

  public native void moveBy(int x, int y);

  public native void moveTo(int x, int y);

  public native void resizeBy(int x, int y);

  public native void resizeTo(int width, int height);

  public native void scroll(@Nonnull ScrollToOptions options);

  public native void scroll();

  public native void scroll(double x, double y);

  public native void scrollBy(@Nonnull ScrollToOptions options);

  public native void scrollBy();

  public native void scrollBy(double x, double y);

  public native void scrollTo(@Nonnull ScrollToOptions options);

  public native void scrollTo();

  public native void scrollTo(double x, double y);

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

  public native void cancelAnimationFrame(int handle);

  public native int requestAnimationFrame(@Nonnull FrameRequestCallback callback);
}
