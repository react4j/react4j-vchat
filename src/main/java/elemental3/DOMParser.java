package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMParser"
)
public class DOMParser {
  public DOMParser() {
  }

  @Nonnull
  public native Document parseFromString(@Nonnull String string,
      @MagicConstant(stringValues = {"application/xhtml+xml", "application/xml", "image/svg+xml", "text/html", "text/xml"}) @Nonnull String type);
}
