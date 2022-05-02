const  EventEmitter = require('events');
const myEmitter = new EventEmitter();

myEmitter.on('event', function calculaArea(a,b,c) {
 if (a < (b + c) && b < (a + c) && c < (a + b)) {
    if (a == b && b == c) {
      console.log('Triângulo equilátero');
    }
    else if (a == b || a == c || c == b) {
      console.log('Triângulo isóceles');
    }
    else {
      console.log('Triângulo escaleno');
    }
    if(a == 0 && b == 0 && c == 0){
    console.log('Nenhuma medida foi informada!');
    }
 }
})

myEmitter.emit('event', 4,4,4)