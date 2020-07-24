package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface FetchEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static FetchEventInit create(@Nonnull final Request request) {
    return Js.<FetchEventInit>uncheckedCast( JsPropertyMap.of() ).request( request );
  }

  @JsProperty
  String getClientId();

  @JsProperty
  void setClientId(@Nonnull String clientId);

  @JsOverlay
  @Nonnull
  default FetchEventInit clientId(@Nonnull final String clientId) {
    setClientId( clientId );
    return this;
  }

  @JsProperty
  Promise<Void> getHandled();

  @JsProperty
  void setHandled(@Nonnull Promise<Void> handled);

  @JsOverlay
  @Nonnull
  default FetchEventInit handled(@Nonnull final Promise<Void> handled) {
    setHandled( handled );
    return this;
  }

  @JsProperty
  Promise<Any> getPreloadResponse();

  @JsProperty
  void setPreloadResponse(@Nonnull Promise<Any> preloadResponse);

  @JsOverlay
  @Nonnull
  default FetchEventInit preloadResponse(@Nonnull final Promise<Any> preloadResponse) {
    setPreloadResponse( preloadResponse );
    return this;
  }

  @JsProperty
  String getReplacesClientId();

  @JsProperty
  void setReplacesClientId(@Nonnull String replacesClientId);

  @JsOverlay
  @Nonnull
  default FetchEventInit replacesClientId(@Nonnull final String replacesClientId) {
    setReplacesClientId( replacesClientId );
    return this;
  }

  @JsProperty
  @Nonnull
  Request getRequest();

  @JsProperty
  void setRequest(@Nonnull Request request);

  @JsOverlay
  @Nonnull
  default FetchEventInit request(@Nonnull final Request request) {
    setRequest( request );
    return this;
  }

  @JsProperty
  String getResultingClientId();

  @JsProperty
  void setResultingClientId(@Nonnull String resultingClientId);

  @JsOverlay
  @Nonnull
  default FetchEventInit resultingClientId(@Nonnull final String resultingClientId) {
    setResultingClientId( resultingClientId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FetchEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FetchEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FetchEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
