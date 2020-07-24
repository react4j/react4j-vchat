package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BeforeUnloadEvent"
)
public class BeforeUnloadEvent extends Event {
  @Nonnull
  public String returnValue;

  BeforeUnloadEvent() {
    super( null );
  }
}
