const EventEmitter = require("events");
const myEmitter = new EventEmitter();

myEmitter.on("event", (items) => {
    for (var i = 0; i < items.length; i++) /*pega o tamanho do array e faz for*/ {
        for (var j = 0; j < items.length - i - 1; j++) {
            if (items[j] > items[j + 1]) {
                var tmp = items[j];
                items[j] = items[j + 1];
                items[j + 1] = tmp;
            }
        }
    }
    return console.log(items);
});

myEmitter.emit("event", [5, 10, 20, 9, 3, 7]);