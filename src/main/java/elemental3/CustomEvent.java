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
    name = "CustomEvent"
)
public class CustomEvent extends Event {
  public CustomEvent(@Nonnull final String type, @Nonnull final CustomEventInit eventInitDict) {
    super( null );
  }

  public CustomEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "detail"
  )
  @Nullable
  public native Any detail();

  public native void initCustomEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any detail);

  public native void initCustomEvent(@Nonnull String type, boolean bubbles, boolean cancelable);

  public native void initCustomEvent(@Nonnull String type, boolean bubbles);

  public native void initCustomEvent(@Nonnull String type);
}
