package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type XRSessionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface XRSessionEventHandler {
  void onInvoke(@Nonnull XRSessionEvent event);
}
