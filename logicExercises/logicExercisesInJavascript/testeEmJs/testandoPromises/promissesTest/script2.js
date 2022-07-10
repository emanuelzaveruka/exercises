//Fetch request na API no GitHub
//Fetch API <- uMA API Do proprio

/*
 * Fecth API é uma LIB nativa do JS
 * Feita em AJAX para fazer request assyc 
 * Antigamente era usado o axios
 */

const userName = 'emanuelzaveruka'
    //Na function fecth passamos a url como primeiro argumento
    //E no segundo argumento passamos um objeto que leva parametro na request
fetch(`https://api.github.com/users/${userName}`, {
    method: 'GET',
    headers: {
        Accept: 'application/vnd.github.v3+json',
    },
    //O fecth retorna uma promise
    //Ele vai resolver essa requisição
}).then((response) => {
    //typeof mostra o que é composto a resposta
    console.log(typeof response)
    console.log(response)
    return response.json()
}).then((data) => {
    console.log(`nome do usuario é' + ${data.name}`)
}).catch((err) => {
    console.log(`Houve algum erro + ${err}`)
})