//Criação de promessas

/*
 * Os dois argumento de saida

const myPromise = new Promise((resolve, reject) => {
    //Este dado pode vir de alguma request
    const nome = "emanuel"

    if (nome == "emanuel") {
        resolve("usuario encontrado")
    } else {
        reject("usuario não encontrado")
    }
})

myPromise.then((data) => {
    console.log(data)
})

 */

//Encadear then para tirar mais vantagem da promises
/*
const myPromise = new Promise((resolve, reject) => {
    //Este dado pode vir de alguma request
    const nome = "emanuel"

    if (nome == "emanuel") {
        resolve("usuario encontrado")
    } else {
        reject("usuario não encontrado")
    }
})

myPromise.then((data) => {
        return data.toLowerCase()
    })
    .then((stringModificada) => {
        console.log(stringModificada)
    })
*/
//Trantando Erros atraves do  try and catch

const myPromise = new Promise((resolve, reject) => {
    //Este dado pode vir de alguma request
    const nome = "manu"

    if (nome == "emanuel") {
        resolve("usuario encontrado")
    } else {
        reject("usuario não encontrado")
    }
})

//Metodo catch

myPromise.then((data) => {
    console.log(data)
}).catch((err) => {
    console.log('erro ' + err)
})

//Resolver varias promessas 

const p1 = new Promise((resolve, reject) => {
    resolve("P1 ok")
})

const p2 = new Promise((resolve, reject) => {
    resolve("P2 ok")
})

const p3 = new Promise((resolve, reject) => {
    resolve("P3 ok")
})


//O metodo all ele aceita um array de promisse e em seguida encadeamos com then
// É executada de forma assinc
const resolveAll = Promise.all([p1, p2, p3]).then((res) => {
    console.log(res)
})