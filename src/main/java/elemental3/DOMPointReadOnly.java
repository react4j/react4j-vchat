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
    name = "DOMPointReadOnly"
)
public class DOMPointReadOnly {
  DOMPointReadOnly() {
  }

  @JsProperty(
      name = "w"
  )
  public native double w();

  @JsProperty(
      name = "x"
  )
  public native double x();

  @JsProperty(
      name = "y"
  )
  public native double y();

  @JsProperty(
      name = "z"
  )
  public native double z();

  @Nonnull
  public static native DOMPointReadOnly fromPoint(@Nonnull DOMPointInit other);

  @Nonnull
  public static native DOMPointReadOnly fromPoint();

  @Nonnull
  public native DOMPoint matrixTransform(@Nonnull DOMMatrixInit matrix);

  @Nonnull
  public native DOMPoint matrixTransform();

  @Nonnull
  public native Object toJSON();
}
