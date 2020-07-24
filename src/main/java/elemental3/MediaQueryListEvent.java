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
    name = "MediaQueryListEvent"
)
public class MediaQueryListEvent extends Event {
  public MediaQueryListEvent(@Nonnull final String type,
      @Nonnull final MediaQueryListEventInit eventInitDict) {
    super( null );
  }

  public MediaQueryListEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "matches"
  )
  public native boolean matches();

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native String media();
}
