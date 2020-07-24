package elemental3;

import elemental2.core.ArrayBuffer;
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
public interface txAuthGenericArg {
  @JsOverlay
  @Nonnull
  static txAuthGenericArg create(@Nonnull final ArrayBuffer content,
      @Nonnull final String contentType) {
    return Js.<txAuthGenericArg>uncheckedCast( JsPropertyMap.of() ).content( content ).contentType( contentType );
  }

  @JsProperty
  @Nonnull
  ArrayBuffer getContent();

  @JsProperty
  void setContent(@Nonnull ArrayBuffer content);

  @JsOverlay
  @Nonnull
  default txAuthGenericArg content(@Nonnull final ArrayBuffer content) {
    setContent( content );
    return this;
  }

  @JsProperty
  @Nonnull
  String getContentType();

  @JsProperty
  void setContentType(@Nonnull String contentType);

  @JsOverlay
  @Nonnull
  default txAuthGenericArg contentType(@Nonnull final String contentType) {
    setContentType( contentType );
    return this;
  }
}
