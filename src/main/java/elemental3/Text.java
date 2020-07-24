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
    name = "Text"
)
public class Text extends CharacterData {
  public Text(@Nonnull final String data) {
  }

  public Text() {
  }

  @JsProperty(
      name = "wholeText"
  )
  @Nonnull
  public native String wholeText();

  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  @Nonnull
  public native Text splitText(int offset);
}
