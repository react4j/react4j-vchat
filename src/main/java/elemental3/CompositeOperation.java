package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CompositeOperation.class
)
public @interface CompositeOperation {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String add = "add";

  @Nonnull
  String replace = "replace";
}
