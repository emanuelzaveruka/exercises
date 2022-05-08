let p = new Promise((resolve, reject) => {
    let a = 1 + 10
    if (a == 2) {
        resolve('sucess')
    } else {
        reject('error')
    }
})

p.then((message) => {
    console.log('This is the then' + message)
}).catch((err) => {
    console.log('This is the catch' + err)
})