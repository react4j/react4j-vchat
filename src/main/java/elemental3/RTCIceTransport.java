package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCIceTransport"
)
public class RTCIceTransport extends EventTarget {
  @Nullable
  public EventHandler ongatheringstatechange;

  @Nullable
  public EventHandler onselectedcandidatepairchange;

  @Nullable
  public EventHandler onstatechange;

  RTCIceTransport() {
  }

  @JsProperty(
      name = "component"
  )
  @Nonnull
  public native String component();

  @JsProperty(
      name = "gatheringState"
  )
  @Nonnull
  public native String gatheringState();

  @JsProperty(
      name = "role"
  )
  @Nonnull
  public native String role();

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  @Nonnull
  public native JsArray<RTCIceCandidate> getLocalCandidates();

  @Nullable
  public native RTCIceParameters getLocalParameters();

  @Nonnull
  public native JsArray<RTCIceCandidate> getRemoteCandidates();

  @Nullable
  public native RTCIceParameters getRemoteParameters();

  @Nullable
  public native RTCIceCandidatePair getSelectedCandidatePair();
}
