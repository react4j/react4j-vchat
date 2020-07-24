package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MessageChannel"
)
public class MessageChannel {
  public MessageChannel() {
  }

  @JsProperty(
      name = "port1"
  )
  @Nonnull
  public native MessagePort port1();

  @JsProperty(
      name = "port2"
  )
  @Nonnull
  public native MessagePort port2();
}
