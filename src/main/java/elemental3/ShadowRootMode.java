package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ShadowRootMode.class
)
public @interface ShadowRootMode {
  @Nonnull
  String closed = "closed";

  @Nonnull
  String open = "open";
}
