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
public interface ValidityStateFlags {
  @JsOverlay
  @Nonnull
  static ValidityStateFlags create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isBadInput();

  @JsProperty
  void setBadInput(boolean badInput);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags badInput(final boolean badInput) {
    setBadInput( badInput );
    return this;
  }

  @JsProperty
  boolean isCustomError();

  @JsProperty
  void setCustomError(boolean customError);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags customError(final boolean customError) {
    setCustomError( customError );
    return this;
  }

  @JsProperty
  boolean isPatternMismatch();

  @JsProperty
  void setPatternMismatch(boolean patternMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags patternMismatch(final boolean patternMismatch) {
    setPatternMismatch( patternMismatch );
    return this;
  }

  @JsProperty
  boolean isRangeOverflow();

  @JsProperty
  void setRangeOverflow(boolean rangeOverflow);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags rangeOverflow(final boolean rangeOverflow) {
    setRangeOverflow( rangeOverflow );
    return this;
  }

  @JsProperty
  boolean isRangeUnderflow();

  @JsProperty
  void setRangeUnderflow(boolean rangeUnderflow);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags rangeUnderflow(final boolean rangeUnderflow) {
    setRangeUnderflow( rangeUnderflow );
    return this;
  }

  @JsProperty
  boolean isStepMismatch();

  @JsProperty
  void setStepMismatch(boolean stepMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags stepMismatch(final boolean stepMismatch) {
    setStepMismatch( stepMismatch );
    return this;
  }

  @JsProperty
  boolean isTooLong();

  @JsProperty
  void setTooLong(boolean tooLong);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags tooLong(final boolean tooLong) {
    setTooLong( tooLong );
    return this;
  }

  @JsProperty
  boolean isTooShort();

  @JsProperty
  void setTooShort(boolean tooShort);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags tooShort(final boolean tooShort) {
    setTooShort( tooShort );
    return this;
  }

  @JsProperty
  boolean isTypeMismatch();

  @JsProperty
  void setTypeMismatch(boolean typeMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags typeMismatch(final boolean typeMismatch) {
    setTypeMismatch( typeMismatch );
    return this;
  }

  @JsProperty
  boolean isValueMissing();

  @JsProperty
  void setValueMissing(boolean valueMissing);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags valueMissing(final boolean valueMissing) {
    setValueMissing( valueMissing );
    return this;
  }
}
