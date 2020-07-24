package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Range"
)
public class Range extends AbstractRange {
  @JsOverlay
  public static final int END_TO_END = 2;

  @JsOverlay
  public static final int END_TO_START = 3;

  @JsOverlay
  public static final int START_TO_END = 1;

  @JsOverlay
  public static final int START_TO_START = 0;

  public Range() {
  }

  @JsProperty(
      name = "commonAncestorContainer"
  )
  @Nonnull
  public native Node commonAncestorContainer();

  @Nonnull
  public native DocumentFragment cloneContents();

  @Nonnull
  public native Range cloneRange();

  public native void collapse(boolean toStart);

  public native void collapse();

  public native short compareBoundaryPoints(int how, @Nonnull Range sourceRange);

  public native short comparePoint(@Nonnull Node node, int offset);

  public native void deleteContents();

  public native void detach();

  @Nonnull
  public native DocumentFragment extractContents();

  public native void insertNode(@Nonnull Node node);

  public native boolean intersectsNode(@Nonnull Node node);

  public native boolean isPointInRange(@Nonnull Node node, int offset);

  public native void selectNode(@Nonnull Node node);

  public native void selectNodeContents(@Nonnull Node node);

  public native void setEnd(@Nonnull Node node, int offset);

  public native void setEndAfter(@Nonnull Node node);

  public native void setEndBefore(@Nonnull Node node);

  public native void setStart(@Nonnull Node node, int offset);

  public native void setStartAfter(@Nonnull Node node);

  public native void setStartBefore(@Nonnull Node node);

  public native void surroundContents(@Nonnull Node newParent);

  @Nonnull
  public native DOMRect getBoundingClientRect();

  @Nonnull
  public native DOMRectList getClientRects();

  @Nonnull
  public native DocumentFragment createContextualFragment(@Nonnull String fragment);
}
