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
    name = "ShadowRoot"
)
public class ShadowRoot extends DocumentFragment {
  @Nullable
  public EventHandler onslotchange;

  @Nonnull
  public String innerHTML;

  ShadowRoot() {
  }

  @JsProperty(
      name = "host"
  )
  @Nonnull
  public native Element host();

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native String mode();

  /**
   * The styleSheets read-only property of the DocumentOrShadowRoot interface returns a StyleSheetList of CSSStyleSheet objects, for stylesheets explicitly linked into or embedded in a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/styleSheets">DocumentOrShadowRoot.styleSheets - MDN</a>
   */
  @JsProperty(
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();

  /**
   * The pointerLockElement property of the Document and ShadowRoot interfaces provides the element set as the target for mouse events while the pointer is locked. It is null if lock is pending, pointer is unlocked, or the target is in another document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/pointerLockElement">DocumentOrShadowRoot.pointerLockElement - MDN</a>
   */
  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  /**
   * The DocumentOrShadowRoot.fullscreenElement read-only property returns the Element that is currently being presented in full-screen mode in this document, or null if full-screen mode is not currently in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/fullscreenElement">DocumentOrShadowRoot.fullscreenElement - MDN</a>
   */
  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  /**
   * The activeElement read-only property of the Document and ShadowRoot interfaces returns the Element within the DOM or shadow DOM tree that currently has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/activeElement">DocumentOrShadowRoot.activeElement - MDN</a>
   */
  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();
}
