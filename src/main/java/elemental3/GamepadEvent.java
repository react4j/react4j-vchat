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
    name = "GamepadEvent"
)
public class GamepadEvent extends Event {
  public GamepadEvent(@Nonnull final String type, @Nonnull final GamepadEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "gamepad"
  )
  @Nonnull
  public native Gamepad gamepad();
}
