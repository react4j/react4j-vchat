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
    name = "BlobEvent"
)
public class BlobEvent extends Event {
  BlobEvent() {
    super( null );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  public native Blob data();

  @JsProperty(
      name = "timecode"
  )
  public native double timecode();
}
