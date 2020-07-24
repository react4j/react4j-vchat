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
    name = "Worklet"
)
public class Worklet {
  Worklet() {
  }

  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL, @Nonnull WorkletOptions options);

  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL);
}
