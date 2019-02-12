<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuário</title>

</head>
<body>


	<div class="container">

		<h1>Cadastre -se ! É Grátis !</h1>

  
 <c:if test="${not empty chaveErro}">
		<div class="alert alert-danger">
		${chaveErro }
		</div>
</c:if>
		
		
		<form action="usuarioServlet" method="post">

			<div class="form-group">
				<label for="idNome">Nome : </label><input type="text" name="nome"
					 id="idNome" class="form-control">
			</div>

			<div class="form-group">
				<label for="idUsuario">Usuário : </label><input type="text"
					name="usuario" id="idUsuario" class="form-control">
			</div>

			<div class="form-group">
				<label for="idSenha">Senha : </label><input type="password"
					name="senha" id="idSenha" class="form-control">
			</div>

			<div class="form-group">
			<label for="idRepita">Repita Senha : </label><input type="password"
					name="repita" id="idRepita" class="form-control">

			</div>

			<div>
				<input type="submit" value="CONFIRMAR CADASTRO"
					class="btn btn-success">
			</div>

		</form>
	</div>

</body>
</html>
