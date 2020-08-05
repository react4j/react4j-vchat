package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type BlobEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface BlobEventHandler {
  void onInvoke(@Nonnull BlobEvent event);
}
