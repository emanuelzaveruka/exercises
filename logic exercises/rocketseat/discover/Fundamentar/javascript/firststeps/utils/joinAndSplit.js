//Separe um texto que contem espaços, em um nvo array onde cada texto é um posição do array. Depois dissom tranforme o array em um texto e nde eram espaços, coloque _

let phrase = "Eu quero trabalhar como programador LOGO!"
    //split separa com o que contém dentro array com o que passarmos no parametro ou seja o espaço
let myArray = phrase.split(" ")

//join ele vai juntar automaticamente os valores do array
let phraseWithUnderscore = myArray.join("_")
console.log(phraseWithUnderscore.toLowerCase())