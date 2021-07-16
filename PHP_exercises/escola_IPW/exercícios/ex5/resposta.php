<?php
    $num = $_POST['numero'];
    
    $pi = 3.14;
    
    $diametro  = $num + $num; 
    
    $perimetro = $pi * $diametro;

    $area      = $pi * ($num * $num);

    echo "perímetro";
    echo "<br>";

    echo $perimetro;
    
    echo "<br>";    
    echo "área";
    echo "<br>";
    
    echo $area;
?>
