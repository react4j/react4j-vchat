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
    name = "NamedNodeMap"
)
public class NamedNodeMap {
  NamedNodeMap() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native Attr getNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @Nonnull
  public native Attr removeNamedItem(@Nonnull String qualifiedName);

  @Nonnull
  public native Attr removeNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @Nullable
  public native Attr setNamedItem(@Nonnull Attr attr);

  @Nullable
  public native Attr setNamedItemNS(@Nonnull Attr attr);
}
