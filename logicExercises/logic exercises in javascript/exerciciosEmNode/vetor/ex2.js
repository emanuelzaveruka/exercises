const EventEmitter = require("events");
const myEmitter = new EventEmitter();

function retornaArray(indices) {
    var array = [];
    for (let i = 0; i <= indices; i++) {
        array[i] = Math.floor(Math.random() * 10 + 1);
    }
    return array;
}

myEmitter.on("event", (array, numero) => {
    for (let i = 0; i <= array.length; i++) {
        if (array[i] === numero) {
            posicao = i;
            console.log(`o numero: ${numero} foi encontrado no indice - ${i}`);
        }
    }
});

myEmitter.emit("event", retornaArray(30), 5);