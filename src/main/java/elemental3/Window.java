package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

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

  /**
   * The onabort property of the GlobalEventHandlers mixin is the EventHandler for processing abort events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onabort">GlobalEventHandlers.onabort - MDN</a>
   */
  @Nullable
  public EventHandler onabort;

  /**
   * The onafterprint property of the WindowEventHandlers mixin is the EventHandler for processing afterprint events for the current window. These events are raised after the user prints, or if they abort the print dialog.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onafterprint">WindowEventHandlers.onafterprint - MDN</a>
   */
  @Nullable
  public EventHandler onafterprint;

  /**
   * The onanimationcancel property of the GlobalEventHandlers mixin is the EventHandler for processing animationcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationcancel">GlobalEventHandlers.onanimationcancel - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationcancel;

  /**
   * The onanimationend property of the GlobalEventHandlers mixin is the EventHandler for processing animationend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationend">GlobalEventHandlers.onanimationend - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationend;

  /**
   * The onanimationiteration property of the GlobalEventHandlers mixin is the EventHandler for processing animationiteration events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationiteration">GlobalEventHandlers.onanimationiteration - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationiteration;

  /**
   * An event handler for the animationstart event. This event is sent when a CSS Animation starts to play.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onanimationstart">GlobalEventHandlers.onanimationstart - MDN</a>
   */
  @Nullable
  public AnimationEventHandler onanimationstart;

  /**
   * The onauxclick property of the GlobalEventHandlers mixin is an EventHandler for processing auxclick events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onauxclick">GlobalEventHandlers.onauxclick - MDN</a>
   */
  @Nullable
  public EventHandler onauxclick;

  /**
   * The onbeforeprint property of the WindowEventHandlers mixin is the EventHandler for processing beforeprint events for the current window. These events are raised before the print dialog window is opened.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeprint">WindowEventHandlers.onbeforeprint - MDN</a>
   */
  @Nullable
  public EventHandler onbeforeprint;

  /**
   * The onbeforeunload property of the WindowEventHandlers mixin is the EventHandler for processing beforeunload events. These events fire when a window is about to unload its resources. At this point, the document is still visible and the event is still cancelable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onbeforeunload">WindowEventHandlers.onbeforeunload - MDN</a>
   */
  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  /**
   * The onblur property of the GlobalEventHandlers mixin is the EventHandler for processing blur events. It's available on Element, Document, and Window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onblur">GlobalEventHandlers.onblur - MDN</a>
   */
  @Nullable
  public FocusEventHandler onblur;

  /**
   * The oncancel property of the GlobalEventHandlers mixin is an EventHandler for processing cancel events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncancel">GlobalEventHandlers.oncancel - MDN</a>
   */
  @Nullable
  public EventHandler oncancel;

  /**
   * The oncanplay property of the GlobalEventHandlers mixin is the EventHandler for processing canplay events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplay">GlobalEventHandlers.oncanplay - MDN</a>
   */
  @Nullable
  public EventHandler oncanplay;

  /**
   * The oncanplaythrough property of the GlobalEventHandlers mixin is the EventHandler for processing canplaythrough events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncanplaythrough">GlobalEventHandlers.oncanplaythrough - MDN</a>
   */
  @Nullable
  public EventHandler oncanplaythrough;

  /**
   * The onchange property of the GlobalEventHandlers mixin is an EventHandler for processing change events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onchange">GlobalEventHandlers.onchange - MDN</a>
   */
  @Nullable
  public EventHandler onchange;

  /**
   * The onclick property of the GlobalEventHandlers mixin is the EventHandler for processing click events on a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclick">GlobalEventHandlers.onclick - MDN</a>
   */
  @Nullable
  public EventHandler onclick;

  /**
   * The onclose property of the GlobalEventHandlers mixin is an EventHandler for processing close events sent to a dialog element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onclose">GlobalEventHandlers.onclose - MDN</a>
   */
  @Nullable
  public EventHandler onclose;

  @Nullable
  public EventHandler oncompassneedscalibration;

  /**
   * The oncontextmenu property of the GlobalEventHandlers mixin is an EventHandler that processes contextmenu events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncontextmenu">GlobalEventHandlers.oncontextmenu - MDN</a>
   */
  @Nullable
  public EventHandler oncontextmenu;

  /**
   * The oncuechange property of the GlobalEventHandlers mixin is the EventHandler for processing cuechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oncuechange">GlobalEventHandlers.oncuechange - MDN</a>
   */
  @Nullable
  public EventHandler oncuechange;

  /**
   * The ondblclick property of the GlobalEventHandlers mixin is an EventHandler that processes dblclick events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick - MDN</a>
   */
  @Nullable
  public EventHandler ondblclick;

  /**
   * An event handler for the devicemotion events sent to the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondevicemotion">Window.ondevicemotion - MDN</a>
   */
  @Nullable
  public DeviceMotionEventHandler ondevicemotion;

  /**
   * An event handler for the deviceorientation event, which contains information about a relative device orientation change.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/ondeviceorientation">Window.ondeviceorientation - MDN</a>
   */
  @Nullable
  public DeviceOrientationEventHandler ondeviceorientation;

  @Nullable
  public EventHandler ondeviceorientationabsolute;

  /**
   * A global event handler for the drag event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrag">GlobalEventHandlers.ondrag - MDN</a>
   */
  @Nullable
  public EventHandler ondrag;

  /**
   * A global event handler for the dragend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragend">GlobalEventHandlers.ondragend - MDN</a>
   */
  @Nullable
  public EventHandler ondragend;

  /**
   * A global event handler for the dragenter event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragenter">GlobalEventHandlers.ondragenter - MDN</a>
   */
  @Nullable
  public EventHandler ondragenter;

  /**
   * The GlobalEventHandler.ondragexit property is an event handler for the dragexit event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragexit">GlobalEventHandlers.ondragexit - MDN</a>
   */
  @Nullable
  public EventHandler ondragexit;

  /**
   * A global event handler for the dragleave event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragleave">GlobalEventHandlers.ondragleave - MDN</a>
   */
  @Nullable
  public EventHandler ondragleave;

  /**
   * A global event handler for the dragover event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragover">GlobalEventHandlers.ondragover - MDN</a>
   */
  @Nullable
  public EventHandler ondragover;

  /**
   * A global event handler for the dragstart event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondragstart">GlobalEventHandlers.ondragstart - MDN</a>
   */
  @Nullable
  public EventHandler ondragstart;

  /**
   * A global event handler for the drop event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondrop">GlobalEventHandlers.ondrop - MDN</a>
   */
  @Nullable
  public EventHandler ondrop;

  /**
   * The ondurationchange property of the GlobalEventHandlers mixin is the EventHandler for processing durationchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondurationchange">GlobalEventHandlers.ondurationchange - MDN</a>
   */
  @Nullable
  public EventHandler ondurationchange;

  /**
   * The onemptied property sets and returns the event handler for the emptied event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onemptied">GlobalEventHandlers.onemptied - MDN</a>
   */
  @Nullable
  public EventHandler onemptied;

  /**
   * The onended property of the GlobalEventHandlers mixin is the EventHandler for processing ended events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onended">GlobalEventHandlers.onended - MDN</a>
   */
  @Nullable
  public EventHandler onended;

  /**
   * The onerror property of the GlobalEventHandlers mixin is an EventHandler that processes error events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onerror">GlobalEventHandlers.onerror - MDN</a>
   */
  @Nullable
  public OnErrorEventHandler onerror;

  /**
   * The onfocus property of the GlobalEventHandlers mixin is an EventHandler that processes focus events on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onfocus">GlobalEventHandlers.onfocus - MDN</a>
   */
  @Nullable
  public FocusEventHandler onfocus;

  /**
   * The onformdata property of the GlobalEventHandlers mixin is the EventHandler for processing formdata events, fired after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor. onformdata is available on HTMLFormElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onformdata">GlobalEventHandlers.onformdata - MDN</a>
   */
  @Nullable
  public EventHandler onformdata;

  /**
   * The ongotpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes gotpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ongotpointercapture">GlobalEventHandlers.ongotpointercapture - MDN</a>
   */
  @Nullable
  public EventHandler ongotpointercapture;

  /**
   * The WindowEventHandlers.onhashchange property of the WindowEventHandlers mixin is the EventHandler for processing hashchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onhashchange">WindowEventHandlers.onhashchange - MDN</a>
   */
  @Nullable
  public HashChangeEventHandler onhashchange;

  /**
   * The oninput property of the GlobalEventHandlers mixin is an EventHandler that processes input events on the input, select, and textarea elements. It also handles these events on elements where contenteditable or designMode are turned on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninput">GlobalEventHandlers.oninput - MDN</a>
   */
  @Nullable
  public EventHandler oninput;

  /**
   * The oninvalid property of the GlobalEventHandlers mixin is an EventHandler that processes invalid events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/oninvalid">GlobalEventHandlers.oninvalid - MDN</a>
   */
  @Nullable
  public EventHandler oninvalid;

  /**
   * The onkeydown property of the GlobalEventHandlers mixin is an EventHandler that processes keydown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeydown">GlobalEventHandlers.onkeydown - MDN</a>
   */
  @Nullable
  public EventHandler onkeydown;

  /**
   * The onkeypress property of the GlobalEventHandlers mixin is an EventHandler that processes keypress events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeypress">GlobalEventHandlers.onkeypress - MDN</a>
   */
  @Nullable
  public EventHandler onkeypress;

  /**
   * The onkeyup property of the GlobalEventHandlers mixin is an EventHandler that processes keyup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onkeyup">GlobalEventHandlers.onkeyup - MDN</a>
   */
  @Nullable
  public EventHandler onkeyup;

  /**
   * The onlanguagechange property of the WindowEventHandlers mixin is the EventHandler for processing languagechange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onlanguagechange">WindowEventHandlers.onlanguagechange - MDN</a>
   */
  @Nullable
  public EventHandler onlanguagechange;

  /**
   * The onload property of the GlobalEventHandlers mixin is an EventHandler that processes load events on a Window, XMLHttpRequest, img element, etc.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onload">GlobalEventHandlers.onload - MDN</a>
   */
  @Nullable
  public EventHandler onload;

  /**
   * The onloadeddata property of the GlobalEventHandlers mixin is the EventHandler for processing loadeddata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadeddata">GlobalEventHandlers.onloadeddata - MDN</a>
   */
  @Nullable
  public EventHandler onloadeddata;

  /**
   * The onloadedmetadata property of the GlobalEventHandlers mixin is the EventHandler for processing loadedmetadata events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadedmetadata">GlobalEventHandlers.onloadedmetadata - MDN</a>
   */
  @Nullable
  public EventHandler onloadedmetadata;

  /**
   * The onloadstart property of the GlobalEventHandlers mixin is an EventHandler representing the code to be called when the loadstart event is raised (when progress has begun on the loading of a resource.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onloadstart">GlobalEventHandlers.onloadstart - MDN</a>
   */
  @Nullable
  public EventHandler onloadstart;

  /**
   * The onlostpointercapture property of the GlobalEventHandlers mixin is an EventHandler that processes lostpointercapture events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onlostpointercapture">GlobalEventHandlers.onlostpointercapture - MDN</a>
   */
  @Nullable
  public EventHandler onlostpointercapture;

  /**
   * The onmessage property of the WindowEventHandlers mixin is the EventHandler called whenever an object receives a message event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessage">WindowEventHandlers.onmessage - MDN</a>
   */
  @Nullable
  public MessageEventHandler onmessage;

  /**
   * The onmessageerror event handler of the WindowEventHandlers interface is an EventListener, called whenever an MessageEvent of type messageerror is fired on a window&mdash;that is, when it receives a message that cannot be deserialized.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onmessageerror">WindowEventHandlers.onmessageerror - MDN</a>
   */
  @Nullable
  public MessageEventHandler onmessageerror;

  /**
   * The onmousedown property of the GlobalEventHandlers mixin is an EventHandler that processes mousedown events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmousedown">GlobalEventHandlers.onmousedown - MDN</a>
   */
  @Nullable
  public EventHandler onmousedown;

  /**
   * The onmouseenter property of the GlobalEventHandlers mixin is the EventHandler for processing mouseenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseenter">GlobalEventHandlers.onmouseenter - MDN</a>
   */
  @Nullable
  public EventHandler onmouseenter;

  /**
   * The onmouseleave property of the GlobalEventHandlers mixin is the EventHandler for processing mouseleave events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseleave">GlobalEventHandlers.onmouseleave - MDN</a>
   */
  @Nullable
  public EventHandler onmouseleave;

  /**
   * The onmousemove property of the GlobalEventHandlers mixin is an EventHandler that processes mousemove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmousemove">GlobalEventHandlers.onmousemove - MDN</a>
   */
  @Nullable
  public EventHandler onmousemove;

  /**
   * The onmouseout property of the GlobalEventHandlers mixin is an EventHandler that processes mouseout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseout">GlobalEventHandlers.onmouseout - MDN</a>
   */
  @Nullable
  public EventHandler onmouseout;

  /**
   * The onmouseover property of the GlobalEventHandlers mixin is an EventHandler that processes mouseover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseover">GlobalEventHandlers.onmouseover - MDN</a>
   */
  @Nullable
  public EventHandler onmouseover;

  /**
   * The onmouseup property of the GlobalEventHandlers mixin is an EventHandler that processes mouseup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onmouseup">GlobalEventHandlers.onmouseup - MDN</a>
   */
  @Nullable
  public EventHandler onmouseup;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onorientationchange;

  @Nullable
  public PageTransitionEventHandler onpagehide;

  @Nullable
  public PageTransitionEventHandler onpageshow;

  /**
   * The onpause property of the GlobalEventHandlers mixin is the EventHandler for processing pause events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpause">GlobalEventHandlers.onpause - MDN</a>
   */
  @Nullable
  public EventHandler onpause;

  /**
   * The onplay property of the GlobalEventHandlers mixin is the EventHandler for processing play events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplay">GlobalEventHandlers.onplay - MDN</a>
   */
  @Nullable
  public EventHandler onplay;

  /**
   * The onplaying property of the GlobalEventHandlers mixin is the EventHandler for processing playing events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onplaying">GlobalEventHandlers.onplaying - MDN</a>
   */
  @Nullable
  public EventHandler onplaying;

  /**
   * The onpointercancel property of the GlobalEventHandlers mixin is an EventHandler that processes pointercancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointercancel">GlobalEventHandlers.onpointercancel - MDN</a>
   */
  @Nullable
  public EventHandler onpointercancel;

  /**
   * The GlobalEventHandlers event handler onpointerdown is used to specify the event handler for the pointerdown event, which is fired when the pointing device is initially pressed. This event can be sent to Window, Document, and Element objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerdown">GlobalEventHandlers.onpointerdown - MDN</a>
   */
  @Nullable
  public EventHandler onpointerdown;

  /**
   * The onpointerenter property of the GlobalEventHandlers mixin is an EventHandler that processes pointerenter events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerenter">GlobalEventHandlers.onpointerenter - MDN</a>
   */
  @Nullable
  public EventHandler onpointerenter;

  /**
   * The global event handler for the pointerleave event, which is delivered to a Node when the pointer (mouse cursor, fingertip, etc.) exits its hit test area (for example, if the cursor exits an Element or Window's content area). This event is part of the Pointer Events API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerleave">GlobalEventHandlers.onpointerleave - MDN</a>
   */
  @Nullable
  public EventHandler onpointerleave;

  /**
   * The onpointermove property of the GlobalEventHandlers mixin is an EventHandler that processes pointermove events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointermove">GlobalEventHandlers.onpointermove - MDN</a>
   */
  @Nullable
  public EventHandler onpointermove;

  /**
   * The onpointerout property of the GlobalEventHandlers mixin is an EventHandler that processes pointerout events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerout">GlobalEventHandlers.onpointerout - MDN</a>
   */
  @Nullable
  public EventHandler onpointerout;

  /**
   * The onpointerover property of the GlobalEventHandlers mixin is an EventHandler that processes pointerover events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerover">GlobalEventHandlers.onpointerover - MDN</a>
   */
  @Nullable
  public EventHandler onpointerover;

  /**
   * The onpointerup property of the GlobalEventHandlers mixin is an EventHandler that processes pointerup events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onpointerup">GlobalEventHandlers.onpointerup - MDN</a>
   */
  @Nullable
  public EventHandler onpointerup;

  /**
   * The onpopstate property of the WindowEventHandlers mixin is the EventHandler for processing popstate events on the window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onpopstate">WindowEventHandlers.onpopstate - MDN</a>
   */
  @Nullable
  public EventHandler onpopstate;

  @Nullable
  public EventHandler onprogress;

  @Nullable
  public EventHandler onratechange;

  /**
   * The onrejectionhandled property of the WindowEventHandlers mixin is the EventHandler for processing rejectionhandled events. These events are raised when Promises are rejected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/onrejectionhandled">Window.onrejectionhandled - MDN</a>
   */
  @Nullable
  public PromiseRejectionEventHandler onrejectionhandled;

  /**
   * The onreset property of the GlobalEventHandlers mixin is an EventHandler that processes reset events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onreset">GlobalEventHandlers.onreset - MDN</a>
   */
  @Nullable
  public EventHandler onreset;

  /**
   * The onresize property of the GlobalEventHandlers interface is an EventHandler that processes resize events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onresize">GlobalEventHandlers.onresize - MDN</a>
   */
  @Nullable
  public UIEventHandler onresize;

  /**
   * The onscroll property of the GlobalEventHandlers mixin is an EventHandler that processes scroll events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onscroll">GlobalEventHandlers.onscroll - MDN</a>
   */
  @Nullable
  public EventHandler onscroll;

  @Nullable
  public EventHandler onsecuritypolicyviolation;

  @Nullable
  public EventHandler onseeked;

  @Nullable
  public EventHandler onseeking;

  /**
   * The onselect property of the GlobalEventHandlers mixin is an EventHandler that processes select events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselect">GlobalEventHandlers.onselect - MDN</a>
   */
  @Nullable
  public EventHandler onselect;

  /**
   * The onselectionchange property of the GlobalEventHandlers mixin is an EventHandler that processes selectionchange events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectionchange">GlobalEventHandlers.onselectionchange - MDN</a>
   */
  @Nullable
  public EventHandler onselectionchange;

  /**
   * The onselectstart property of the GlobalEventHandlers mixin is an EventHandler that processes selectstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onselectstart">GlobalEventHandlers.onselectstart - MDN</a>
   */
  @Nullable
  public EventHandler onselectstart;

  @Nullable
  public EventHandler onslotchange;

  @Nullable
  public EventHandler onstalled;

  /**
   * The onstorage property of the WindowEventHandlers mixin is an EventHandler for processing storage events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onstorage">WindowEventHandlers.onstorage - MDN</a>
   */
  @Nullable
  public StorageEventHandler onstorage;

  /**
   * The onsubmit property of the GlobalEventHandlers mixin is an EventHandler that processes submit events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onsubmit">GlobalEventHandlers.onsubmit - MDN</a>
   */
  @Nullable
  public EventHandler onsubmit;

  @Nullable
  public EventHandler onsuspend;

  @Nullable
  public EventHandler ontimeupdate;

  @Nullable
  public EventHandler ontoggle;

  /**
   * The ontouchcancel property of the GlobalEventHandlers mixin is an EventHandler that processes touchcancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchcancel">GlobalEventHandlers.ontouchcancel - MDN</a>
   */
  @Nullable
  public EventHandler ontouchcancel;

  /**
   * A global event handler for the touchend event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchend">GlobalEventHandlers.ontouchend - MDN</a>
   */
  @Nullable
  public EventHandler ontouchend;

  /**
   * A global event handler for the touchmove event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchmove">GlobalEventHandlers.ontouchmove - MDN</a>
   */
  @Nullable
  public EventHandler ontouchmove;

  /**
   * The ontouchstart property of the GlobalEventHandlers mixin is an EventHandler that processes touchstart events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontouchstart">GlobalEventHandlers.ontouchstart - MDN</a>
   */
  @Nullable
  public EventHandler ontouchstart;

  /**
   * The ontransitioncancel property of the GlobalEventHandlers mixin is an EventHandler that processes transitioncancel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitioncancel">GlobalEventHandlers.ontransitioncancel - MDN</a>
   */
  @Nullable
  public TransitionEventHandler ontransitioncancel;

  /**
   * The ontransitionend property of the GlobalEventHandlers mixin is an EventHandler that processes transitionend events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ontransitionend">GlobalEventHandlers.ontransitionend - MDN</a>
   */
  @Nullable
  public TransitionEventHandler ontransitionend;

  @Nullable
  public TransitionEventHandler ontransitionrun;

  @Nullable
  public TransitionEventHandler ontransitionstart;

  /**
   * The onunhandledrejection property of the WindowEventHandlers mixin is the EventHandler for processing unhandledrejection events. These events are raised for unhandled Promise rejections.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunhandledrejection">WindowEventHandlers.onunhandledrejection - MDN</a>
   */
  @Nullable
  public PromiseRejectionEventHandler onunhandledrejection;

  /**
   * The onunload property of the WindowEventHandlers mixin is the EventHandler for processing unload events. These events fire when the window is unloading its content and resources. The resource removal is processed after the unload event occurs.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowEventHandlers/onunload">WindowEventHandlers.onunload - MDN</a>
   */
  @Nullable
  public EventHandler onunload;

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

  /**
   * The onwheel property of the GlobalEventHandlers mixin is an EventHandler that processes wheel events.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/onwheel">GlobalEventHandlers.onwheel - MDN</a>
   */
  @Nullable
  public EventHandler onwheel;

  @Nullable
  public Any opener;

  @Nonnull
  public String status;

  Window() {
  }

  @JsProperty(
      name = "applicationCache"
  )
  @Nonnull
  public native ApplicationCache applicationCache();

  /**
   * The caches read-only property of the WindowOrWorkerGlobalScope interface returns the CacheStorage object associated with the current context. This object enables functionality such as storing assets for offline use, and generating custom responses to requests.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/caches">WindowOrWorkerGlobalScope.caches - MDN</a>
   */
  @JsProperty(
      name = "caches"
  )
  @Nonnull
  public native CacheStorage caches();

  @JsProperty(
      name = "closed"
  )
  public native boolean closed();

  /**
   * The crossOriginIsolated read-only property of the WindowOrWorkerGlobalScope interface returns a boolean value that indicates whether a SharedArrayBuffer can be sent via a Window.postMessage() call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/crossOriginIsolated">WindowOrWorkerGlobalScope.crossOriginIsolated - MDN</a>
   */
  @JsProperty(
      name = "crossOriginIsolated"
  )
  public native boolean crossOriginIsolated();

  @JsProperty(
      name = "crypto"
  )
  @Nonnull
  public native Crypto crypto();

  @JsProperty(
      name = "customElements"
  )
  @Nonnull
  public native CustomElementRegistry customElements();

  @JsProperty(
      name = "devicePixelRatio"
  )
  public native double devicePixelRatio();

  @JsProperty(
      name = "document"
  )
  @Nonnull
  public native Document document();

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

  /**
   * The indexedDB read-only property of the WindowOrWorkerGlobalScope mixin provides a mechanism for applications to asynchronously access the capabilities of indexed databases.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/indexedDB">WindowOrWorkerGlobalScope.indexedDB - MDN</a>
   */
  @JsProperty(
      name = "indexedDB"
  )
  @Nonnull
  public native IDBFactory indexedDB();

  @JsProperty(
      name = "innerHeight"
  )
  public native int innerHeight();

  @JsProperty(
      name = "innerWidth"
  )
  public native int innerWidth();

  /**
   * The isSecureContext read-only property of the WindowOrWorkerGlobalScope interface returns a boolean indicating whether the current context is secure (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/isSecureContext">WindowOrWorkerGlobalScope.isSecureContext - MDN</a>
   */
  @JsProperty(
      name = "isSecureContext"
  )
  public native boolean isSecureContext();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "localStorage"
  )
  @Nonnull
  public native Storage localStorage();

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
      name = "orientation"
  )
  public native short orientation();

  /**
   * The origin read-only property of the WindowOrWorkerGlobalScope interface returns the origin of the global scope, serialized as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/origin">WindowOrWorkerGlobalScope.origin - MDN</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

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
      name = "parent"
  )
  @Nullable
  public native Window parent();

  @JsProperty(
      name = "performance"
  )
  @Nonnull
  public native Performance performance();

  @JsProperty(
      name = "personalbar"
  )
  @Nonnull
  public native BarProp personalbar();

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
      name = "sessionStorage"
  )
  @Nonnull
  public native Storage sessionStorage();

  @JsProperty(
      name = "speechSynthesis"
  )
  @Nonnull
  public native SpeechSynthesis speechSynthesis();

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
      name = "visualViewport"
  )
  @Nonnull
  public native VisualViewport visualViewport();

  @JsProperty(
      name = "window"
  )
  @Nonnull
  public native Window window();

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
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull JsArray<Object> transfer);

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
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin, @Nonnull Object[] transfer);

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
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull String targetOrigin);

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
  public native void postMessage(@DoNotAutobox @Nullable Object message,
      @Nonnull WindowPostMessageOptions options);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@Nullable Any message);

  /**
   * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a page and a pop-up that it spawned, or between a page and an iframe embedded within it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage">Window.postMessage - MDN</a>
   */
  public native void postMessage(@DoNotAutobox @Nullable Object message);

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
   * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine if the document matches the media query string, as well as to monitor the document to detect when it matches (or stops matching) that media query.
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

  /**
   * The WindowOrWorkerGlobalScope.atob() function decodes a string of data which has been encoded using Base64 encoding. You can use the btoa() method to encode and transmit data which may otherwise cause communication problems, then transmit it and use the atob() method to decode the data again. For example, you can encode, transmit, and decode control characters such as ASCII values 0 through 31.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/atob">WindowOrWorkerGlobalScope.atob - MDN</a>
   */
  @Nonnull
  public native String atob(@Nonnull String data);

  /**
   * The WindowOrWorkerGlobalScope.btoa() method creates a Base64-encoded ASCII string from a binary string (i.e., a String object in which each character in the string is treated as a byte of binary data).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/btoa">WindowOrWorkerGlobalScope.btoa - MDN</a>
   */
  @Nonnull
  public native String btoa(@Nonnull String data);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearInterval">WindowOrWorkerGlobalScope.clearInterval - MDN</a>
   */
  public native void clearInterval(int handle);

  /**
   * The clearInterval() method of the WindowOrWorkerGlobalScope mixin cancels a timed, repeating action which was previously established by a call to setInterval().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearInterval">WindowOrWorkerGlobalScope.clearInterval - MDN</a>
   */
  public native void clearInterval();

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearTimeout">WindowOrWorkerGlobalScope.clearTimeout - MDN</a>
   */
  public native void clearTimeout(int handle);

  /**
   * The clearTimeout() method of the WindowOrWorkerGlobalScope mixin cancels a timeout previously established by calling setTimeout().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearTimeout">WindowOrWorkerGlobalScope.clearTimeout - MDN</a>
   */
  public native void clearTimeout();

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image,
      @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh, @Nonnull ImageBitmapOptions options);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmapSource image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull CanvasImageSource image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLOrSVGImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull SVGImageElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLVideoElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull HTMLCanvasElement image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageBitmap image, int sx, int sy,
      int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull OffscreenCanvas image, int sx,
      int sy, int sw, int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull Blob image, int sx, int sy, int sw,
      int sh);

  /**
   * The createImageBitmap() method creates a bitmap from a given source, optionally cropped to contain only a portion of that source. The method exists on the global scope in both windows and workers. It accepts a variety of different image sources, and returns a Promise which resolves to an ImageBitmap.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/createImageBitmap">WindowOrWorkerGlobalScope.createImageBitmap - MDN</a>
   */
  @Nonnull
  public native Promise<ImageBitmap> createImageBitmap(@Nonnull ImageData image, int sx, int sy,
      int sw, int sh);

  /**
   * The queueMicrotask() method, which is exposed on the Window or Worker interface, queues a microtask to be executed at a safe time prior to control returning to the browser's event loop.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/queueMicrotask">WindowOrWorkerGlobalScope.queueMicrotask - MDN</a>
   */
  public native void queueMicrotask(@Nonnull VoidFunction callback);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout,
      @Nullable Any... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull String handler, int timeout, @Nullable Any... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull Function handler, int timeout, @Nullable Any... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull String handler, int timeout);

  /**
   * The setInterval() method, offered on the Window and Worker interfaces, repeatedly calls a function or executes a code snippet, with a fixed time delay between each call.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval">WindowOrWorkerGlobalScope.setInterval - MDN</a>
   */
  public native int setInterval(@Nonnull Function handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @Nullable Any... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull String handler, int timeout, @Nullable Any... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull Function handler, int timeout, @Nullable Any... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull String handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull Function handler, int timeout,
      @DoNotAutobox @Nullable Object... arguments);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull TimerHandler handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull String handler, int timeout);

  /**
   * The setTimeout() method of the WindowOrWorkerGlobalScope mixin (and successor to Window.setTimeout()) sets a timer which executes a function or specified piece of code once the timer expires.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout">WindowOrWorkerGlobalScope.setTimeout - MDN</a>
   */
  public native int setTimeout(@Nonnull Function handler, int timeout);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull String input, @Nonnull RequestInit init);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull RequestInfo input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
  @Nonnull
  public native Promise<Response> fetch(@Nonnull Request input);

  /**
   * The fetch() method of the WindowOrWorkerGlobalScope mixin starts the process of fetching a resource from the network, returning a promise which is fulfilled once the response is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch">WindowOrWorkerGlobalScope.fetch - MDN</a>
   */
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

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean options) {
    addEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    addEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback,
      final boolean options) {
    removeEventListener( "hashchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeHashchangeListener(@Nonnull final HashChangeEventListener callback) {
    removeEventListener( "hashchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback,
      final boolean options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback,
      final boolean options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean options) {
    addEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageerrorListener(@Nonnull final MessageEventListener callback) {
    addEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback,
      final boolean options) {
    removeEventListener( "messageerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageerrorListener(@Nonnull final MessageEventListener callback) {
    removeEventListener( "messageerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean options) {
    addEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPagehideListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback,
      final boolean options) {
    removeEventListener( "pagehide", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePagehideListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pagehide", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean options) {
    addEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPageshowListener(@Nonnull final PageTransitionEventListener callback) {
    addEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback,
      final boolean options) {
    removeEventListener( "pageshow", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePageshowListener(@Nonnull final PageTransitionEventListener callback) {
    removeEventListener( "pageshow", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean options) {
    addEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean options) {
    removeEventListener( "rejectionhandled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRejectionhandledListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "rejectionhandled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback,
      final boolean options) {
    addEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStorageListener(@Nonnull final StorageEventListener callback) {
    addEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback,
      final boolean options) {
    removeEventListener( "storage", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStorageListener(@Nonnull final StorageEventListener callback) {
    removeEventListener( "storage", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean options) {
    addEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    addEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback, final boolean options) {
    removeEventListener( "unhandledrejection", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnhandledrejectionListener(
      @Nonnull final PromiseRejectionEventListener callback) {
    removeEventListener( "unhandledrejection", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDOMContentLoadedListener(@Nonnull final EventListener callback) {
    addEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDOMContentLoadedListener(@Nonnull final EventListener callback) {
    removeEventListener( "DOMContentLoaded", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAfterprintListener(@Nonnull final EventListener callback) {
    addEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "afterprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAfterprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "afterprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    addEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    removeEventListener( "animationcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationcancelListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    addEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationendListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    removeEventListener( "animationend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationendListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    addEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationiterationListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    removeEventListener( "animationiteration", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationiterationListener(
      @Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationiteration", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    addEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    addEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback,
      final boolean options) {
    removeEventListener( "animationstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAnimationstartListener(@Nonnull final AnimationEventListener callback) {
    removeEventListener( "animationstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAppinstalledListener(@Nonnull final EventListener callback) {
    addEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "appinstalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAppinstalledListener(@Nonnull final EventListener callback) {
    removeEventListener( "appinstalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeprintListener(@Nonnull final EventListener callback) {
    addEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "beforeprint", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeprintListener(@Nonnull final EventListener callback) {
    removeEventListener( "beforeprint", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBeforeunloadListener(@Nonnull final EventListener callback) {
    addEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "beforeunload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBeforeunloadListener(@Nonnull final EventListener callback) {
    removeEventListener( "beforeunload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      final boolean options) {
    addEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      final boolean options) {
    removeEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    removeEventListener( "clipboardchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeClipboardchangeListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "clipboardchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    removeEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean options) {
    addEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    addEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback,
      final boolean options) {
    removeEventListener( "devicemotion", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDevicemotionListener(@Nonnull final DeviceMotionEventListener callback) {
    removeEventListener( "devicemotion", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean options) {
    addEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    addEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback, final boolean options) {
    removeEventListener( "deviceorientation", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDeviceorientationListener(
      @Nonnull final DeviceOrientationEventListener callback) {
    removeEventListener( "deviceorientation", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      final boolean options) {
    addEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      final boolean options) {
    removeEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean options) {
    addEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean options) {
    removeEventListener( "gamepadconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepadconnectedListener(@Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepadconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean options) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback) {
    addEventListener( "gamepaddisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(@Nonnull final GamepadEventListener callback,
      final boolean options) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeGamepaddisconnectedListener(
      @Nonnull final GamepadEventListener callback) {
    removeEventListener( "gamepaddisconnected", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLanguagechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "languagechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLanguagechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "languagechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback, final boolean options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final EventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final EventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOfflineListener(@Nonnull final EventListener callback) {
    addEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "offline", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOfflineListener(@Nonnull final EventListener callback) {
    removeEventListener( "offline", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOnlineListener(@Nonnull final EventListener callback) {
    addEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "online", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOnlineListener(@Nonnull final EventListener callback) {
    removeEventListener( "online", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addOrientationchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "orientationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeOrientationchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "orientationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback,
      final boolean options) {
    addEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addResizeListener(@Nonnull final UIEventListener callback) {
    addEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback,
      final boolean options) {
    removeEventListener( "resize", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeResizeListener(@Nonnull final UIEventListener callback) {
    removeEventListener( "resize", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    addEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitioncancelListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    removeEventListener( "transitioncancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitioncancelListener(
      @Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitioncancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    addEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionendListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    removeEventListener( "transitionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionendListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    addEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    removeEventListener( "transitionrun", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionrunListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionrun", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    addEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    addEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback,
      final boolean options) {
    removeEventListener( "transitionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTransitionstartListener(@Nonnull final TransitionEventListener callback) {
    removeEventListener( "transitionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUnloadListener(@Nonnull final EventListener callback) {
    addEventListener( "unload", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "unload", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUnloadListener(@Nonnull final EventListener callback) {
    removeEventListener( "unload", Js.cast( callback ) );
  }
}
