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
public interface NotificationAction {
  @JsOverlay
  @Nonnull
  static NotificationAction create(@Nonnull final String action, @Nonnull final String title) {
    return Js.<NotificationAction>uncheckedCast( JsPropertyMap.of() ).action( action ).title( title );
  }

  @JsProperty
  @Nonnull
  String getAction();

  @JsProperty
  void setAction(@Nonnull String action);

  @JsOverlay
  @Nonnull
  default NotificationAction action(@Nonnull final String action) {
    setAction( action );
    return this;
  }

  @JsProperty
  String getIcon();

  @JsProperty
  void setIcon(@Nonnull String icon);

  @JsOverlay
  @Nonnull
  default NotificationAction icon(@Nonnull final String icon) {
    setIcon( icon );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTitle();

  @JsProperty
  void setTitle(@Nonnull String title);

  @JsOverlay
  @Nonnull
  default NotificationAction title(@Nonnull final String title) {
    setTitle( title );
    return this;
  }
}
