package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FocusEvent"
)
public class FocusEvent extends UIEvent {
  public FocusEvent(@Nonnull final String type, @Nonnull final FocusEventInit eventInitDict) {
    super( null );
  }

  public FocusEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();
}
