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
    name = "StyleSheet"
)
public class StyleSheet {
  public boolean disabled;

  StyleSheet() {
  }

  @JsProperty(
      name = "href"
  )
  @Nullable
  public native String href();

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();

  @JsProperty(
      name = "ownerNode"
  )
  @Nullable
  public native ElementOrProcessingInstructionUnion ownerNode();

  @JsProperty(
      name = "parentStyleSheet"
  )
  @Nullable
  public native CSSStyleSheet parentStyleSheet();

  @JsProperty(
      name = "title"
  )
  @Nullable
  public native String title();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
