package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBOpenDBRequest"
)
public class IDBOpenDBRequest extends IDBRequest {
  @Nullable
  public EventHandler onblocked;

  @Nullable
  public EventHandler onupgradeneeded;

  IDBOpenDBRequest() {
  }
}
