package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TokenBindingStatus.class
)
public @interface TokenBindingStatus {
  @Nonnull
  String present = "present";

  @Nonnull
  String supported = "supported";
}
