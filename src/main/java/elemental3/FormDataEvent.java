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
    name = "FormDataEvent"
)
public class FormDataEvent extends Event {
  public FormDataEvent(@Nonnull final String type, @Nonnull final FormDataEventInit eventInitDict) {
    super( null );
  }

  @JsProperty(
      name = "formData"
  )
  @Nonnull
  public native FormData formData();
}
