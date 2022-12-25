const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
});

readline.question("Informe um numero inteiro", (numero) => {
    var num = numero;
    readline.question("Informe quantos indices deseja interar", (indices) => {
        var indice = indices;
        numberOfFibonacci(num, indice);
    });
});

function numberOfFibonacci(num, indice) {
    let array = [];
    let aux = 0;
    for (let i = 0; i <= indice; i++) {
        aux += num;
        array[i] = aux;
        console.log(array[i]);
    }
    return console.log(array);
}
readline.close();