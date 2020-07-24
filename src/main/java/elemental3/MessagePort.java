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
    name = "MessagePort"
)
public class MessagePort extends EventTarget {
  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  MessagePort() {
  }

  public native void close();

  public native void postMessage(@Nullable Any message, @Nonnull JsArray<Object> transfer);

  public native void postMessage(@Nullable Any message, @Nonnull Object[] transfer);

  public native void postMessage(@Nullable Any message, @Nonnull PostMessageOptions options);

  public native void postMessage(@Nullable Any message);

  public native void start();
}
