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
    name = "ClipboardEvent"
)
public class ClipboardEvent extends Event {
  public ClipboardEvent(@Nonnull final String type,
      @Nonnull final ClipboardEventInit eventInitDict) {
    super( null );
  }

  public ClipboardEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "clipboardData"
  )
  @Nullable
  public native DataTransfer clipboardData();
}
