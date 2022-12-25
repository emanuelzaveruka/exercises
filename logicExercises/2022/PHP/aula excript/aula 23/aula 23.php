<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>ambiente de estudo</title>
	</head>
	<body>
		
		<?php 
		
			if (isset($_POST["valor1"])){ //a função isset verifica se a informação existe
			echo $_POST["valor1"]; //variavel do tipo array

			}

		?>

		<form method="POST">
			<input type="text" name="valor1">
			<input type="submit">

		</form>
	</body>
</html>