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
    name = "AudioListener"
)
public class AudioListener {
  AudioListener() {
  }

  @JsProperty(
      name = "forwardX"
  )
  @Nonnull
  public native AudioParam forwardX();

  @JsProperty(
      name = "forwardY"
  )
  @Nonnull
  public native AudioParam forwardY();

  @JsProperty(
      name = "forwardZ"
  )
  @Nonnull
  public native AudioParam forwardZ();

  @JsProperty(
      name = "positionX"
  )
  @Nonnull
  public native AudioParam positionX();

  @JsProperty(
      name = "positionY"
  )
  @Nonnull
  public native AudioParam positionY();

  @JsProperty(
      name = "positionZ"
  )
  @Nonnull
  public native AudioParam positionZ();

  @JsProperty(
      name = "upX"
  )
  @Nonnull
  public native AudioParam upX();

  @JsProperty(
      name = "upY"
  )
  @Nonnull
  public native AudioParam upY();

  @JsProperty(
      name = "upZ"
  )
  @Nonnull
  public native AudioParam upZ();

  public native void setOrientation(float x, float y, float z, float xUp, float yUp, float zUp);

  public native void setPosition(float x, float y, float z);
}
