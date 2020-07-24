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
    name = "Location"
)
public class Location {
  @Nonnull
  public String hash;

  @Nonnull
  public String host;

  @Nonnull
  public String hostname;

  @Nonnull
  public String pathname;

  @Nonnull
  public String port;

  @Nonnull
  public String protocol;

  @Nonnull
  public String search;

  @Nonnull
  public String href;

  Location() {
  }

  @JsProperty(
      name = "ancestorOrigins"
  )
  @Nonnull
  public native DOMStringList ancestorOrigins();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  public native void assign(@Nonnull String url);

  public native void reload();

  public native void replace(@Nonnull String url);
}
