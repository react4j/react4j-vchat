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
    name = "AnimationEvent"
)
public class AnimationEvent extends Event {
  AnimationEvent() {
    super( null );
  }

  @JsProperty(
      name = "animationName"
  )
  @Nonnull
  public native String animationName();

  @JsProperty(
      name = "elapsedTime"
  )
  public native double elapsedTime();

  @JsProperty(
      name = "pseudoElement"
  )
  @Nonnull
  public native String pseudoElement();
}
