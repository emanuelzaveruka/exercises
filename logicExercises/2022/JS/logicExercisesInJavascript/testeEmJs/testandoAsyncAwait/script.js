// CallBack > Promise > async/await
/*
 * O que é async?
 *
 */
//O fs é o fileSystem é um modulo que le
// E escreve arquivos

const fs = require('fs');

console.log(1)

function callback(err, contents) {
    console.log(err, contents)
}

fs.readFile('./in1.txt', callback)

console.log(2)

console.log(3)