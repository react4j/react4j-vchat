package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StorageManager"
)
public class StorageManager {
  StorageManager() {
  }

  @Nonnull
  public native Promise<StorageEstimate> estimate();

  @Nonnull
  public native Promise<Boolean> persist();

  @Nonnull
  public native Promise<Boolean> persisted();
}
