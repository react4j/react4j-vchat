package react4j.vchat.model;

import akasha.CloseEvent;
import akasha.Console;
import akasha.Event;
import akasha.Location;
import akasha.MessageEvent;
import akasha.WebSocket;
import akasha.WindowGlobal;
import akasha.core.JSON;
import akasha.lang.JsArray;
import akasha.media.ConstrainULongRange;
import akasha.media.DisplayMediaStreamConstraints;
import akasha.media.MediaStream;
import akasha.media.MediaStreamConstraints;
import akasha.media.MediaStreamTrack;
import akasha.media.MediaStreamTrackEvent;
import akasha.media.MediaTrackConstraints;
import akasha.promise.Promise;
import akasha.rtc.RTCConfiguration;
import akasha.rtc.RTCIceCandidate;
import akasha.rtc.RTCIceCandidateInit;
import akasha.rtc.RTCIceConnectionState;
import akasha.rtc.RTCIceServer;
import akasha.rtc.RTCLocalSessionDescriptionInit;
import akasha.rtc.RTCPeerConnection;
import akasha.rtc.RTCPeerConnectionIceEvent;
import akasha.rtc.RTCRtpSender;
import akasha.rtc.RTCTrackEvent;
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

  public enum ConnectionState
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
  private boolean _negotiationInFlight;
  private boolean _negotiationRequested;
  @Nonnull
  private final Set<String> _participants = new HashSet<>();
  @CascadeDispose
  @Nonnull
  final MediaStreamConnection _camStream =
    MediaStreamConnection.create( this::requestWebCam, this::addTracks, false, true );
  @CascadeDispose
  @Nonnull
  final MediaStreamConnection _screenShareStream =
    MediaStreamConnection.create( this::requestScreenShare, this::addTracks, false, true );
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
  public ConnectionState connectionState()
  {
    return null == _webSocket ? ConnectionState.NOT_REQUESTED : ConnectionState.values()[ _webSocket.readyState() ];
  }

  @ComputableValueRef
  abstract ComputableValue<?> getConnectionStateComputableValue();

  @Observable
  @Nonnull
  public abstract State state();

  abstract void setState( @Nonnull State state );

  @Observable( readOutsideTransaction = Feature.ENABLE )
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
    if ( null != _connection && _screenShareStream.isEnabled() )
    {
      // add tracks if we toggled on
      maybeAddTracks( stream );
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
    getConnectionStateComputableValue().reportPossiblyChanged();
    setRole( Role.UNKNOWN );
    setState( State.NOT_READY );
    setupWebSocket();
  }

  private void setupWebSocket()
  {
    _webSocket = new WebSocket( deriveRoomUrl() );
    _webSocket.onopen = this::onOpen;
    _webSocket.onmessage = this::onMessage;
    _webSocket.onclose = this::onClose;
    _webSocket.onerror = this::onError;
  }

  private void setupPeerConnection()
  {
    // Use one of Google's public STUN servers
    // The host should perform the offer role and the guest the answer role
    _connection = new RTCPeerConnection( RTCConfiguration
                                           .of()
                                           .iceServers( RTCIceServer.urls( "stun:stun.l.google.com:19302" ) ) );
    _negotiationInFlight = false;
    _negotiationRequested = false;
    _connection.onicecandidate = this::onIceCandidate;
    _connection.ontrack = this::onTrack;
    _connection.onconnectionstatechange = this::onConnectionStateChange;
    _connection.onnegotiationneeded = e -> negotiateConnectionSession();

    maybeAddTracks( _camStream.getStream() );
    maybeAddTracks( _screenShareStream.getStream() );
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
      else
      {
        negotiateConnectionSession();
      }
    }
  }

  private void maybeAddTracks( @Nullable final MediaStream stream )
  {
    if ( null != stream )
    {
      addTracks( stream );
    }
  }

  private void addTracks( @Nonnull final MediaStream stream )
  {
    // attach local media to the peer connection
    if ( null != _connection )
    {
      stream.getTracks().forEach( track -> _connection.addTrack( track, stream ) );
      requestNegotiation();
    }
  }

  void removeTracks( @Nonnull final MediaStream stream )
  {
    if ( null != _connection )
    {
      stream.getTracks().forEach( track -> {
        final RTCRtpSender rtpSender =
          _connection.getSenders().find( sender -> sender.track() == track );
        if ( null != rtpSender )
        {
          _connection.removeTrack( rtpSender );
          requestNegotiation();
        }
      } );
    }
  }

  private void negotiateConnectionSession()
  {
    // Handle renegotiation of the session which is needed when you add/remove tracks
    // This technique makes means that is acceptable to just call addTrack or removeTrack
    // to get the tracks transported to the peer and session regengotiated.
    // The technique was inspired by the discussion in the "negotiationneeded tames local changes"
    // section at https://blog.mozilla.org/webrtc/perfect-negotiation-in-webrtc/
    assert null != _connection;
    if ( !_negotiationInFlight )
    {
      final Role role = role();
      if ( Role.HOST == role )
      {
        _negotiationInFlight = true;
        assert null != _connection;
        _connection
          .createOffer()
          .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit
                                                             .of()
                                                             .sdp( offer.sdp() )
                                                             .type( offer.type() ) ) )
          .then( e -> {
            sendMessage( JsPropertyMap.of( "command", "offer", "session", _connection.localDescription() ) );
            return null;
          } )
          .catch_( e -> {
            // TODO: An error occurred, so handle the failure to connect
            Console.log( "Offer error: ", e );
            _negotiationInFlight = false;
            return null;
          } );
      }
      else
      {
        assert Role.GUEST == role;
        // We send the renegotiate message to force the host to initiate renegotiation
        sendMessage( JsPropertyMap.of( "command", "renegotiate" ) );
      }
    }
  }

  private void sendMessage( @Nonnull final JsPropertyMap<Object> message )
  {
    if ( null != _webSocket )
    {
      _webSocket.send( JSON.stringify( message ) );
    }
  }

  @Action( verifyRequired = false )
  void onTrack( @Nonnull final RTCTrackEvent event )
  {
    if ( _connection == event.currentTarget() )
    {
      // when the other side added one or more media streams, show it on screen
      final JsArray<MediaStream> streams = event.streams();

      // TODO: This is an ugly hack so that @Memoize method will return a
      //  different value and thus be marked as changed
      _remoteStreams = new ArrayList<>( _remoteStreams );
      streams.forEach( stream -> {
        if ( _remoteStreams.stream().noneMatch( connection -> doesConnectionMatchStream( connection, stream ) ) )
        {
          final Consumer<MediaStream> noop = s -> {
          };
          final MediaStreamConnection streamConnection =
            MediaStreamConnection.create( () -> Promise.resolve( stream ), noop, true, true );
          streamConnection.requestConnect();
          _remoteStreams.add( streamConnection );
          stream.onremovetrack = this::onRemoveTrack;
        }
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
  public void leave()
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
    if ( null != _connection )
    {
      _remoteStreams.forEach( Disposable::dispose );
      _remoteStreams.clear();
      _participants.clear();
      _connection.close();
      _connection = null;
      _negotiationInFlight = false;
      _negotiationRequested = false;
      getParticipantsObservableValue().reportChanged();
      getListMediaStreamsComputableValue().reportPossiblyChanged();
    }
  }

  @Nonnull
  private String deriveRoomUrl()
  {
    final Location location = WindowGlobal.location();
    final String protocol = "https".equals( location.protocol ) ? "wss" : "ws";
    // For local development hardcode the port. In the future we should fix this
    final int port = 3737;
    return protocol + "://" + location.hostname + ":" + port + "/r/" + getRoomCode();
  }

  @Action( verifyRequired = false )
  void onError( @Nonnull final Event event )
  {
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
    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
    }
  }

  @Action( verifyRequired = false )
  void onClose( @Nonnull final CloseEvent closeEvent )
  {
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
    final Any object = JSON.parse( data.cast() );
    assert null != object;
    final JsPropertyMap<Object> message = object.cast();

    if ( _webSocket == event.currentTarget() )
    {
      getConnectionStateComputableValue().reportPossiblyChanged();
      final String command = message.getAsAny( "command" ).asString();
      if ( "create".equals( command ) )
      {
        Console.log( "Connected to room as host" );
        setRole( Role.HOST );
        setState( State.JOINED );
      }
      else if ( "connect".equals( command ) )
      {
        Console.log( "Connected to room as guest" );
        setRole( Role.GUEST );
        setState( State.CONNECTED );
      }
      else if ( "full".equals( command ) )
      {
        Console.log( "Room full. Leaving room." );
        setRole( Role.UNKNOWN );
        leaveWithState( State.FULL );
      }
      else if ( "request_access".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        final String requestMessage = message.getAsAny( "message" ).asString();
        Console.log( "Guest '" + id + "' requested access to room with message '" + requestMessage + "'" );
        _pendingAccessRequest.add( new AccessRequest( id, requestMessage ) );
        getPendingAccessRequestsObservableValue().reportChanged();
      }
      else if ( "accept".equals( command ) )
      {
        Console.log( "Host allowed guest to join room." );
        setState( State.JOINED );
        setupPeerConnection();
      }
      else if ( "reject".equals( command ) )
      {
        Console.log( "Host rejected guest from room." );
        setState( State.JOIN_REJECTED );
      }
      else if ( "accepted".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        Console.log( "Host accepted guest '" + id + "' into room." );
        _participants.add( id );
        getParticipantsObservableValue().reportChanged();
      }
      else if ( "remove".equals( command ) )
      {
        final String id = message.getAsAny( "id" ).asString();
        if ( _participants.remove( id ) )
        {
          Console.log( "Guest '" + id + "' left the room." );
          getParticipantsObservableValue().reportChanged();
        }
        else if ( _pendingAccessRequest.removeIf( r -> r.getId().equals( id ) ) )
        {
          Console.log( "Client '" + id + "' left the room." );
          getPendingAccessRequestsObservableValue().reportChanged();
        }
      }
      else if ( "offer".equals( command ) )
      {
        assert null != _connection;
        _negotiationInFlight = true;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
        _connection
          .createAnswer()
          .then( offer -> _connection.setLocalDescription( RTCLocalSessionDescriptionInit
                                                             .of()
                                                             .type( offer.type() )
                                                             .sdp( offer.sdp() ) ) )
          .then( e -> {
            sendMessage( JsPropertyMap.of( "command", "answer", "session", _connection.localDescription() ) );
            completeNegotiation();
            return null;
          } )
          .catch_( e -> {
            // TODO: An error occurred, so handle the failure to connect
            Console.log( "Answer error: ", e );
            completeNegotiation();
            return null;
          } );
      }
      else if ( "answer".equals( command ) )
      {
        assert null != _connection;
        _connection.setRemoteDescription( message.getAsAny( "session" ).cast() );
        completeNegotiation();
      }
      else if ( "candidate".equals( command ) )
      {
        assert null != _connection;
        _connection.addIceCandidate( RTCIceCandidateInit
                                       .of()
                                       .sdpMLineIndex( message.getAsAny( "mlineindex" ).asDouble() )
                                       .candidate( message.getAsAny( "candidate" ).asString() ) );
      }
      else if ( "renegotiate".equals( command ) )
      {
        assert Role.HOST == role();
        assert null != _connection;
        requestNegotiation();
      }
    }
  }

  private void requestNegotiation()
  {
    _negotiationRequested = true;
    negotiateConnectionSessionIfRequested();
  }

  private void completeNegotiation()
  {
    _negotiationInFlight = false;
    negotiateConnectionSessionIfRequested();
  }

  private void negotiateConnectionSessionIfRequested()
  {
    if ( !_negotiationInFlight && _negotiationRequested )
    {
      _negotiationRequested = false;
      negotiateConnectionSession();
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
      setupPeerConnection();
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
    return WindowGlobal
      .navigator()
      .mediaDevices()
      .getUserMedia( MediaStreamConstraints
                       .of()
                       .audio( true )
                       .video( MediaTrackConstraints
                                 .of()
                                 .width( ConstrainULongRange.of().min( 160 ).ideal( 640 ).max( 1280 ) )
                                 .height( ConstrainULongRange.of().min( 120 ).ideal( 360 ).max( 720 ) ) ) );
  }

  @Nonnull
  private Promise<MediaStream> requestScreenShare()
  {
    return WindowGlobal
      .navigator()
      .mediaDevices()
      .getDisplayMedia( DisplayMediaStreamConstraints.of().audio( false ) );
  }
}
