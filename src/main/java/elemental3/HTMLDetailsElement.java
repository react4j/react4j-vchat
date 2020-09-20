package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLDetailsElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating details elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLDetailsElement">HTMLDetailsElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLDetailsElement"
)
public class HTMLDetailsElement extends HTMLElement {
  public boolean open;

  protected HTMLDetailsElement() {
  }

  @JsOverlay
  public final void addToggleListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "toggle", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addToggleListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "toggle", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addToggleListener(@Nonnull final EventListener callback) {
    addEventListener( "toggle", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeToggleListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "toggle", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeToggleListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "toggle", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeToggleListener(@Nonnull final EventListener callback) {
    removeEventListener( "toggle", Js.cast( callback ) );
  }
}
