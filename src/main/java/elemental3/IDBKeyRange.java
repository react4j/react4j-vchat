package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBKeyRange"
)
public class IDBKeyRange {
  IDBKeyRange() {
  }

  @JsProperty(
      name = "lower"
  )
  @Nullable
  public native Any lower();

  @JsProperty(
      name = "lowerOpen"
  )
  public native boolean lowerOpen();

  @JsProperty(
      name = "upper"
  )
  @Nullable
  public native Any upper();

  @JsProperty(
      name = "upperOpen"
  )
  public native boolean upperOpen();

  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper,
      boolean lowerOpen, boolean upperOpen);

  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper,
      boolean lowerOpen);

  @Nonnull
  public static native IDBKeyRange bound(@Nullable Any lower, @Nullable Any upper);

  @Nonnull
  public static native IDBKeyRange lowerBound(@Nullable Any lower, boolean open);

  @Nonnull
  public static native IDBKeyRange lowerBound(@Nullable Any lower);

  @Nonnull
  public static native IDBKeyRange only(@Nullable Any value);

  @Nonnull
  public static native IDBKeyRange upperBound(@Nullable Any upper, boolean open);

  @Nonnull
  public static native IDBKeyRange upperBound(@Nullable Any upper);

  public native boolean includes(@Nullable Any key);
}
