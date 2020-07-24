package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMImplementation"
)
public class DOMImplementation {
  DOMImplementation() {
  }

  @Nonnull
  public native XMLDocument createDocument(@Nullable String namespace,
      @Nonnull String qualifiedName, @Nullable DocumentType doctype);

  @Nonnull
  public native XMLDocument createDocument(@Nullable String namespace,
      @Nonnull String qualifiedName);

  @Nonnull
  public native DocumentType createDocumentType(@Nonnull String qualifiedName,
      @Nonnull String publicId, @Nonnull String systemId);

  @Nonnull
  public native Document createHTMLDocument(@Nonnull String title);

  @Nonnull
  public native Document createHTMLDocument();

  public native boolean hasFeature();
}
