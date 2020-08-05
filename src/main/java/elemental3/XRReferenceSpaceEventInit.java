package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The XRReferenceSpaceEventInit dictionary is used when calling the XRReferenceSpaceEvent() constructor to provide the values for its properties. Since the properties are read-only, this is the only opportunity available to set their values.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceEventInit">XRReferenceSpaceEventInit - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface XRReferenceSpaceEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static XRReferenceSpaceEventInit create(@Nonnull final XRReferenceSpace referenceSpace) {
    return Js.<XRReferenceSpaceEventInit>uncheckedCast( JsPropertyMap.of() ).referenceSpace( referenceSpace );
  }

  @JsProperty(
      name = "referenceSpace"
  )
  @Nonnull
  XRReferenceSpace referenceSpace();

  @JsProperty
  void setReferenceSpace(@Nonnull XRReferenceSpace referenceSpace);

  @JsOverlay
  @Nonnull
  default XRReferenceSpaceEventInit referenceSpace(@Nonnull final XRReferenceSpace referenceSpace) {
    setReferenceSpace( referenceSpace );
    return this;
  }

  @JsProperty(
      name = "transform"
  )
  XRRigidTransform transform();

  @JsProperty
  void setTransform(@Nonnull XRRigidTransform transform);

  @JsOverlay
  @Nonnull
  default XRReferenceSpaceEventInit transform(@Nonnull final XRRigidTransform transform) {
    setTransform( transform );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default XRReferenceSpaceEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
