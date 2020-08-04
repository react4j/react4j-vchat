package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLFrameSetElement interface provides special properties (beyond those of the regular HTMLElement interface they also inherit) for manipulating frameset elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFrameSetElement">HTMLFrameSetElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFrameSetElement"
)
public class HTMLFrameSetElement extends HTMLElement {
  @Nonnull
  public String cols;

  @Nonnull
  public String rows;

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

  public HTMLFrameSetElement() {
  }
}
