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
public interface SVGBoundingBoxOptions {
  @JsOverlay
  @Nonnull
  static SVGBoundingBoxOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isClipped();

  @JsProperty
  void setClipped(boolean clipped);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions clipped(final boolean clipped) {
    setClipped( clipped );
    return this;
  }

  @JsProperty
  boolean isFill();

  @JsProperty
  void setFill(boolean fill);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions fill(final boolean fill) {
    setFill( fill );
    return this;
  }

  @JsProperty
  boolean isMarkers();

  @JsProperty
  void setMarkers(boolean markers);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions markers(final boolean markers) {
    setMarkers( markers );
    return this;
  }

  @JsProperty
  boolean isStroke();

  @JsProperty
  void setStroke(boolean stroke);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions stroke(final boolean stroke) {
    setStroke( stroke );
    return this;
  }
}
