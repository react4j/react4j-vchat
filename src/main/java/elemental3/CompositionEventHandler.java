package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type CompositionEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface CompositionEventHandler {
  void onInvoke(@Nonnull CompositionEvent event);
}
