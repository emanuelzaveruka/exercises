let nome = 'emanuel'
let names = ['emanuel', 'manu', 'manoel']

for (let nome of names) {
    console.log(nome)
}

//for in

let person = {
    name: 'Emanuel',
    age: 19,
    weight: 87
}

for (let property in person) {
    console.log(property)
    console.log(person[property])
}