package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationTimeline"
)
public class AnimationTimeline {
  AnimationTimeline() {
  }

  @JsProperty(
      name = "currentTime"
  )
  @Nullable
  public native Double currentTime();
}
