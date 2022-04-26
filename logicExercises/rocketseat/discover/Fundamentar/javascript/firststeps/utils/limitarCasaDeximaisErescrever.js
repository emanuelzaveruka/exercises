//Transformando um número quebrado com duas casas decimais e trocar ponto por virgula

let number = 5.546544564
    //retorna em uma string
console.log(number.toFixed(2).replace(".", ","))