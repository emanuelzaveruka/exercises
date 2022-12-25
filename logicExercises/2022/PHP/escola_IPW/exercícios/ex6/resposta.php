<?php
    $num1 = $_POST['num1']; //utilizando do metodo post
    $num2 = $_POST['num2']; //trazemos nossa variaveis indentificadas
    $num3 = $_POST['num3']; //com o id definido no formulário

    $media = ($num1 + $num2 + $num3)/3; //lógica da média
    echo "<h1>Média Desejada é 60 </h1>";
    echo "<br>";
    echo "Sua media foi:  " .number_format($media, 2,','); //utilizando da function number_format para definimos a maxima impresão de casas decimais
    echo "<br>";
    echo "Voce foi: ";

    if ($media <= 60){ //teste de média
        echo "Reprovado";
    }else{
        echo "Aprovado";
    };
?>