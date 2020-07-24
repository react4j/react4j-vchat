package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FormData"
)
public class FormData {
  public FormData(@Nonnull final HTMLFormElement form) {
  }

  public FormData() {
  }

  public native void append(@Nonnull String name, @Nonnull String value);

  public native void append(@Nonnull String name, @Nonnull Blob blobValue,
      @Nonnull String filename);

  public native void append(@Nonnull String name, @Nonnull Blob blobValue);

  public native void delete(@Nonnull String name);

  @Nullable
  public native FormDataEntryValue get(@Nonnull String name);

  @Nonnull
  public native JsArray<FormDataEntryValue> getAll(@Nonnull String name);

  public native boolean has(@Nonnull String name);

  public native void set(@Nonnull String name, @Nonnull String value);

  public native void set(@Nonnull String name, @Nonnull Blob blobValue, @Nonnull String filename);

  public native void set(@Nonnull String name, @Nonnull Blob blobValue);
}
