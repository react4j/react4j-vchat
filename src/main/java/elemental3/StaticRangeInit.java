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
public interface StaticRangeInit {
  @JsOverlay
  @Nonnull
  static StaticRangeInit create(@Nonnull final Node endContainer, final int endOffset,
      @Nonnull final Node startContainer, final int startOffset) {
    return Js.<StaticRangeInit>uncheckedCast( JsPropertyMap.of() ).endContainer( endContainer ).endOffset( endOffset ).startContainer( startContainer ).startOffset( startOffset );
  }

  @JsProperty
  @Nonnull
  Node getEndContainer();

  @JsProperty
  void setEndContainer(@Nonnull Node endContainer);

  @JsOverlay
  @Nonnull
  default StaticRangeInit endContainer(@Nonnull final Node endContainer) {
    setEndContainer( endContainer );
    return this;
  }

  @JsProperty
  int getEndOffset();

  @JsProperty
  void setEndOffset(int endOffset);

  @JsOverlay
  @Nonnull
  default StaticRangeInit endOffset(final int endOffset) {
    setEndOffset( endOffset );
    return this;
  }

  @JsProperty
  @Nonnull
  Node getStartContainer();

  @JsProperty
  void setStartContainer(@Nonnull Node startContainer);

  @JsOverlay
  @Nonnull
  default StaticRangeInit startContainer(@Nonnull final Node startContainer) {
    setStartContainer( startContainer );
    return this;
  }

  @JsProperty
  int getStartOffset();

  @JsProperty
  void setStartOffset(int startOffset);

  @JsOverlay
  @Nonnull
  default StaticRangeInit startOffset(final int startOffset) {
    setStartOffset( startOffset );
    return this;
  }
}
