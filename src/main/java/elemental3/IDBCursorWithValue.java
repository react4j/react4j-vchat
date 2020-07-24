package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBCursorWithValue"
)
public class IDBCursorWithValue extends IDBCursor {
  IDBCursorWithValue() {
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  public native Any value();
}
