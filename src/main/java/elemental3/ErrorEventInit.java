package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ErrorEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  int getColno();

  @JsProperty
  void setColno(int colno);

  @JsOverlay
  @Nonnull
  default ErrorEventInit colno(final int colno) {
    setColno( colno );
    return this;
  }

  @JsProperty
  @Nullable
  Any getError();

  @JsProperty
  void setError(@Nullable Any error);

  @JsOverlay
  @Nonnull
  default ErrorEventInit error(@Nullable final Any error) {
    setError( error );
    return this;
  }

  @JsProperty
  String getFilename();

  @JsProperty
  void setFilename(@Nonnull String filename);

  @JsOverlay
  @Nonnull
  default ErrorEventInit filename(@Nonnull final String filename) {
    setFilename( filename );
    return this;
  }

  @JsProperty
  int getLineno();

  @JsProperty
  void setLineno(int lineno);

  @JsOverlay
  @Nonnull
  default ErrorEventInit lineno(final int lineno) {
    setLineno( lineno );
    return this;
  }

  @JsProperty
  String getMessage();

  @JsProperty
  void setMessage(@Nonnull String message);

  @JsOverlay
  @Nonnull
  default ErrorEventInit message(@Nonnull final String message) {
    setMessage( message );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ErrorEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ErrorEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ErrorEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
