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
    name = "Attr"
)
public class Attr extends Node {
  @Nonnull
  public String value;

  Attr() {
  }

  @JsProperty(
      name = "localName"
  )
  @Nonnull
  public native String localName();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "namespaceURI"
  )
  @Nullable
  public native String namespaceURI();

  @JsProperty(
      name = "ownerElement"
  )
  @Nullable
  public native Element ownerElement();

  @JsProperty(
      name = "prefix"
  )
  @Nullable
  public native String prefix();

  @JsProperty(
      name = "specified"
  )
  public native boolean specified();
}
