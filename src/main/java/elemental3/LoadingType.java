package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to indicate how the browser should load the resource.
 */
@Generated("org.realityforge.webtack")
public final class LoadingType {
  /**
   * Load the resource immediately, regardless of whether or not the resource is currently within
   * the visible viewport (this is the default value).
   */
  @Nonnull
  public static final String eager = "eager";

  /**
   * Defer loading of the resource until it reaches a calculated distance from the viewport, as defined
   * by the browser. The intent is to avoid the network and storage bandwidth needed to handle the image
   * until it's reasonably certain that it will be needed. This generally improves the performance of the
   * content in most typical use cases.
   */
  @Nonnull
  public static final String lazy = "lazy";

  private LoadingType() {
  }
}