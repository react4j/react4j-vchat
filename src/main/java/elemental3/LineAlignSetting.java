package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = LineAlignSetting.class
)
public @interface LineAlignSetting {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String start = "start";
}
