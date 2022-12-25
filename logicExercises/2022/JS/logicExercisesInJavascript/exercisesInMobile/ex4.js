const EventEmitter = require('events');
const myEmitter = new EventEmitter();

myEmitter.on('event', (dividendo, divisor)=>{
  console.log("resultado é: " + (dividendo  % divisor) )
})

myEmitter.emit('event', 6, 5)