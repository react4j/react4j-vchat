package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type BeforeUnloadEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface BeforeUnloadEventHandler {
  void onInvoke(@Nonnull BeforeUnloadEvent event);
}
