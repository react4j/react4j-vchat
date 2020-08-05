package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type CustomEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface CustomEventHandler {
  void onInvoke(@Nonnull CustomEvent event);
}
