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
    name = "XPathExpression"
)
public class XPathExpression {
  XPathExpression() {
  }

  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type,
      @Nullable XPathResult result);

  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type);

  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode);
}
