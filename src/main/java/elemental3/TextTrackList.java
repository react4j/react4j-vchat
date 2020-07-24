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
    name = "TextTrackList"
)
public class TextTrackList extends EventTarget {
  @Nullable
  public EventHandler onaddtrack;

  @Nullable
  public EventHandler onchange;

  @Nullable
  public EventHandler onremovetrack;

  TextTrackList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native TextTrack getTrackById(@Nonnull String id);
}
