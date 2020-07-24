package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeyMessageEvent"
)
public class MediaKeyMessageEvent extends Event {
  MediaKeyMessageEvent() {
    super( null );
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native ArrayBuffer message();

  @JsProperty(
      name = "messageType"
  )
  @Nonnull
  public native String messageType();
}
