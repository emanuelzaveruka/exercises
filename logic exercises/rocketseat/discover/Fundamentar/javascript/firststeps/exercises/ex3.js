/*Crie uma função que receba uma string em celsius ou fahrenheit
e faça a transformação de uma unidade para outra 
    C = (F - 32) * 5/9 
    F = C * 9/5 + 32 */

function trasformDegree(degree) {
    const celsiusExists = degree.toUpperCase().includes('C')
    const fahrenheitExists = degree.toUpperCase().includes('F')

    if (!celsiusExists && !fahrenheitExists) {
        throw new Error('Grau não indentificado')
    }

    let updateDegree = Number(degree.toUpperCase().replace("F", ""));
    let formula = (fahrenheit) => (fahrenheit - 32) * 5 / 9
    let degreeSing = 'C'

    if (celsiusExists) {
        updateDegree = Number(degree.toUpperCase().replace("C", ""));
        formula = (celsius) => celsius * 9 / 5 + 32
        degreeSing = 'F'
    }

    return formula(updateDegree) + degreeSing
}

try {
    console.log(trasformDegree('10C'))
    console.log(trasformDegree('50F'))
    console.log(trasformDegree('50Z'))

} catch (error) {
    console.log(error.message)
}