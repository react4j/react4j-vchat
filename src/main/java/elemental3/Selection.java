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
    name = "Selection"
)
public class Selection {
  Selection() {
  }

  @JsProperty(
      name = "anchorNode"
  )
  @Nullable
  public native Node anchorNode();

  @JsProperty(
      name = "anchorOffset"
  )
  public native int anchorOffset();

  @JsProperty(
      name = "focusNode"
  )
  @Nullable
  public native Node focusNode();

  @JsProperty(
      name = "focusOffset"
  )
  public native int focusOffset();

  @JsProperty(
      name = "isCollapsed"
  )
  public native boolean isCollapsed();

  @JsProperty(
      name = "rangeCount"
  )
  public native int rangeCount();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  public native void addRange(@Nonnull Range range);

  public native void collapse(@Nullable Node node, int offset);

  public native void collapse(@Nullable Node node);

  public native void collapseToEnd();

  public native void collapseToStart();

  public native boolean containsNode(@Nonnull Node node, boolean allowPartialContainment);

  public native boolean containsNode(@Nonnull Node node);

  public native void deleteFromDocument();

  public native void empty();

  public native void extend(@Nonnull Node node, int offset);

  public native void extend(@Nonnull Node node);

  @Nonnull
  public native Range getRangeAt(int index);

  public native void removeAllRanges();

  public native void removeRange(@Nonnull Range range);

  public native void selectAllChildren(@Nonnull Node node);

  public native void setBaseAndExtent(@Nonnull Node anchorNode, int anchorOffset,
      @Nonnull Node focusNode, int focusOffset);

  public native void setPosition(@Nullable Node node, int offset);

  public native void setPosition(@Nullable Node node);
}
