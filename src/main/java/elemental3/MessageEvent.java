package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MessageEvent"
)
public class MessageEvent extends Event {
  public MessageEvent(@Nonnull final String type, @Nonnull final MessageEventInit eventInitDict) {
    super( null );
  }

  public MessageEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  public native Any data();

  @JsProperty(
      name = "lastEventId"
  )
  @Nonnull
  public native String lastEventId();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  @JsProperty(
      name = "ports"
  )
  @Nonnull
  public native JsArray<MessagePort> ports();

  @JsProperty(
      name = "source"
  )
  @Nullable
  public native MessageEventSource source();

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessageEventSource source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source, @Nonnull JsArray<MessagePort> ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessageEventSource source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source, @Nonnull MessagePort[] ports);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessageEventSource source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull Window source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull MessagePort source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId,
      @Nonnull ServiceWorker source);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin, @Nonnull String lastEventId);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data, @Nonnull String origin);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable Any data);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles, boolean cancelable);

  public native void initMessageEvent(@Nonnull String type, boolean bubbles);

  public native void initMessageEvent(@Nonnull String type);
}
