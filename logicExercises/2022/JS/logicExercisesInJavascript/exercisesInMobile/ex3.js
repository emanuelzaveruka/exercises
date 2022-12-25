const EventEmitter = require('events');
const myEmitter = new EventEmitter();

myEmitter.on('event', (base, expoente) => {
 console.log("resulado: " + Math.pow(base, expoente))
})

myEmitter.emit('event', 5, 5)