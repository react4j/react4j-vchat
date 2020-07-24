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
    name = "DocumentType"
)
public class DocumentType extends Node {
  DocumentType() {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "publicId"
  )
  @Nonnull
  public native String publicId();

  @JsProperty(
      name = "systemId"
  )
  @Nonnull
  public native String systemId();

  public native void after(@Nonnull Node... nodes);

  public native void after(@Nonnull String... nodes);

  public native void before(@Nonnull Node... nodes);

  public native void before(@Nonnull String... nodes);

  public native void remove();

  public native void replaceWith(@Nonnull Node... nodes);

  public native void replaceWith(@Nonnull String... nodes);
}
