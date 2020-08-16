package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "JSON"
)
public class JSON {
  JSON() {
  }

  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      @Nullable StringifySpaceUnionType space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nullable StringifySpaceUnionType space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nullable StringifySpaceUnionType space);

  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      @Nonnull String space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, @Nonnull String space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, @Nonnull String space);

  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer,
      int space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer, int space);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer, int space);

  @Nonnull
  public static native String stringify(@Nullable Any value, @Nonnull StringifyReplacerFn replacer);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull JsArray<StringOrLongLongUnion> replacer);

  @Nonnull
  public static native String stringify(@Nullable Any value,
      @Nonnull StringOrLongLongUnion[] replacer);

  @Nonnull
  public static native String stringify(@Nullable Any value);

  @Nullable
  public static native Any parse(@Nonnull String text, @Nullable ParseReviverFn reviver);

  @Nullable
  public static native Any parse(@Nonnull String text);
}
