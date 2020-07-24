package elemental3;

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
    name = "PopStateEvent"
)
public class PopStateEvent extends Event {
  public PopStateEvent(@Nonnull final String type, @Nonnull final PopStateEventInit eventInitDict) {
    super( null );
  }

  public PopStateEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "state"
  )
  @Nullable
  public native Any state();
}
