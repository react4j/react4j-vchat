package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PromiseRejectionEvent"
)
public class PromiseRejectionEvent extends Event {
  public PromiseRejectionEvent(@Nonnull final String type,
      @Nonnull final PromiseRejectionEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "promise"
  )
  @Nonnull
  public native Promise<Any> promise();

  @JsProperty(
      name = "reason"
  )
  @Nullable
  public native Any reason();
}
