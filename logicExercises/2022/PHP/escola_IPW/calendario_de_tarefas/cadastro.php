<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro do Usuário - Tarefas Diárias</title>
</head>
<body>
    <form action="db/cad_usuario.php" method="post">
        Nome:
        <input type="text" name="nome"><br> <br>
        E-mail:
        <input type="email" name="email"><br> <br>
        Senha:
        <input type="password" name="senha" id = "senha" onkeyup="validaSenha()"><br> <br>
        Confirmação de senha:
        <input type="password" name="senha2" id = "senha2" onkeyup="validaSenha()"><br> <br>
        <button>Cadastrar</button>
    </form>
    <script type="text/javascript"> 
        function validaSenha(){
            $senha = document.getElementById("senha").value;
            $senha2 = document.getElementById("senha2").value;
            if ($senha != $senha2){
                document.getElementById("senha2").style.border = "red 1px solid";
            }else{
                document.getElementById("senha2").style.border = "green 1px solid";
            };
        };
    </script>
</body>
</html>