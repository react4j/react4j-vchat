package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type SubmitEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface SubmitEventHandler {
  void onInvoke(@Nonnull SubmitEvent event);
}
