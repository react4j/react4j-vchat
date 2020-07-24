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
    name = "CharacterData"
)
public class CharacterData extends Node {
  @Nonnull
  public String data;

  CharacterData() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "nextElementSibling"
  )
  @Nullable
  public native Element nextElementSibling();

  @JsProperty(
      name = "previousElementSibling"
  )
  @Nullable
  public native Element previousElementSibling();

  public native void appendData(@Nonnull String data);

  public native void deleteData(int offset, int count);

  public native void insertData(int offset, @Nonnull String data);

  public native void replaceData(int offset, int count, @Nonnull String data);

  @Nonnull
  public native String substringData(int offset, int count);

  public native void after(@Nonnull Node... nodes);

  public native void after(@Nonnull String... nodes);

  public native void before(@Nonnull Node... nodes);

  public native void before(@Nonnull String... nodes);

  public native void remove();

  public native void replaceWith(@Nonnull Node... nodes);

  public native void replaceWith(@Nonnull String... nodes);
}
