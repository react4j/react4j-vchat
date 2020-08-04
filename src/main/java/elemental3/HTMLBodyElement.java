package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLBodyElement interface provides special properties (beyond those inherited from the regular HTMLElement interface) for manipulating body elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLBodyElement">HTMLBodyElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLBodyElement"
)
public class HTMLBodyElement extends HTMLElement {
  @Nullable
  public EventHandler onorientationchange;

  @Nonnull
  public String aLink;

  @Nonnull
  public String background;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String link;

  @Nonnull
  public String text;

  @Nonnull
  public String vLink;

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

  public HTMLBodyElement() {
  }
}
