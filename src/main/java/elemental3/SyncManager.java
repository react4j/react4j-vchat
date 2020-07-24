package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SyncManager"
)
public class SyncManager {
  SyncManager() {
  }

  @Nonnull
  public native Promise<JsArray<String>> getTags();

  @Nonnull
  public native Promise<Void> register(@Nonnull String tag);
}
