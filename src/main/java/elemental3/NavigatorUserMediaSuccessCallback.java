package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface NavigatorUserMediaSuccessCallback {
  void onInvoke(@Nonnull MediaStream stream);
}
