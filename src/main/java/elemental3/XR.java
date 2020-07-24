package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XR"
)
public class XR extends EventTarget {
  @Nullable
  public EventHandler ondevicechange;

  XR() {
  }

  @Nonnull
  public native Promise<Boolean> isSessionSupported(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode);

  @Nonnull
  public native Promise<XRSession> requestSession(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode,
      @Nonnull XRSessionInit options);

  @Nonnull
  public native Promise<XRSession> requestSession(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode);
}
