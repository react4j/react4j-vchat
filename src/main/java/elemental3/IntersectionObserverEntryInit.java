package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface IntersectionObserverEntryInit {
  @JsOverlay
  @Nonnull
  static IntersectionObserverEntryInit create(@Nonnull final DOMRectInit boundingClientRect,
      final double intersectionRatio, @Nonnull final DOMRectInit intersectionRect,
      final boolean isIntersecting, @Nullable final DOMRectInit rootBounds,
      @Nonnull final Element target, final double time) {
    return Js.<IntersectionObserverEntryInit>uncheckedCast( JsPropertyMap.of() ).boundingClientRect( boundingClientRect ).intersectionRatio( intersectionRatio ).intersectionRect( intersectionRect ).isIntersecting( isIntersecting ).rootBounds( rootBounds ).target( target ).time( time );
  }

  @JsProperty
  @Nonnull
  DOMRectInit getBoundingClientRect();

  @JsProperty
  void setBoundingClientRect(@Nonnull DOMRectInit boundingClientRect);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit boundingClientRect(
      @Nonnull final DOMRectInit boundingClientRect) {
    setBoundingClientRect( boundingClientRect );
    return this;
  }

  @JsProperty
  double getIntersectionRatio();

  @JsProperty
  void setIntersectionRatio(double intersectionRatio);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit intersectionRatio(final double intersectionRatio) {
    setIntersectionRatio( intersectionRatio );
    return this;
  }

  @JsProperty
  @Nonnull
  DOMRectInit getIntersectionRect();

  @JsProperty
  void setIntersectionRect(@Nonnull DOMRectInit intersectionRect);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit intersectionRect(
      @Nonnull final DOMRectInit intersectionRect) {
    setIntersectionRect( intersectionRect );
    return this;
  }

  @JsProperty
  boolean isIsIntersecting();

  @JsProperty
  void setIsIntersecting(boolean isIntersecting);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit isIntersecting(final boolean isIntersecting) {
    setIsIntersecting( isIntersecting );
    return this;
  }

  @JsProperty
  @Nullable
  DOMRectInit getRootBounds();

  @JsProperty
  void setRootBounds(@Nullable DOMRectInit rootBounds);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit rootBounds(@Nullable final DOMRectInit rootBounds) {
    setRootBounds( rootBounds );
    return this;
  }

  @JsProperty
  @Nonnull
  Element getTarget();

  @JsProperty
  void setTarget(@Nonnull Element target);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit target(@Nonnull final Element target) {
    setTarget( target );
    return this;
  }

  @JsProperty
  double getTime();

  @JsProperty
  void setTime(double time);

  @JsOverlay
  @Nonnull
  default IntersectionObserverEntryInit time(final double time) {
    setTime( time );
    return this;
  }
}
