package elemental3.gl;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        WebGL2RenderingContext.UNSIGNED_BYTE,
        WebGL2RenderingContext.UNSIGNED_SHORT,
        WebGL2RenderingContext.UNSIGNED_INT
    }
)
public @interface DrawElementDataType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return WebGL2RenderingContext.UNSIGNED_BYTE == value || WebGL2RenderingContext.UNSIGNED_SHORT == value || WebGL2RenderingContext.UNSIGNED_INT == value;
    }
  }
}
