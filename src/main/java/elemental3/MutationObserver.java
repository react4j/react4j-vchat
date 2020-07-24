package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MutationObserver"
)
public class MutationObserver {
  public MutationObserver(@Nonnull final MutationCallback callback) {
  }

  public native void disconnect();

  public native void observe(@Nonnull Node target, @Nonnull MutationObserverInit options);

  public native void observe(@Nonnull Node target);

  @Nonnull
  public native JsArray<MutationRecord> takeRecords();
}
