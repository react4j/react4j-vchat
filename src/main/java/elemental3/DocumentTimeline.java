package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DocumentTimeline interface of the the Web Animations API represents animation timelines, including the default document timeline (accessed via Document.timeline).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentTimeline">DocumentTimeline - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DocumentTimeline"
)
public class DocumentTimeline extends AnimationTimeline {
  public DocumentTimeline(@Nonnull final DocumentTimelineOptions options) {
  }

  public DocumentTimeline() {
  }
}
