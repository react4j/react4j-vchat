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
public interface RTCDataChannelStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCDataChannelStats create(@Nonnull final String id, final double timestamp,
      @Nonnull final String type, @Nonnull final String state, @Nonnull final String transportId) {
    return Js.<RTCDataChannelStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).state( state ).transportId( transportId );
  }

  @JsProperty
  int getBytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty
  int getBytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty
  int getDataChannelIdentifier();

  @JsProperty
  void setDataChannelIdentifier(int dataChannelIdentifier);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats dataChannelIdentifier(final int dataChannelIdentifier) {
    setDataChannelIdentifier( dataChannelIdentifier );
    return this;
  }

  @JsProperty
  String getLabel();

  @JsProperty
  void setLabel(@Nonnull String label);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats label(@Nonnull final String label) {
    setLabel( label );
    return this;
  }

  @JsProperty
  int getMessagesReceived();

  @JsProperty
  void setMessagesReceived(int messagesReceived);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats messagesReceived(final int messagesReceived) {
    setMessagesReceived( messagesReceived );
    return this;
  }

  @JsProperty
  int getMessagesSent();

  @JsProperty
  void setMessagesSent(int messagesSent);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats messagesSent(final int messagesSent) {
    setMessagesSent( messagesSent );
    return this;
  }

  @JsProperty
  String getProtocol();

  @JsProperty
  void setProtocol(@Nonnull String protocol);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats protocol(@Nonnull final String protocol) {
    setProtocol( protocol );
    return this;
  }

  @JsProperty
  @Nonnull
  String getState();

  @JsProperty
  void setState(@Nonnull String state);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats state(@Nonnull final String state) {
    setState( state );
    return this;
  }

  @JsProperty
  @Nonnull
  String getTransportId();

  @JsProperty
  void setTransportId(@Nonnull String transportId);

  @JsOverlay
  @Nonnull
  default RTCDataChannelStats transportId(@Nonnull final String transportId) {
    setTransportId( transportId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCDataChannelStats type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
