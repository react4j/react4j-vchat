package react4j.vchat.model;

import arez.ComputableValue;
import arez.Disposable;
import arez.ObservableValue;
import arez.SafeProcedure;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.CascadeDispose;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import arez.annotations.ObservableValueRef;
import elemental2.core.JsArray;
import elemental2.promise.Promise;
import elemental3.CloseEvent;
import elemental3.Console;
import elemental3.ConstrainULongRange;
import elemental3.Event;
import elemental3.Global;
import elemental3.JSON;
import elemental3.Location;
import elemental3.MediaStream;
import elemental3.MediaStreamConstraints;
import elemental3.MediaStreamTrack;
import elemental3.MediaStreamTrackEvent;
import elemental3.MediaTrackConstraints;
import elemental3.MessageEvent;
import elemental3.RTCConfiguration;
import elemental3.RTCIceCandidate;
import elemental3.RTCIceCandidateInit;
import elemental3.RTCIceConnectionState;
import elemental3.RTCIceServer;
import elemental3.RTCLocalSessionDescriptionInit;
import elemental3.RTCPeerConnection;
import elemental3.RTCPeerConnectionIceEvent;
import elemental3.RTCRtpSender;
import elemental3.RTCTrackEvent;
import elemental3.WebSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@ArezComponent
public abstract class RoomModel
{
  public enum State
  {
    // Have not established a connection to the signalling server
    NOT_READY,
    // Connected to the signalling server as a guest but not yet attempted to join the chat
    CONNECTED,
    // Guest requested to join the the room, waiting for host acceptance or rejection
    JOIN_REQUESTED,
    // Host has rejected guests attempt to join the room
    JOIN_REJECTED,
    // Joined the room as either a host or after being accepted by the host
    JOINED,
    // Host has closed the room and the chat has been terminated
    CLOSED,
    // Left the room
    LEFT,
    // The room already has a guest and a host so can accept no more participants
    FULL,
    // An error occurred and the connection was closed
    ERROR
  }

  // The role of the current user
  public enum Role
  {
    UNKNOWN, HOST, GUEST
  }

  enum ConnectionState
  {
    CONNECTING, OPEN, CLOSING, CLOSED, NOT_REQUESTED
  }

  @Nonnull
  private final String _code;
  @Nonnull
  private final List<AccessRequest> _pendingAccessRequest = new ArrayList<>();
  @Nullable
  private WebSocket _webSocket;
  @Nullable
  private RTCPeerConnection _connection;
  @Nonnull
  private final Set<String> _participants = new HashSet<>();
  @CascadeDispose
  @Nonnull
  final MediaStreamConnection _camStream =
    MediaStreamConnection.create( this::requestWebCam, this::addTracks, false, true, true );
  @CascadeDispose
  @Nonnull
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, this::addTracks, false, false, true );
  @Nonnull
  private List<MediaStreamConnection> _remoteStreams = new ArrayList<>();

  @Nonnull
  public static RoomModel create( @Nonnull final String code )
  {
    return new Arez_RoomModel( code, State.NOT_READY, Role.UNKNOWN, "" );
  }

  RoomModel( @Nonnull final String code )
  {
    _code = Objects.requireNonNull( code );
  }

  @Nonnull
  public String getRoomCode()
  {
    return _code;
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  @Nonnull
  ConnectionState connectionState()
  {
    return null == _webSocket ? ConnectionState.NOT_REQUESTED : ConnectionState.values()[ _webSocket.readyState() ];
  }

  @ComputableValueRef
  abstract ComputableValue<?> getConnectionStateComputableValue();

  @Observable
  @Nonnull
  public abstract State state();

  abstract void setState( @Nonnull State state );

  @Observable
  @Nonnull
  public abstract Role role();

  abstract void setRole( @Nonnull Role role );

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  @Nonnull
  public abstract String requestAccessMessage();

  public abstract void setRequestAccessMessage( @Nonnull String message );

  @Nonnull
  public MediaStreamConnection getCamStream()
  {
    return _camStream;
  }

  public boolean isScreenShareEnabled()
  {
    return _screenShareStream.isEnabled();
  }

  @Action
  public void toggleScreenShare()
  {
    final MediaStream stream = _screenShareStream.getStream();
    if ( null != _connection && null != stream && _screenShareStream.isEnabled() )
    {
      // Remove existing tracks if we are currently enabled and we are toggling to off
      removeTracks( stream );
    }
    _screenShareStream.toggleEnabled();
    if ( null != _connection && null != stream && _screenShareStream.isEnabled() )
    {
      // add tracks if we toggled on
      addTracks( stream );
    }
  }

  @Observable( expectSetter = false )
  @Nonnull
  public List<AccessRequest> getPendingAccessRequests()
  {
    //TODO: Replace this with an observable list...
    return _pendingAccessRequest;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getPendingAccessRequestsObservableValue();

  @Observable( expectSetter = false )
  @Nonnull
  public Set<String> getParticipants()
  {
    //TODO: Replace this with an observable list...
    return _participants;
  }

  @ObservableValueRef
  abstract ObservableValue<?> getParticipantsObservableValue();

  //TODO: Make this observable
  @Nonnull
  public MediaStreamConnection getActiveMediaStream()
  {
    //TODO: Ensure that different streams can be made observable
    return _camStream;
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  @Nonnull
  public List<MediaStreamConnection> getListMediaStreams()
  {
    final List<MediaStreamConnection> streams = new ArrayList<>();
    if ( _screenShareStream.isEnabled() )
    {
      streams.add( _screenShareStream );
    }
    streams.addAll( _remoteStreams );
    return streams;
  }

  @ComputableValueRef
  abstract ComputableValue<?> getListMediaStreamsComputableValue();

  @Action
  public void open()
  {
    leave();
    _camStream.setEnabled( true );
    _webSocket = new WebSocket( deriveRoomUrl() );
    getConnectionStateComputableValue().reportPossiblyChanged();
    setRole( Role.UNKNOWN );
    setState( State.NOT_READY );
    _webSocket.onopen = this::onOpen;
    _webSocket.onmessage = this::onMessage;
    _webSocket.onclose = this::onClose;
    _webSocket.onerror = this::onError;

    // Use one of Google's public STUN servers
    // The host should perform the offer rolw and the guest the answer role
    _connection = new RTCPeerConnection( RTCConfiguration
                                           .create()
                                           .iceServers( RTCIceServer.create( "stun:stun.l.google.com:19302" ) ) );

    _connection.onicecandidate = this::onIceCandidate;
    _connection.ontrack = this::onTrack;
    _connection.onconnectionstatechange = this::onConnectionStateChange;
  }

  @Action( verifyRequired = false )
  void onConnectionStateChange( @Nonnull final Event event )
  {
    if ( _connection == event.currentTarget() )
    {
      assert null != _connection;
      final String state = _connection.iceConnectionState();
      if ( RTCIceConnectionState.disconnected.equals( state ) ||
           RTCIceConnectionState.failed.equals( state ) ||
           RTCIceConnectionState.closed.equals( state ) )
      {
        _remoteStreams.forEach( Disposable::dispose );
        _remoteStreams = new ArrayList<>();
        getListMediaStreamsComputableValue().reportPossiblyChanged();
      }
    }
  }

  void addTracks( @Nonnull final MediaStream stream )
  {
    // attach local media to the peer connection
    stream.getTracks().forEach( ( track, index, tracks ) -> {
      assert null != _connection;
      _connection.addTrack( track, stream );
      return null;
    } );
  }

  void removeTracks( @Nonnull final MediaStream stream )
  {
    assert null != _connection;
    stream.getTracks().forEach( ( track, index, tracks ) -> {
      assert null != _connection;
      final RTCRtpSender rtpSender =
        _connection.getSenders().find( ( sender, senderIndex, severs ) -> sender.track() == track );
      if ( null != rtpSender )
      {
        _connection.removeTrack( rtpSender );
      }
      return null;
    } );
  }

  @Action( verifyRequired = false )
  void connectPeerConnection()
  {
    assert Role.HOST == role();
    //Global.globalThis().console().log( "Attempting to send rtc session description" );
    assert null != _connection;
    _connection.createOffer()
      .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit
                                                         .create()
                                                         .sdp( offer.sdp() )
                                                         .type( offer.type() ) ) )
      .then( e -> {
        sendMessage( JsPropertyMap.of( "command", "offer", "session", _connection.localDescription() ) );
        return null;
      } )
      .catch_( e -> {
        // TODO: An error occurred, so handle the failure to connect
        Global.globalThis().console().log( "Offer error: ", e );
        return null;
      } );
  }

  private void sendMessage( @Nonnull final JsPropertyMap<Object> message )
  {
    if ( null != _webSocket )
    {
      //Global.globalThis().console().log( "Sending message", JSON.parse( JSON.stringify( message ) ) );
      _webSocket.send( JSON.stringify( message ) );
    }
  }

  @Action( verifyRequired = false )
  void onTrack( @Nonnull final RTCTrackEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      Global.globalThis().console().log( "onTrack", event );

      // when the other side added one or more media streams, show it on screen
      final JsArray<MediaStream> streams = event.streams();

      // TODO: This is an ugly hack so that @Memoize method will return a
      //  different value and thus be marked as changed
      _remoteStreams = new ArrayList<>( _remoteStreams );
      streams.forEach( ( stream, index, collection ) -> {
        if ( _remoteStreams.stream().noneMatch( connection -> doesConnectionMatchStream( connection, stream ) ) )
        {
          final Consumer<MediaStream> noop = s -> {
          };
          final MediaStreamConnection streamConnection =
            MediaStreamConnection.create( () -> Promise.resolve( stream ), noop, true, true, true );
          streamConnection.requestConnect();
          _remoteStreams.add( streamConnection );
          stream.onremovetrack = this::onRemoveTrack;
        }
        return null;
      } );
      getListMediaStreamsComputableValue().reportPossiblyChanged();
    }
  }

  private boolean doesConnectionMatchStream( @Nonnull final MediaStreamConnection connection,
                                             @Nonnull final MediaStream stream )
  {
    final MediaStream connectionStream = connection.getStream();
    return null != connectionStream && connectionStream.id().equals( stream.id() );
  }

  @Action
  void onRemoveTrack( @Nonnull final MediaStreamTrackEvent e )
  {
    final MediaStreamTrack track = e.track();
    Global.globalThis().console().log( "onRemoveTrack " + track.id() );
    _remoteStreams = _remoteStreams.stream()
      .filter( c -> !doesConnectionContainTrack( c, track ) )
      .collect( Collectors.toList() );
    getListMediaStreamsComputableValue().reportPossiblyChanged();
  }

  private boolean doesConnectionContainTrack( @Nonnull final MediaStreamConnection connection,
                                              @Nonnull final MediaStreamTrack track )
  {
    final MediaStream stream = connection.getStream();
    return null != stream && !stream.id().equals( track.id() );
  }

  private void onIceCandidate( @Nonnull final RTCPeerConnectionIceEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      //Global.globalThis().console().log( "onIceCandidate", event );
      final RTCIceCandidate candidate = event.candidate();
      if ( null != candidate && null != _webSocket )
      {
        sendMessage( JsPropertyMap.of( "command", "candidate",
                                       "mlineindex", candidate.sdpMLineIndex(),
                                       "candidate", candidate.candidate() ) );
      }
    }
  }

  @Action( verifyRequired = false )
  void leave()
  {
    leaveWithState( State.LEFT );
  }

  void leaveWithState( @Nonnull final State state )
  {
    if ( null != _webSocket )
    {
      _pendingAccessRequest.clear();
      _webSocket.close();
      _webSocket = null;
      setState( state );
    }
  }

  @Nonnull
  private String deriveRoomUrl()
  {
    final Location location = Global.globalThis().location();
    final String protocol = "https".equals( location.protocol ) ? "wss" : "ws";
    // For local development hardcode the port. In the future we should fix this
    final int port = 3737;
    return protocol + "://" + location.hostname + ":" + port + "/r/" + getRoomCode();
  }

  @Action( verifyRequired = false )
  void onError( @Nonnull final Event event )
  {
    Global.globalThis().console().log( "Websocket.error", event );
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      setState( State.ERROR );
      _webSocket = null;
    }
  }

  @Action( verifyRequired = false )
  void onOpen( @Nonnull final Event event )
  {
    //Global.globalThis().console().log( "Websocket.open", event );
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action( verifyRequired = false )
  void onClose( @Nonnull final CloseEvent closeEvent )
  {
    //Global.globalThis().console().log( "Websocket.close", closeEvent );
    if ( _webSocket == closeEvent.currentTarget() )
    {
      _webSocket = null;
      final State state = state();
      if ( State.LEFT != state && State.CLOSED != state && State.ERROR != state )
      {
        setState( State.CLOSED );
      }
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action( verifyRequired = false )
  void onMessage( @Nonnull final MessageEvent event )
  {
    final Any data = event.data();
    assert null != data;
    final Console console = Global.globalThis().console();
    //console.log( "Websocket.message", data );
    final Any object = JSON.parse( data.cast() );
    assert null != object;
    final JsPropertyMap<Object> message = object.cast();

    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      final String command = message.getAsAny( "command" ).asString();
      if ( "create".equals( command ) )
      {
        console.log( "Connected to room as host" );
        setRole( Role.HOST );
        setState( State.JOINED );
      }
      else if ( "connect".equals( command ) )
      {
        console.log( "Connected to room as guest" );
        setRole( Role.GUEST );
        setState( State.CONNECTED );
      }
      else if ( "full".equals( command ) )
      {
        console.log( "Room full. Leaving room." );
        setRole( Role.UNKNOWN );
        leaveWithState( State.FULL );
      }
      else if ( "request_access".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        final String requestMessage = message.getAsAny( "message" ).asString();
        console.log( "Guest '" + id + "' requested access to room with message '" + requestMessage + "'" );
        _pendingAccessRequest.add( new AccessRequest( id, requestMessage ) );
        getPendingAccessRequestsObservableValue().reportChanged();
      }
      else if ( "accept".equals( command ) )
      {
        console.log( "Host allowed guest to join room." );
        setState( State.JOINED );
      }
      else if ( "reject".equals( command ) )
      {
        console.log( "Host rejected guest from room." );
        setState( State.JOIN_REJECTED );
      }
      else if ( "accepted".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        console.log( "Host accepted guest '" + id + "' into room." );
        _participants.add( id );
        getParticipantsObservableValue().reportChanged();
      }
      else if ( "remove".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        if ( _participants.remove( id ) )
        {
          console.log( "Guest '" + id + "' left the room." );
          getParticipantsObservableValue().reportChanged();
        }
        else if ( _pendingAccessRequest.removeIf( r -> r.getId().equals( id ) ) )
        {
          console.log( "Client '" + id + "' left the room." );
          getPendingAccessRequestsObservableValue().reportChanged();
        }
      }
      else if ( "offer".equals( command ) )
      {
        assert null != _connection;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
        _connection
          .createAnswer()
          .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit.create()
                                                             .type( offer.type() )
                                                             .sdp( offer.sdp() ) ) )
          .then( e -> {
            sendMessage( JsPropertyMap.of( "command", "answer", "session", _connection.localDescription() ) );
            return null;
          } )
          .catch_( e -> {
            // TODO: An error occurred, so handle the failure to connect
            Global.globalThis().console().log( "Answer error: ", e );
            return null;
          } );
      }
      else if ( "answer".equals( command ) )
      {
        assert null != _connection;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
      }
      else if ( "candidate".equals( command ) )
      {
        assert null != _connection;
        _connection.addIceCandidate( RTCIceCandidateInit.create()
                                       .sdpMLineIndex( message.getAsAny( "mlineindex" ).asDouble() )
                                       .candidate( message.getAsAny( "candidate" ).asString() ) );
      }
    }
  }

  @Action( verifyRequired = false )
  public void requestAccess()
  {
    if ( null != _webSocket )
    {
      sendMessage( JsPropertyMap.of( "command", "request_access", "message", requestAccessMessage() ) );
      setState( State.JOIN_REQUESTED );
    }
  }

  @Action( verifyRequired = false )
  public void acceptAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest, () -> {
      final String id = accessRequest.getId();
      sendMessage( JsPropertyMap.of( "command", "approve_access", "id", id ) );
      _participants.add( id );
      getParticipantsObservableValue().reportChanged();
      connectPeerConnection();
    } );
  }

  @Action( verifyRequired = false )
  public void rejectAccessRequest( @Nonnull final AccessRequest accessRequest )
  {
    processAccessRequest( accessRequest,
                          () -> sendMessage( JsPropertyMap.of( "command", "reject_access",
                                                               "id", accessRequest.getId() ) ) );
  }

  private void processAccessRequest( @Nonnull final AccessRequest accessRequest,
                                     @Nonnull final SafeProcedure action )
  {
    if ( null != _webSocket && _pendingAccessRequest.remove( accessRequest ) )
    {
      _pendingAccessRequest.removeIf( a -> a.getId().equals( accessRequest.getId() ) );
      getPendingAccessRequestsObservableValue().reportChanged();
      action.call();
    }
  }

  @Nonnull
  private Promise<MediaStream> requestWebCam()
  {
    return Global
      .globalThis()
      .navigator()
      .mediaDevices()
      .getUserMedia( MediaStreamConstraints
                       .create()
                       .audio( true )
                       .video( MediaTrackConstraints
                                 .create()
                                 .width( ConstrainULongRange.create().min( 160 ).ideal( 640 ).max( 1280 ) )
                                 .height( ConstrainULongRange.create().min( 120 ).ideal( 360 ).max( 720 ) ) ) );
  }

  @Nonnull
  private Promise<MediaStream> requestScreenShare()
  {
    return Global.globalThis().navigator().mediaDevices().getDisplayMedia();
  }
}
