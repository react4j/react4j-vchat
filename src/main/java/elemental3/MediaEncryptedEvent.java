package elemental3;

import elemental2.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaEncryptedEvent"
)
public class MediaEncryptedEvent extends Event {
  MediaEncryptedEvent() {
    super( null );
  }

  @JsProperty(
      name = "initData"
  )
  @Nullable
  public native ArrayBuffer initData();

  @JsProperty(
      name = "initDataType"
  )
  @Nonnull
  public native String initDataType();
}
