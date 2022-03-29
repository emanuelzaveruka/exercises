/*Crie um objeto que possuirá 2 propriedades, ambas do tipo array:
    * receitas: [] 
    * despesas: []
Agora, crie uma função que irá calcular o total de receitas e 
despesas e irá mostrar uma mensagem se a família está com 
saldo positivo ou negativo, seguido do valor do saldo.*/




let myExpenses = {
    receitas: [4000, 750],
    despesas: [3300]
}


function Expenses(myExpenses) {

    let totalFinal = 0
    let receitaTotal = 0
    let desepesasFinal = 0

    for (let i = 0; i < myExpenses.receitas.length; i++) {
        receitaTotal += myExpenses.receitas[i];
    }

    for (let i = 0; i < myExpenses.despesas.length; i++) {
        desepesasFinal += myExpenses.despesas[i];
    }

    totalFinal = receitaTotal - desepesasFinal

    console.log('O total do meu saldo é: ' + totalFinal)
}

Expenses(myExpenses)