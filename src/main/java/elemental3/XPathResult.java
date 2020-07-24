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
    name = "XPathResult"
)
public class XPathResult {
  @JsOverlay
  public static final int ANY_TYPE = 0;

  @JsOverlay
  public static final int ANY_UNORDERED_NODE_TYPE = 8;

  @JsOverlay
  public static final int BOOLEAN_TYPE = 3;

  @JsOverlay
  public static final int FIRST_ORDERED_NODE_TYPE = 9;

  @JsOverlay
  public static final int NUMBER_TYPE = 1;

  @JsOverlay
  public static final int ORDERED_NODE_ITERATOR_TYPE = 5;

  @JsOverlay
  public static final int ORDERED_NODE_SNAPSHOT_TYPE = 7;

  @JsOverlay
  public static final int STRING_TYPE = 2;

  @JsOverlay
  public static final int UNORDERED_NODE_ITERATOR_TYPE = 4;

  @JsOverlay
  public static final int UNORDERED_NODE_SNAPSHOT_TYPE = 6;

  XPathResult() {
  }

  @JsProperty(
      name = "booleanValue"
  )
  public native boolean booleanValue();

  @JsProperty(
      name = "invalidIteratorState"
  )
  public native boolean invalidIteratorState();

  @JsProperty(
      name = "numberValue"
  )
  public native double numberValue();

  @JsProperty(
      name = "resultType"
  )
  public native int resultType();

  @JsProperty(
      name = "singleNodeValue"
  )
  @Nullable
  public native Node singleNodeValue();

  @JsProperty(
      name = "snapshotLength"
  )
  public native int snapshotLength();

  @JsProperty(
      name = "stringValue"
  )
  @Nonnull
  public native String stringValue();

  @Nullable
  public native Node iterateNext();

  @Nullable
  public native Node snapshotItem(int index);
}
