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
    name = "URL"
)
public class URL {
  @Nonnull
  public String hash;

  @Nonnull
  public String host;

  @Nonnull
  public String hostname;

  @Nonnull
  public String password;

  @Nonnull
  public String pathname;

  @Nonnull
  public String port;

  @Nonnull
  public String protocol;

  @Nonnull
  public String search;

  @Nonnull
  public String username;

  @Nonnull
  public String href;

  public URL(@Nonnull final String url, @Nonnull final String base) {
  }

  public URL(@Nonnull final String url) {
  }

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  @JsProperty(
      name = "searchParams"
  )
  @Nonnull
  public native URLSearchParams searchParams();

  @Nonnull
  public native String toJSON();

  @Nonnull
  public static native String createObjectURL(@Nonnull Blob blob);

  public static native void revokeObjectURL(@Nonnull String url);

  @Nonnull
  public static native String createObjectURL(@Nonnull MediaSource mediaSource);
}
