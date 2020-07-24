package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Blob"
)
public class Blob {
  public Blob(@Nonnull final JsArray<BlobPart> blobParts, @Nonnull final BlobPropertyBag options) {
  }

  public Blob(@Nonnull final BlobPart[] blobParts, @Nonnull final BlobPropertyBag options) {
  }

  public Blob(@Nonnull final JsArray<BlobPart> blobParts) {
  }

  public Blob(@Nonnull final BlobPart[] blobParts) {
  }

  public Blob() {
  }

  @JsProperty(
      name = "size"
  )
  public native int size();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  @Nonnull
  public native Promise<ArrayBuffer> arrayBuffer();

  @Nonnull
  public native Blob slice(int start, int end, @Nonnull String contentType);

  @Nonnull
  public native Blob slice(int start, int end);

  @Nonnull
  public native Blob slice(int start);

  @Nonnull
  public native Blob slice();

  @Nonnull
  public native ReadableStream stream();

  @Nonnull
  public native Promise<String> text();
}
