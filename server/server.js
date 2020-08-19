const WebSocket = require('ws');
const url = require('url');
const { v4: uuidv4 } = require('uuid');
const wss = new WebSocket.Server({ port: 3737 });

// Host == owner of room
// Guests == accepted clients
// clients == non-accepted clients
// code -> {host:WebSocket, guests:[WebSocket], clients:[WebSocket]}
const rooms = {};

wss.on('connection', (ws, request) => {
  const pathname = url.parse(request.url).pathname;

  if (!pathname.startsWith('/r/')) {
    console.log('Terminating client ' + request.socket.remoteAddress);
    ws.terminate();
  } else {
    ws.isAlive = true;
    ws.id = uuidv4();
    ws.roomCode = pathname.substring(3);
    console.log('Connecting client ' + request.socket.remoteAddress + ' to room "' + ws.roomCode + '"');

    if (rooms[ws.roomCode] === undefined) {
      rooms[ws.roomCode] = { host: ws, guests: [], clients: [] };
      ws.send(JSON.stringify({ command: 'create' }));
    } else {
      rooms[ws.roomCode].clients.push(ws);
      ws.send(JSON.stringify({ command: 'connect' }));
    }

    ws.on('pong', () => ws.isAlive = true);

    ws.on('message', message => {
      let data = JSON.parse(message);
      let room = rooms[ws.roomCode];
      if (undefined === room) {
        ws.send(JSON.stringify({ command: 'close' }));
        ws.close(1005, 'Room closed');
        return;
      }
      console.log('Message from ' + ws.id + ' data = ', room);
      if ('request_access' === data.command) {
        if (ws !== room.host) {
          // If we are an unauthorized client then request access from host
          if (undefined !== room.clients.find(other => other.id === ws.id)) {
            room.host.send(JSON.stringify({ command: 'request_access', id: ws.id, message: data.message }));
            return;
          } else if (undefined !== room.guests.find(other => other.id === ws.id)) {
            // Already approved so ignore message. Can occur due to concurrency overlaps
            return;
          }
        }
      } else if ('approve_access' === data.command) {
        if (ws === room.host) {
          const client = room.clients.find(other => other.id === data.id);
          if (client) {
            // Remove from client array
            room.clients.splice(room.clients.indexOf(client), 1);
            client.send(JSON.stringify({ command: 'accept' }));
            room.guests.forEach(other => {
                if (data.id !== other.id) {
                  other.send(JSON.stringify({ command: 'accepted', id: ws.id }));
                }
              }
            )
            ;
            room.guests.push(client);
            return;
          } else if (undefined !== room.guests.find(other => other.id === data.id)) {
            // Approval for guest already approved
            return;
          }
        }
      } else if ('reject_access' === data.command) {
        if (ws === room.host) {
          const client = room.clients.find(other => other.id === data.id);
          if (client) {
            client.send(JSON.stringify({ command: 'reject' }));
            return;
          } else if (undefined === room.guests.find(other => other.id === data.id)) {
            // Approval for guest already approved
            return;
          }
        }
      }
      ws.send(`[${ws.id}]: ${message}`);
    });

    ws.on('close', () => {
      let room = rooms[ws.roomCode];
      if (undefined !== room) {
        if (room.host === ws) {
          ws.send(JSON.stringify({ command: 'close' }));
          room.guests.forEach(other => {
            other.send(JSON.stringify({ command: 'close' }));
            other.close(1000, 'Room closed');
          });
          room.clients.forEach(other => {
            other.send(JSON.stringify({ command: 'close' }));
            other.close(1000, 'Room closed');
          });
          rooms[ws.roomCode] = undefined;
        } else {
          const index = room.guests.indexOf(ws);
          if (index > -1) {
            room.guests.splice(index, 1);
            room.host.send(JSON.stringify({ command: 'remove', id: ws.id }));
            room.guests.forEach(other => other.send(JSON.stringify({ command: 'remove', id: ws.id })));
            room.clients.forEach(other => other.send(JSON.stringify({ command: 'remove', id: ws.id })));
          }
        }
      }
    });
  }
});

const serverPingIntervalId = setInterval(() => {
  wss.clients.forEach((ws) => {
    if (ws.isAlive === false) {
      ws.terminate();
    } else {
      ws.isAlive = false;
      ws.ping(() => {});
    }
  });
}, 30000);

wss.on('close', () => clearInterval(serverPingIntervalId));