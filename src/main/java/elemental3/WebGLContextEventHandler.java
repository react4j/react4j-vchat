package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type WebGLContextEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface WebGLContextEventHandler {
  void onInvoke(@Nonnull WebGLContextEvent event);
}
