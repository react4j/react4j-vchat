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
    name = "BroadcastChannel"
)
public class BroadcastChannel extends EventTarget {
  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  public BroadcastChannel(@Nonnull final String name) {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  public native void close();

  public native void postMessage(@Nullable Any message);
}
