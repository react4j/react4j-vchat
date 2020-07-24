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
    name = "HTMLElement"
)
public class HTMLElement extends Element {
  @Nonnull
  public String accessKey;

  @Nonnull
  public String autocapitalize;

  @Nonnull
  public String dir;

  public boolean draggable;

  public boolean hidden;

  @Nonnull
  public String innerText;

  @Nonnull
  public String lang;

  public boolean spellcheck;

  @Nonnull
  public String title;

  public boolean translate;

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

  @JsProperty(
      name = "accessKeyLabel"
  )
  @Nonnull
  public native String accessKeyLabel();

  @JsProperty(
      name = "offsetHeight"
  )
  public native int offsetHeight();

  @JsProperty(
      name = "offsetLeft"
  )
  public native int offsetLeft();

  @JsProperty(
      name = "offsetParent"
  )
  @Nullable
  public native Element offsetParent();

  @JsProperty(
      name = "offsetTop"
  )
  public native int offsetTop();

  @JsProperty(
      name = "offsetWidth"
  )
  public native int offsetWidth();

  @JsProperty(
      name = "isContentEditable"
  )
  public native boolean isContentEditable();

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

  public native void click();

  public native void blur();

  public native void focus(@Nonnull FocusOptions options);

  public native void focus();
}
