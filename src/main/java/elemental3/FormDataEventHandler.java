package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type FormDataEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface FormDataEventHandler {
  void onInvoke(@Nonnull FormDataEvent event);
}
