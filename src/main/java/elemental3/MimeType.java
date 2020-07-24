package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MimeType"
)
public class MimeType {
  MimeType() {
  }

  @JsProperty(
      name = "description"
  )
  @Nonnull
  public native String description();

  @JsProperty(
      name = "enabledPlugin"
  )
  @Nonnull
  public native Plugin enabledPlugin();

  @JsProperty(
      name = "suffixes"
  )
  @Nonnull
  public native String suffixes();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();
}
