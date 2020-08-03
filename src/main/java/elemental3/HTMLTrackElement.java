package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTrackElement"
)
public class HTMLTrackElement extends HTMLElement {
  @JsOverlay
  public static final int ERROR = 3;

  @JsOverlay
  public static final int LOADED = 2;

  @JsOverlay
  public static final int LOADING = 1;

  @JsOverlay
  public static final int NONE = 0;

  @JsProperty(
      name = "default"
  )
  public boolean default_;

  @Nonnull
  public String kind;

  @Nonnull
  public String label;

  @Nonnull
  public String src;

  @Nonnull
  public String srclang;

  public HTMLTrackElement() {
  }

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native TextTrack track();
}
