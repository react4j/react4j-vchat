const WebSocket = require('ws');
const UUID = require('uuid');
const wss = new WebSocket.Server({ port: 3737 });

wss.on('connection', ws => {
  ws.id = UUID();

  ws.on('message', message => {
    ws.send(`[${ws.id}]: ${message}`);
  });
});