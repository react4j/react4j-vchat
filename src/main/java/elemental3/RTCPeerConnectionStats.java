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
public interface RTCPeerConnectionStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCPeerConnectionStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type) {
    return Js.<RTCPeerConnectionStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type );
  }

  @JsProperty(
      name = "dataChannelsAccepted"
  )
  int dataChannelsAccepted();

  @JsProperty
  void setDataChannelsAccepted(int dataChannelsAccepted);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionStats dataChannelsAccepted(final int dataChannelsAccepted) {
    setDataChannelsAccepted( dataChannelsAccepted );
    return this;
  }

  @JsProperty(
      name = "dataChannelsClosed"
  )
  int dataChannelsClosed();

  @JsProperty
  void setDataChannelsClosed(int dataChannelsClosed);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionStats dataChannelsClosed(final int dataChannelsClosed) {
    setDataChannelsClosed( dataChannelsClosed );
    return this;
  }

  @JsProperty(
      name = "dataChannelsOpened"
  )
  int dataChannelsOpened();

  @JsProperty
  void setDataChannelsOpened(int dataChannelsOpened);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionStats dataChannelsOpened(final int dataChannelsOpened) {
    setDataChannelsOpened( dataChannelsOpened );
    return this;
  }

  @JsProperty(
      name = "dataChannelsRequested"
  )
  int dataChannelsRequested();

  @JsProperty
  void setDataChannelsRequested(int dataChannelsRequested);

  @JsOverlay
  @Nonnull
  default RTCPeerConnectionStats dataChannelsRequested(final int dataChannelsRequested) {
    setDataChannelsRequested( dataChannelsRequested );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCPeerConnectionStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
