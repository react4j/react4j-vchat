package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to define the cells that the header element relates to.
 */
@Generated("org.realityforge.webtack")
public final class ScopeType {
  /**
   * The header relates to all cells of the row it belongs to.
   */
  @Nonnull
  public static final String row = "row";

  /**
   * The header relates to all cells of the column it belongs to.
   */
  @Nonnull
  public static final String col = "col";

  /**
   * The header belongs to a rowgroup and relates to all of its cells. These cells can be
   * placed to the right or the left of the header, depending on the value of the <code>dir</code>
   * attribute in the <code>&lt;table&gt;</code> element.
   */
  @Nonnull
  public static final String rowgroup = "rowgroup";

  /**
   * The header belongs to a colgroup and relates to all of its cells.
   */
  @Nonnull
  public static final String colgroup = "colgroup";

  /**
   * The default value.
   */
  @Nonnull
  public static final String auto = "auto";

  private ScopeType() {
  }
}