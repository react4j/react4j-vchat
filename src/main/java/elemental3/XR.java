package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The WebXR Device API interface XRSystem provides methods which let you get access to an XRSession object representing a WebXR session. With that XRSession in hand, you can use it to interact with the Augmented Reality (AR) or Virtual Reality (VR) device.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XR">XR - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XR"
)
public class XR extends EventTarget {
  /**
   * The ondevicechange property of the XRSystem interface is passed a devicechange event whenever availability of an immersive device changes. The event that is fired is a "simple event" that implements the Event interface.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XR/ondevicechange">XR.ondevicechange - MDN</a>
   */
  @Nullable
  public EventHandler ondevicechange;

  XR() {
  }

  /**
   * The XRSystem method isSessionSupported() returns a promise which resolves to true if the specified WebXR session mode is supported by the user's WebXR device. Otherwise, the promise resolves with false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XR/isSessionSupported">XR.isSessionSupported - MDN</a>
   */
  @Nonnull
  public native Promise<Boolean> isSessionSupported(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode);

  /**
   * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XR/requestSession">XR.requestSession - MDN</a>
   */
  @Nonnull
  public native Promise<XRSession> requestSession(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode,
      @Nonnull XRSessionInit options);

  /**
   * The XRSystem interface's requestSession() method returns a promise which resolves to an XRSession object through which you can manage the requested type of WebXR session.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XR/requestSession">XR.requestSession - MDN</a>
   */
  @Nonnull
  public native Promise<XRSession> requestSession(
      @MagicConstant(stringValues = {"immersive-vr", "inline"}) @Nonnull String mode);
}
