// Crie um algoritmo que transforme as notas do sistema
// numérico para sistema de notas em caracteres tipo A B C

// * de 90 para cima -   A
// * entre 80 - 89   -   B
// * entre 70 - 79   -   C
// * entre 60 - 69   -   D
// * menor que 60    -   F

let person = {
    name: 'Emanuel',
    note: 100
}

function myNote(person) {
    if (person.note < 60 && person.note >= 0) {
        console.log(person.name + ' sua nota é: F')
    } else if (person.note > 60 && person.note < 69) {
        console.log(person.name + ' sua nota é: D')
    } else if (person.note >= 70 && person.note <= 79) {
        console.log(person.name + ' sua nota é: C')
    } else if (person.note >= 80 && person.note <= 89) {
        console.log(person.name + ' sua nota é: B')
    } else if (person.note >= 90) {
        console.log(person.name + ' sua nota é: A')
    } else { console.log("error: nota invalida") }
}

myNote(person)