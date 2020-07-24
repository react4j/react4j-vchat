package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Clipboard"
)
public class Clipboard extends EventTarget {
  Clipboard() {
  }

  @Nonnull
  public native Promise<JsArray<ClipboardItem>> read();

  @Nonnull
  public native Promise<String> readText();

  @Nonnull
  public native Promise<Void> write(@Nonnull JsArray<ClipboardItem> data);

  @Nonnull
  public native Promise<Void> write(@Nonnull ClipboardItem[] data);

  @Nonnull
  public native Promise<Void> writeText(@Nonnull String data);
}
