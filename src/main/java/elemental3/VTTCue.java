package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This interface also inherits properties from TextTrackCue.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue">VTTCue - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTCue"
)
public class VTTCue extends TextTrackCue {
  @Nonnull
  public String align;

  @Nonnull
  public LineAndPositionSetting line;

  @Nonnull
  public String lineAlign;

  @Nonnull
  public LineAndPositionSetting position;

  @Nonnull
  public String positionAlign;

  @Nullable
  public VTTRegion region;

  public double size;

  public boolean snapToLines;

  @Nonnull
  public String text;

  @Nonnull
  public String vertical;

  /**
   * The VTTCue() constructor creates and returns a new VTTCue object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue/VTTCue">VTTCue.VTTCue - MDN</a>
   */
  public VTTCue(final double startTime, final double endTime, @Nonnull final String text) {
  }

  @Nonnull
  public native DocumentFragment getCueAsHTML();
}