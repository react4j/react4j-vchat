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
    name = "HashChangeEvent"
)
public class HashChangeEvent extends Event {
  public HashChangeEvent(@Nonnull final String type,
      @Nonnull final HashChangeEventInit eventInitDict) {
    super( null );
  }

  public HashChangeEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "newURL"
  )
  @Nonnull
  public native String newURL();

  @JsProperty(
      name = "oldURL"
  )
  @Nonnull
  public native String oldURL();
}
