<?php
$servidor = "localhost";
$senha    = "";
$usuario  = "root";
$banco    = "db_calendario";

$con = mysqli_connect($servidor,$usuario, $senha, $banco);
//check conection
if (mysqli_connect_errno())
    {
        echo "failed to connect to MYSQL". mysqli_connect_error();
    }

mysqli_selec_db($con, $banco);

?>