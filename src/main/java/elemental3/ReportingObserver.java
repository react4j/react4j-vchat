package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The ReportingObserver interface of the Reporting API allows you to collect and access reports.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserver">ReportingObserver - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ReportingObserver"
)
public class ReportingObserver {
  public ReportingObserver(@Nonnull final ReportingObserverCallback callback,
      @Nonnull final ReportingObserverOptions options) {
  }

  public ReportingObserver(@Nonnull final ReportingObserverCallback callback) {
  }

  /**
   * The disconnect() method of the ReportingObserver interface stops a reporting observer that had previously started observing from collecting reports.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserver/disconnect">ReportingObserver.disconnect - MDN</a>
   */
  public native void disconnect();

  /**
   * The observe() method of the ReportingObserver interface instructs a reporting observer to start collecting reports in its report queue.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserver/observe">ReportingObserver.observe - MDN</a>
   */
  public native void observe();

  /**
   * The takeRecords() method of the ReportingObserver interface returns the current list of reports contained in the observer's report queue, and empties the queue.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserver/takeRecords">ReportingObserver.takeRecords - MDN</a>
   */
  @Nonnull
  public native JsArray<Report> takeRecords();
}
