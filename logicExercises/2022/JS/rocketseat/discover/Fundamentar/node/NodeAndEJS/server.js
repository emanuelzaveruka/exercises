/*
 *Instanciando/Criando server com express
 *"para mostrar tudo o que estivermos construindo dentro do navegador"
 */
const express = require('express');

//Instanciando express e "guardando" dentro da var app
const app = express();

//Usando metodo set para setar o qual ferramenta será usada é o que vai ser usado
//"view engine" = navegador web
//"ejs" = ferramenta que estaremos usando
app.set("view engine", "ejs")

/*
 * Criando rota atraves do metodo get
 * Quando a rota "/" for chamada irá executar uma fn
 * res = response onde pelo metodo render ()
 * Chamamos o nosso index onde o mesmo não é necessário
 * colocar .ejs o expresse já faz isso por nós
 * Para que a pagina seja encontrada deve estar
 * Dentro de uma pasta views 
 */
app.get("/", function(req, res) {
    const items = [{
            title: "D",
            message: "esenvolver em ejs easy"
        },
        {
            title: "E",
            message: "manuel Zaveruka"
        },
        {
            title: "M",
            message: "anu... Isso meu apelido é manu"
        },
        {
            title: "A",
            message: "utroísta eu sou"
        },
        {
            title: "I",
            message: "ndex é padrão de muitos projetos"
        },
        {
            title: "S",
            message: "ASS"
        }
    ];
    subtitle = "Uma linguagem de modelagem para criação de página HTML"
        //Neste metódo render passamos o index
        //E também o objeto que criamos acima
        //O render aceita o objeto 
    res.render("pages/index", {
        subtitle: subtitle,
        qualitys: items,
    })
})

app.get("/sobre", function(req, res) {
    res.render("pages/about")
})

/*
 * Metodo que indica a porta que esta executando o express
 */
app.listen(8080);
console.log("rodando")