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
    name = "TransitionEvent"
)
public class TransitionEvent extends Event {
  public TransitionEvent(@Nonnull final String type,
      @Nonnull final TransitionEventInit transitionEventInitDict) {
    super( null );
  }

  public TransitionEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "elapsedTime"
  )
  public native double elapsedTime();

  @JsProperty(
      name = "propertyName"
  )
  @Nonnull
  public native String propertyName();

  @JsProperty(
      name = "pseudoElement"
  )
  @Nonnull
  public native String pseudoElement();
}
