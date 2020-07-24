package elemental3;

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
    name = "SubmitEvent"
)
public class SubmitEvent extends Event {
  public SubmitEvent(@Nonnull final String type, @Nonnull final SubmitEventInit eventInitDict) {
    super( null );
  }

  public SubmitEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "submitter"
  )
  @Nullable
  public native HTMLElement submitter();
}
