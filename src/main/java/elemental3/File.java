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
    name = "File"
)
public class File extends Blob {
  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName,
      @Nonnull final FilePropertyBag options) {
  }

  public File(@Nonnull final JsArray<BlobPart> fileBits, @Nonnull final String fileName) {
  }

  public File(@Nonnull final BlobPart[] fileBits, @Nonnull final String fileName) {
  }

  @JsProperty(
      name = "lastModified"
  )
  public native int lastModified();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();
}
