<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Corretores</title>

<!-- Referência do CSS do BootStrap -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>


	<div class="container">

		<h1>Cadastro de Corretores</h1>


		<form method="post" action="corretores">

			<div>
				<label for="idNome">Nome : </label> <input type="text" name="nome"
					id="idNome">
			</div>

			<div>
				<label for="idTel">Telefone : </label> <input type="text"
					name="telefone" id="idTel">
			</div>

			<div>
				<label for="idSalario">Salário : </label> <input type="text"
					name="salario" id="idSalario">
			</div>

			<div>
				<label>Genêro : </label> <input type="radio" name="sexo" value="F"><label>FEMININO</label>
				<input type="radio" name="sexo" value="M"><label>MASCULINO</label>
			</div>


		</form>

	</div>


</body>
</html>