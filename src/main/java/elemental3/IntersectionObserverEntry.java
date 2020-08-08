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
    name = "IntersectionObserverEntry"
)
public class IntersectionObserverEntry {
  public IntersectionObserverEntry(
      @Nonnull final IntersectionObserverEntryInit intersectionObserverEntryInit) {
  }

  @JsProperty(
      name = "boundingClientRect"
  )
  @Nonnull
  public native DOMRectReadOnly boundingClientRect();

  @JsProperty(
      name = "intersectionRatio"
  )
  public native double intersectionRatio();

  @JsProperty(
      name = "intersectionRect"
  )
  @Nonnull
  public native DOMRectReadOnly intersectionRect();

  @JsProperty(
      name = "isIntersecting"
  )
  public native boolean isIntersecting();

  @JsProperty(
      name = "rootBounds"
  )
  @Nullable
  public native DOMRectReadOnly rootBounds();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native Element target();

  @JsProperty(
      name = "time"
  )
  public native double time();
}
