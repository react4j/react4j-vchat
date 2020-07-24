package elemental3;

import elemental2.core.JsArray;
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
public interface NotificationOptions {
  @JsOverlay
  @Nonnull
  static NotificationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  JsArray<NotificationAction> getActions();

  @JsProperty
  void setActions(@Nonnull JsArray<NotificationAction> actions);

  @JsOverlay
  @Nonnull
  default NotificationOptions actions(@Nonnull final JsArray<NotificationAction> actions) {
    setActions( actions );
    return this;
  }

  @JsOverlay
  default void setActions(@Nonnull final NotificationAction... actions) {
    setActions( JsArray.asJsArray( actions ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions actions(@Nonnull final NotificationAction... actions) {
    setActions( actions );
    return this;
  }

  @JsProperty
  String getBadge();

  @JsProperty
  void setBadge(@Nonnull String badge);

  @JsOverlay
  @Nonnull
  default NotificationOptions badge(@Nonnull final String badge) {
    setBadge( badge );
    return this;
  }

  @JsProperty
  String getBody();

  @JsProperty
  void setBody(@Nonnull String body);

  @JsOverlay
  @Nonnull
  default NotificationOptions body(@Nonnull final String body) {
    setBody( body );
    return this;
  }

  @JsProperty
  @Nullable
  Any getData();

  @JsProperty
  void setData(@Nullable Any data);

  @JsOverlay
  @Nonnull
  default NotificationOptions data(@Nullable final Any data) {
    setData( data );
    return this;
  }

  @JsProperty
  String getDir();

  @JsProperty
  void setDir(@Nonnull String dir);

  @JsOverlay
  @Nonnull
  default NotificationOptions dir(@Nonnull final String dir) {
    setDir( dir );
    return this;
  }

  @JsProperty
  String getIcon();

  @JsProperty
  void setIcon(@Nonnull String icon);

  @JsOverlay
  @Nonnull
  default NotificationOptions icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsProperty
  String getImage();

  @JsProperty
  void setImage(@Nonnull String image);

  @JsOverlay
  @Nonnull
  default NotificationOptions image(@Nonnull final String image) {
    setImage( image );
    return this;
  }

  @JsProperty
  String getLang();

  @JsProperty
  void setLang(@Nonnull String lang);

  @JsOverlay
  @Nonnull
  default NotificationOptions lang(@Nonnull final String lang) {
    setLang( lang );
    return this;
  }

  @JsProperty
  boolean isRenotify();

  @JsProperty
  void setRenotify(boolean renotify);

  @JsOverlay
  @Nonnull
  default NotificationOptions renotify(final boolean renotify) {
    setRenotify( renotify );
    return this;
  }

  @JsProperty
  boolean isRequireInteraction();

  @JsProperty
  void setRequireInteraction(boolean requireInteraction);

  @JsOverlay
  @Nonnull
  default NotificationOptions requireInteraction(final boolean requireInteraction) {
    setRequireInteraction( requireInteraction );
    return this;
  }

  @JsProperty
  boolean isSilent();

  @JsProperty
  void setSilent(boolean silent);

  @JsOverlay
  @Nonnull
  default NotificationOptions silent(final boolean silent) {
    setSilent( silent );
    return this;
  }

  @JsProperty
  String getTag();

  @JsProperty
  void setTag(@Nonnull String tag);

  @JsOverlay
  @Nonnull
  default NotificationOptions tag(@Nonnull final String tag) {
    setTag( tag );
    return this;
  }

  @JsProperty
  int getTimestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsOverlay
  @Nonnull
  default NotificationOptions timestamp(final int timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsProperty
  VibratePattern getVibrate();

  @JsProperty
  void setVibrate(@Nonnull VibratePattern vibrate);

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final VibratePattern vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(final int vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(final int vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(@Nonnull final JsArray<Double> vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final JsArray<Double> vibrate) {
    setVibrate( vibrate );
    return this;
  }

  @JsOverlay
  default void setVibrate(@Nonnull final Double... vibrate) {
    setVibrate( VibratePattern.of( vibrate ) );
  }

  @JsOverlay
  @Nonnull
  default NotificationOptions vibrate(@Nonnull final Double... vibrate) {
    setVibrate( vibrate );
    return this;
  }
}
