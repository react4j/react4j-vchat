package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
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
    name = "IDBFactory"
)
public class IDBFactory {
  IDBFactory() {
  }

  public native short cmp(@Nullable Any first, @Nullable Any second);

  @Nonnull
  public native Promise<JsArray<IDBDatabaseInfo>> databases();

  @Nonnull
  public native IDBOpenDBRequest deleteDatabase(@Nonnull String name);

  @Nonnull
  public native IDBOpenDBRequest open(@Nonnull String name, int version);

  @Nonnull
  public native IDBOpenDBRequest open(@Nonnull String name);
}
