<?php
if(!isset($_SESSION['login']) and !isset($_SESSION['senha']))
{
    header ("Location:index.php?erro=1");
};
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tarefas Diarias</title>
</head>
<body>
    <a href="">Cadastrar Tarefa</a>
    <a href="">Listar Tarefas</a> <br> <br>
    <a href="">Sair</a> <br> <br>

    <table border="1px">
        <tr>
            <td>Titulo</td>
            <td>Data</td>
            <td>Hora</td>
            <td>Opções</td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>
</body>
</html>