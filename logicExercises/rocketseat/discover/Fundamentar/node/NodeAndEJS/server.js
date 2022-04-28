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
 */
app.get("/", function(req, res) {
    res.render("index")
})

app.get("/", function(req, res) {
        res.render("about")
    })
    /*
     * 
     */
app.listen(8080)