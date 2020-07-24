package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PageTransitionEvent"
)
public class PageTransitionEvent extends Event {
  public PageTransitionEvent(@Nonnull final String type,
      @Nonnull final PageTransitionEventInit eventInitDict) {
    super( null );
  }

  public PageTransitionEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "persisted"
  )
  public native boolean persisted();
}
