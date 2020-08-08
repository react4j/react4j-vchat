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
    name = "CompositionEvent"
)
public class CompositionEvent extends UIEvent {
  public CompositionEvent(@Nonnull final String type,
      @Nonnull final CompositionEventInit eventInitDict) {
    super( null );
  }

  public CompositionEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native String data();
}
