package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PushSubscription"
)
public class PushSubscription {
  PushSubscription() {
  }

  @JsProperty(
      name = "endpoint"
  )
  @Nonnull
  public native String endpoint();

  @JsProperty(
      name = "expirationTime"
  )
  @Nullable
  public native int expirationTime();

  @JsProperty(
      name = "options"
  )
  @Nonnull
  public native PushSubscriptionOptions options();

  @Nullable
  public native ArrayBuffer getKey(
      @MagicConstant(stringValues = {"auth", "p256dh"}) @Nonnull String name);

  @Nonnull
  public native PushSubscriptionJSON toJSON();

  @Nonnull
  public native Promise<Boolean> unsubscribe();
}
