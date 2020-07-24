package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGSVGElement"
)
public class SVGSVGElement extends SVGGraphicsElement {
  @JsOverlay
  public static final int SVG_ZOOMANDPAN_DISABLE = 1;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_MAGNIFY = 2;

  @JsOverlay
  public static final int SVG_ZOOMANDPAN_UNKNOWN = 0;

  public float currentScale;

  public int zoomAndPan;

  @Nullable
  public EventHandler onafterprint;

  @Nullable
  public EventHandler onbeforeprint;

  @Nullable
  public OnBeforeUnloadEventHandler onbeforeunload;

  @Nullable
  public EventHandler onhashchange;

  @Nullable
  public EventHandler onlanguagechange;

  @Nullable
  public EventHandler onmessage;

  @Nullable
  public EventHandler onmessageerror;

  @Nullable
  public EventHandler onoffline;

  @Nullable
  public EventHandler ononline;

  @Nullable
  public EventHandler onpagehide;

  @Nullable
  public EventHandler onpageshow;

  @Nullable
  public EventHandler onpopstate;

  @Nullable
  public EventHandler onrejectionhandled;

  @Nullable
  public EventHandler onstorage;

  @Nullable
  public EventHandler onunhandledrejection;

  @Nullable
  public EventHandler onunload;

  SVGSVGElement() {
  }

  @JsProperty(
      name = "currentTranslate"
  )
  @Nonnull
  public native DOMPointReadOnly currentTranslate();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();

  public native boolean checkEnclosure(@Nonnull SVGElement element, @Nonnull DOMRectReadOnly rect);

  public native boolean checkIntersection(@Nonnull SVGElement element,
      @Nonnull DOMRectReadOnly rect);

  @Nonnull
  public native SVGAngle createSVGAngle();

  @Nonnull
  public native SVGLength createSVGLength();

  @Nonnull
  public native DOMMatrix createSVGMatrix();

  @Nonnull
  public native SVGNumber createSVGNumber();

  @Nonnull
  public native DOMPoint createSVGPoint();

  @Nonnull
  public native DOMRect createSVGRect();

  @Nonnull
  public native SVGTransform createSVGTransform();

  @Nonnull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  public native void deselectAll();

  public native void forceRedraw();

  @Nonnull
  public native Element getElementById(@Nonnull String elementId);

  @Nonnull
  public native NodeList getEnclosureList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  @Nonnull
  public native NodeList getIntersectionList(@Nonnull DOMRectReadOnly rect,
      @Nullable SVGElement referenceElement);

  public native int suspendRedraw(int maxWaitMilliseconds);

  public native void unsuspendRedraw(int suspendHandleID);

  public native void unsuspendRedrawAll();
}
