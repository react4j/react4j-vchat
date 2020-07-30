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
    name = "MediaRecorderErrorEvent"
)
public class MediaRecorderErrorEvent extends Event {
  MediaRecorderErrorEvent() {
    super( null );
  }

  @JsProperty(
      name = "error"
  )
  @Nonnull
  public native DOMException error();
}
