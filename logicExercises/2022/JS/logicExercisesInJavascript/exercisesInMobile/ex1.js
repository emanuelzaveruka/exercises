const EventEmitter = require('events');
const myEmitter = new EventEmitter();

myEmitter.on('event', function acrescenta(valor, percentual) {
  percentual = percentual / 100;
	let acrescimo = valor * percentual
	console.log(valor + acrescimo)
})

myEmitter.emit('event', 300, 25)