package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MouseEvent"
)
public class MouseEvent extends UIEvent {
  MouseEvent() {
  }

  @JsProperty(
      name = "altKey"
  )
  public native boolean altKey();

  @JsProperty(
      name = "button"
  )
  public native short button();

  @JsProperty(
      name = "buttons"
  )
  public native int buttons();

  @JsProperty(
      name = "ctrlKey"
  )
  public native boolean ctrlKey();

  @JsProperty(
      name = "metaKey"
  )
  public native boolean metaKey();

  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  public native EventTarget relatedTarget();

  @JsProperty(
      name = "shiftKey"
  )
  public native boolean shiftKey();

  @JsProperty(
      name = "clientX"
  )
  public native double clientX();

  @JsProperty(
      name = "clientY"
  )
  public native double clientY();

  @JsProperty(
      name = "offsetX"
  )
  public native double offsetX();

  @JsProperty(
      name = "offsetY"
  )
  public native double offsetY();

  @JsProperty(
      name = "pageX"
  )
  public native double pageX();

  @JsProperty(
      name = "pageY"
  )
  public native double pageY();

  @JsProperty(
      name = "screenX"
  )
  public native double screenX();

  @JsProperty(
      name = "screenY"
  )
  public native double screenY();

  @JsProperty(
      name = "x"
  )
  public native double x();

  @JsProperty(
      name = "y"
  )
  public native double y();

  @JsProperty(
      name = "movementX"
  )
  public native int movementX();

  @JsProperty(
      name = "movementY"
  )
  public native int movementY();

  public native boolean getModifierState(@Nonnull String keyArg);
}
