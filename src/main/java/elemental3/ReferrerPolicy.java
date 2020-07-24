package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

@Generated("org.realityforge.webtack")
public final class ReferrerPolicy {
  @Nonnull
  public static final String no_referrer = "no-referrer";

  @Nonnull
  public static final String no_referrer_when_downgrade = "no-referrer-when-downgrade";

  @Nonnull
  public static final String origin = "origin";

  @Nonnull
  public static final String origin_when_cross_origin = "origin-when-cross-origin";

  @Nonnull
  public static final String same_origin = "same-origin";

  @Nonnull
  public static final String strict_origin = "strict-origin";

  @Nonnull
  public static final String strict_origin_when_cross_origin = "strict-origin-when-cross-origin";

  @Nonnull
  public static final String unsafe_url = "unsafe-url";

  private ReferrerPolicy() {
  }
}
