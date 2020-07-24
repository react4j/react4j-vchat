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
    name = "DataTransferItem"
)
public class DataTransferItem {
  DataTransferItem() {
  }

  @JsProperty(
      name = "kind"
  )
  @Nonnull
  public native String kind();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nullable
  public native File getAsFile();

  public native void getAsString(@Nullable FunctionStringCallback _callback);
}
