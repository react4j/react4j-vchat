package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IterationCompositeOperation.class
)
public @interface IterationCompositeOperation {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String replace = "replace";
}
