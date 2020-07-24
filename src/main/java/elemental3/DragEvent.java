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
    name = "DragEvent"
)
public class DragEvent extends MouseEvent {
  public DragEvent(@Nonnull final String type, @Nonnull final DragEventInit eventInitDict) {
  }

  public DragEvent(@Nonnull final String type) {
  }

  @JsProperty(
      name = "dataTransfer"
  )
  @Nullable
  public native DataTransfer dataTransfer();
}
