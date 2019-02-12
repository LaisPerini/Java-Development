<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Livro</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>

	<%@ include file="navBar.jsp"%>

	<div class="container">
		<h1>Atualização de Livro</h1>

		<c:if test="${not empty mensagem }">
			<div class="alert alert-danger">${mensagem }</div>
		</c:if>


		<div class="row">
			<div class="col-md-4">

				<form method="post" action="livroServlet">
					<input type="hidden" name="acao" value="alterar">

					<div class="form-group">
						<label for="idIsbn">ISBN : </label> <input readonly
							value="${livro.isbn }" type="text" name="isbn" id="idIsbn"
							class="form-control">
						<!-- Dentro do form de alterar => value="${livro.isbn }"-->
					</div>

					<div class="form-group">
						<label for="idTitulo">Título : </label> <input type="text"
							value="${livro.titulo }" name="titulo" id="idTitulo"
							class="form-control">
					</div>

					<div class="form-group">
						<label for="idNumPags">Número de Páginas : </label> <input
							value="${livro.numeroPagina }" type="text" name="numero"
							id="idNumPags" class="form-control">
					</div>

					<div class="form-group">
						<label for="idAutor">Autor : </label> <input type="text"
							value="${livro.autor }" name="autor" id="idAutor"
							class="form-control">

					</div>
					<div class="form-group">
					<label for="idData">Data da Publicação</label>
					<input type="text" name="dataPublicacao" id="idData" class="form-control"
					value="${livro.dataPublicacao.time}">
					</div>

					<div> 
						<input type="submit" name="alterar" value="ALTERAR"
							class="btn btn-success">
					</div>

				</form>

			</div>
		</div>












	</div>


</body>
</html>