const util = require('util');
const EventEmitter = require('events');

function Character() {
    EventEmitter.call(this);
}

util.inherits(Character, EventEmitter);

Character.prototype.write = function(data) {
    this.emit('data', data);
};

const person = new Character();

person.on('data', (data) => {
    console.log(`Received data: "${data}"`);
});

person.write('person')