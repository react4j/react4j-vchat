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
    name = "DataTransferItemList"
)
public class DataTransferItemList {
  DataTransferItemList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native DataTransferItem add(@Nonnull String data, @Nonnull String type);

  @Nullable
  public native DataTransferItem add(@Nonnull File data);

  public native void clear();

  public native void remove(int index);
}
