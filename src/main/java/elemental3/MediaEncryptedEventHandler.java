package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type MediaEncryptedEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MediaEncryptedEventHandler {
  void onInvoke(@Nonnull MediaEncryptedEvent event);
}
