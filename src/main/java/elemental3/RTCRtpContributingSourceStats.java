package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpContributingSourceStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCRtpContributingSourceStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, final int contributorSsrc,
      @Nonnull final String inboundRtpStreamId) {
    return Js.<RTCRtpContributingSourceStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).contributorSsrc( contributorSsrc ).inboundRtpStreamId( inboundRtpStreamId );
  }

  @JsProperty(
      name = "audioLevel"
  )
  double audioLevel();

  @JsProperty
  void setAudioLevel(double audioLevel);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats audioLevel(final double audioLevel) {
    setAudioLevel( audioLevel );
    return this;
  }

  @JsProperty(
      name = "contributorSsrc"
  )
  int contributorSsrc();

  @JsProperty
  void setContributorSsrc(int contributorSsrc);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats contributorSsrc(final int contributorSsrc) {
    setContributorSsrc( contributorSsrc );
    return this;
  }

  @JsProperty(
      name = "inboundRtpStreamId"
  )
  @Nonnull
  String inboundRtpStreamId();

  @JsProperty
  void setInboundRtpStreamId(@Nonnull String inboundRtpStreamId);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats inboundRtpStreamId(
      @Nonnull final String inboundRtpStreamId) {
    setInboundRtpStreamId( inboundRtpStreamId );
    return this;
  }

  @JsProperty(
      name = "packetsContributedTo"
  )
  int packetsContributedTo();

  @JsProperty
  void setPacketsContributedTo(int packetsContributedTo);

  @JsOverlay
  @Nonnull
  default RTCRtpContributingSourceStats packetsContributedTo(final int packetsContributedTo) {
    setPacketsContributedTo( packetsContributedTo );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpContributingSourceStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpContributingSourceStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpContributingSourceStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
