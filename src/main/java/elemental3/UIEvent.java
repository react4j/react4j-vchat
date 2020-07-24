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
    name = "UIEvent"
)
public class UIEvent extends Event {
  UIEvent() {
    super( null );
  }

  @JsProperty(
      name = "detail"
  )
  public native int detail();

  @JsProperty(
      name = "view"
  )
  @Nullable
  public native Window view();

  @JsProperty(
      name = "which"
  )
  public native int which();
}
