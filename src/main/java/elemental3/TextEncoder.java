package elemental3;

import elemental2.core.Uint8Array;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextEncoder"
)
public class TextEncoder {
  public TextEncoder() {
  }

  @JsProperty(
      name = "encoding"
  )
  @Nonnull
  public native String encoding();

  @Nonnull
  public native Uint8Array encode(@Nonnull String input);

  @Nonnull
  public native Uint8Array encode();

  @Nonnull
  public native TextEncoderEncodeIntoResult encodeInto(@Nonnull String source,
      @Nonnull Uint8Array destination);
}
