package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface TouchInit {
  @JsOverlay
  @Nonnull
  static TouchInit create(final int identifier, @Nonnull final EventTarget target) {
    return Js.<TouchInit>uncheckedCast( JsPropertyMap.of() ).identifier( identifier ).target( target );
  }

  @JsProperty
  double getAltitudeAngle();

  @JsProperty
  void setAltitudeAngle(double altitudeAngle);

  @JsOverlay
  @Nonnull
  default TouchInit altitudeAngle(final double altitudeAngle) {
    setAltitudeAngle( altitudeAngle );
    return this;
  }

  @JsProperty
  double getAzimuthAngle();

  @JsProperty
  void setAzimuthAngle(double azimuthAngle);

  @JsOverlay
  @Nonnull
  default TouchInit azimuthAngle(final double azimuthAngle) {
    setAzimuthAngle( azimuthAngle );
    return this;
  }

  @JsProperty
  double getClientX();

  @JsProperty
  void setClientX(double clientX);

  @JsOverlay
  @Nonnull
  default TouchInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsProperty
  double getClientY();

  @JsProperty
  void setClientY(double clientY);

  @JsOverlay
  @Nonnull
  default TouchInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsProperty
  float getForce();

  @JsProperty
  void setForce(float force);

  @JsOverlay
  @Nonnull
  default TouchInit force(final float force) {
    setForce( force );
    return this;
  }

  @JsProperty
  int getIdentifier();

  @JsProperty
  void setIdentifier(int identifier);

  @JsOverlay
  @Nonnull
  default TouchInit identifier(final int identifier) {
    setIdentifier( identifier );
    return this;
  }

  @JsProperty
  double getPageX();

  @JsProperty
  void setPageX(double pageX);

  @JsOverlay
  @Nonnull
  default TouchInit pageX(final double pageX) {
    setPageX( pageX );
    return this;
  }

  @JsProperty
  double getPageY();

  @JsProperty
  void setPageY(double pageY);

  @JsOverlay
  @Nonnull
  default TouchInit pageY(final double pageY) {
    setPageY( pageY );
    return this;
  }

  @JsProperty
  float getRadiusX();

  @JsProperty
  void setRadiusX(float radiusX);

  @JsOverlay
  @Nonnull
  default TouchInit radiusX(final float radiusX) {
    setRadiusX( radiusX );
    return this;
  }

  @JsProperty
  float getRadiusY();

  @JsProperty
  void setRadiusY(float radiusY);

  @JsOverlay
  @Nonnull
  default TouchInit radiusY(final float radiusY) {
    setRadiusY( radiusY );
    return this;
  }

  @JsProperty
  float getRotationAngle();

  @JsProperty
  void setRotationAngle(float rotationAngle);

  @JsOverlay
  @Nonnull
  default TouchInit rotationAngle(final float rotationAngle) {
    setRotationAngle( rotationAngle );
    return this;
  }

  @JsProperty
  double getScreenX();

  @JsProperty
  void setScreenX(double screenX);

  @JsOverlay
  @Nonnull
  default TouchInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsProperty
  double getScreenY();

  @JsProperty
  void setScreenY(double screenY);

  @JsOverlay
  @Nonnull
  default TouchInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsProperty
  @Nonnull
  EventTarget getTarget();

  @JsProperty
  void setTarget(@Nonnull EventTarget target);

  @JsOverlay
  @Nonnull
  default TouchInit target(@Nonnull final EventTarget target) {
    setTarget( target );
    return this;
  }

  @JsProperty
  String getTouchType();

  @JsProperty
  void setTouchType(@Nonnull String touchType);

  @JsOverlay
  @Nonnull
  default TouchInit touchType(@Nonnull final String touchType) {
    setTouchType( touchType );
    return this;
  }
}
