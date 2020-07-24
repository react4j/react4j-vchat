package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLSerializer"
)
public class XMLSerializer {
  public XMLSerializer() {
  }

  @Nonnull
  public native String serializeToString(@Nonnull Node root);
}
