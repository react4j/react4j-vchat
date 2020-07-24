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
    name = "AbstractRange"
)
public class AbstractRange {
  AbstractRange() {
  }

  @JsProperty(
      name = "collapsed"
  )
  public native boolean collapsed();

  @JsProperty(
      name = "endContainer"
  )
  @Nonnull
  public native Node endContainer();

  @JsProperty(
      name = "endOffset"
  )
  public native int endOffset();

  @JsProperty(
      name = "startContainer"
  )
  @Nonnull
  public native Node startContainer();

  @JsProperty(
      name = "startOffset"
  )
  public native int startOffset();
}
