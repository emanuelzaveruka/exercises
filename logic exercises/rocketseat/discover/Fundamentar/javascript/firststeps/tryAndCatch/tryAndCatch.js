function sayMyName(name = '') {
    if (name === false) {
        throw 'Nome é obrigatório'
    }

    console.log(name)
}

try {
    sayMyName('emanuel')
} catch (e) {
    console.log(e)
}

console.log('após ao try/catch')