package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to indicate how the text track is meant to be used.
 */
@Generated("org.realityforge.webtack")
public final class TrackKind {
  /**
   * Subtitles provide translation of content that cannot be understood by the viewer. For example
   * dialogue or text that is not English in an English language film. Subtitles may contain additional
   * content, usually extra background information. For example the text at the beginning of the Star Wars
   * films, or the date, time, and location of a scene.
   */
  @Nonnull
  public static final String subtitles = "subtitles";

  /**
   * Closed captions provide a transcription and possibly a translation of audio.
   * It may include important non-verbal information such as music cues or sound effects. It may indicate the cue's source (e.g. music, text, character).
   * Suitable for users who are deaf or when the sound is muted.
   */
  @Nonnull
  public static final String captions = "captions";

  /**
   * Textual description of the video content.
   * Suitable for users who are blind or where the video cannot be seen.
   */
  @Nonnull
  public static final String descriptions = "descriptions";

  /**
   * Chapter titles are intended to be used when the user is navigating the media resource.
   */
  @Nonnull
  public static final String chapters = "chapters";

  /**
   * Tracks used by scripts. Not visible to the user.
   */
  @Nonnull
  public static final String metadata = "metadata";

  private TrackKind() {
  }
}