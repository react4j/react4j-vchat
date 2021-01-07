package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaDeviceKind.class
)
public @interface MediaDeviceKind {
  @Nonnull
  String audioinput = "audioinput";

  @Nonnull
  String audiooutput = "audiooutput";

  @Nonnull
  String videoinput = "videoinput";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaDeviceKind.audioinput.equals( value ) || MediaDeviceKind.audiooutput.equals( value ) || MediaDeviceKind.videoinput.equals( value );
    }
  }
}
