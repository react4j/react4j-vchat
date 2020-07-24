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
    name = "ShadowRoot"
)
public class ShadowRoot extends DocumentFragment {
  @Nullable
  public EventHandler onslotchange;

  @Nonnull
  public String innerHTML;

  ShadowRoot() {
  }

  @JsProperty(
      name = "host"
  )
  @Nonnull
  public native Element host();

  @JsProperty(
      name = "mode"
  )
  @Nonnull
  public native String mode();

  @JsProperty(
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();

  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();
}
