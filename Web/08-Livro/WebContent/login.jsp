<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- TAGLIB PARA UTILIZAR A BIBLIOTECA DE TAGS DO JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN do Usuário</title>
</head>
<body>

<div class="container">

     <c:if test="${not empty chave }">
        <div class="alert alert-success">
		${chave }
		</div>
		</c:if>
		
	     <c:if test="${not empty erro }">
		<div class="alert alert-danger">
		${erro }
		</div>
		</c:if>
        
		<h1>LOGIN</h1>

		<form action="loginServlet" method="post">

			<div class="form-group">
				<label for="idUsuario">Usuário : </label><input type="text"
					name="usuario" id="idUsuario" class="form-control">
			</div>

			<div class="form-group">
				<label for="idSenha">Senha : </label><input type="password" name="senha"
					id="idSenha" class="form-control"></div>
					
			<div class="form-group">
			 <input type="submit" value="ENTRAR" class="btn btn-success">
			</div>
			
			<div>
			 <a href="cadastro-login.jsp">Não possui cadastro ? Clique e seja feliz !</a>
			</div>

		</form>
	</div>




</body>
</html>