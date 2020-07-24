package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataTransfer"
)
public class DataTransfer {
  @Nonnull
  public String dropEffect;

  @Nonnull
  public String effectAllowed;

  public DataTransfer() {
  }

  @JsProperty(
      name = "files"
  )
  @Nonnull
  public native FileList files();

  @JsProperty(
      name = "items"
  )
  @Nonnull
  public native DataTransferItemList items();

  @JsProperty(
      name = "types"
  )
  @Nonnull
  public native JsArray<String> types();

  public native void clearData(@Nonnull String format);

  public native void clearData();

  @Nonnull
  public native String getData(@Nonnull String format);

  public native void setData(@Nonnull String format, @Nonnull String data);

  public native void setDragImage(@Nonnull Element image, int x, int y);
}
