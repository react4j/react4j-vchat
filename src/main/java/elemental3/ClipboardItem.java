package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ClipboardItem"
)
public class ClipboardItem {
  public ClipboardItem(@Nonnull final JsPropertyMap<Promise<ClipboardItemDataType>> items,
      @Nonnull final ClipboardItemOptions options) {
  }

  public ClipboardItem(@Nonnull final JsPropertyMap<Promise<ClipboardItemDataType>> items) {
  }

  @JsProperty(
      name = "delayed"
  )
  public native boolean delayed();

  @JsProperty(
      name = "lastModified"
  )
  public native int lastModified();

  @JsProperty(
      name = "presentationStyle"
  )
  @Nonnull
  public native String presentationStyle();

  @JsProperty(
      name = "types"
  )
  @Nonnull
  public native JsArray<String> types();

  @Nonnull
  public static native ClipboardItem createDelayed(
      @Nonnull JsPropertyMap<ClipboardItemDelayedCallback> items,
      @Nonnull ClipboardItemOptions options);

  @Nonnull
  public static native ClipboardItem createDelayed(
      @Nonnull JsPropertyMap<ClipboardItemDelayedCallback> items);

  @Nonnull
  public native Promise<Blob> getType(@Nonnull String type);
}
