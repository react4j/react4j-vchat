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
    name = "IDBVersionChangeEvent"
)
public class IDBVersionChangeEvent extends Event {
  public IDBVersionChangeEvent(@Nonnull final String type,
      @Nonnull final IDBVersionChangeEventInit eventInitDict) {
    super( null );
  }

  public IDBVersionChangeEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "newVersion"
  )
  @Nullable
  public native Double newVersion();

  @JsProperty(
      name = "oldVersion"
  )
  public native int oldVersion();
}
