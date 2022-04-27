const { EventEmitter } = require('events')

const ev = new EventEmitter()

ev.on()

ev.emit('saySomething')