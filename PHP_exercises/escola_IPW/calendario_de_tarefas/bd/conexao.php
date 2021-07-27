<?php
$servidor = "localhost:3306";
$senha    = "";
$usuario  = "root";
$banco    = "db_calendario";

$con = mysqli_connect($servidor,$usuario, $senha, $banco);
mysql_set_charset($con,'utf8');
//check conection
if (mysqli_connect_errno())
    {
        echo "failed to connect to MYSQL". mysqli_connect_error();
    }

mysqli_selec_db($con, $banco);

?>