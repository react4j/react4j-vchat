package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface TableDescriptor {
  @JsOverlay
  @Nonnull
  static TableDescriptor create(@Nonnull final String element, final int initial) {
    return Js.<TableDescriptor>uncheckedCast( JsPropertyMap.of() ).element( element ).initial( initial );
  }

  @JsProperty
  @Nonnull
  String getElement();

  @JsProperty
  void setElement(@Nonnull String element);

  @JsOverlay
  @Nonnull
  default TableDescriptor element(@Nonnull final String element) {
    setElement( element );
    return this;
  }

  @JsProperty
  int getInitial();

  @JsProperty
  void setInitial(int initial);

  @JsOverlay
  @Nonnull
  default TableDescriptor initial(final int initial) {
    setInitial( initial );
    return this;
  }

  @JsProperty
  int getMaximum();

  @JsProperty
  void setMaximum(int maximum);

  @JsOverlay
  @Nonnull
  default TableDescriptor maximum(final int maximum) {
    setMaximum( maximum );
    return this;
  }
}
