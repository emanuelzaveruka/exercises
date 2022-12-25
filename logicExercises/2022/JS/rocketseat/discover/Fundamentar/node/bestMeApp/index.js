const questions = [
    "O que aprendi hoje?",
    "O que me deixou triste?",
    "O que eu poderia fazer para melhorar?",
    "O que me deixou feliz hoje?",
    "Quantas pessoas ajudei hoje?"
]

const ask = (index = 0) => {
    return process.stdout.write(questions[index] + "\n")
}

ask();
const respostas = []
process.stdin.on("data", data => {
    respostas.push(data.toString().trim())
    if (respostas.length < questions.length) {
        ask(respostas.length)
    } else {
        process.exit()
    }
})

process.on('exit', () => {
    console.log(`
    O que aprendi hoje?
    ${respostas[0]}

    O que me deixou triste?
    ${respostas[1]}
    
    O que eu poderia fazer para melhorar?
    ${respostas[2]}
    
    O que me deixou feliz hoje?
    ${respostas[3]}
    
    Quantas pessoas ajudei hoje?
    ${respostas[4]}

    `)
})