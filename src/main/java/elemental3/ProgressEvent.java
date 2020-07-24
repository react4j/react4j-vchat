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
    name = "ProgressEvent"
)
public class ProgressEvent extends Event {
  public ProgressEvent(@Nonnull final String type, @Nonnull final ProgressEventInit eventInitDict) {
    super( null );
  }

  public ProgressEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "lengthComputable"
  )
  public native boolean lengthComputable();

  @JsProperty(
      name = "loaded"
  )
  public native int loaded();

  @JsProperty(
      name = "total"
  )
  public native int total();
}
