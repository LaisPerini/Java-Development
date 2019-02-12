<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- TAGLIB PARA UTILIZAR A BIBLIOTECA DE TAGS DO JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca</title>

<!-- REFERENCIA BOOTSTRAP -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>

</head>
<body>


	<%@ include file="navBar.jsp"%>

	<div class=container>

		<h1>Lista de Livros</h1>
         
         <c:if test="${not empty mensagem }">
        <div class="alert alert-danger">
          ${mensagem }
        </div>
        </c:if>


		<table class="table">
			<tr>
				<th>Título</th>
				<th>Autor</th>
				<th>Nº Páginas</th>
				<th>ISBN</th>
				<th>Data Publicação</th>
				<th>Data Registro</th>
				<th></th>
			</tr>

			<!-- UTILIZADA A TAG DE FOREACH PARA PERCORRER
                A LISTA RECUPERADA DA SERVLET -->

			<c:forEach var="risos" items="${chaveDaLista}">
				<tr>
					<td>${risos.titulo }</td>
					<td>${risos.autor }</td>
					<td>${risos.numeroPagina }</td>
					<td>${risos.isbn }</td>
					<td>
	<fmt:formatDate pattern ="dd/MM/yyyy" value="${risos.dataPublicacao.time}"/>
				 </td>
			      <td>
	<fmt:formatDate pattern ="dd/MM/yyyy" value="${risos.dataRegistro.time}"/>
					</td>
					
	    
	<!-- <a href="livroServlet?isbn=${risos.isbn}&acao=editar">Alterar</a> 
	 PEGANDO OS PARAMÊTROS PARA PODER ATUALIZAR SE FOR PRECISO O FORMULÁRIO-->
	 
			<c:url value="livroServlet" var="link">
			 <c:param name="isbn" value="${risos.isbn }"/>
			<c:param name="acao" value="abrirForm" />
			</c:url>
			<a href="${link}" class="btn btn-info btn-sm">Alterar</a>
						
				<!-- Button trigger modal  -->
		<button onclick="idIsbn.value = ${risos.isbn}" type="button" class="btn btn-danger btn-sm"
	     data-toggle="modal" data-target="#myModal">Apagar</button> 
					</td>
				</tr>
			</c:forEach>

		</table>

		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Modal title</h4>
					</div>
					<div class="modal-body">Deseja confirmar a exclusão do Livro
						?</div>
					<div class="modal-footer">


						<form action="livroServlet" method="post">
							<input type="hidden" name="isbn" id="idIsbn">
							<input type="hidden" name="acao" value="excluir">
							<button type="button" class="btn btn-default"
								dat a-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Confirmar</button>

						</form>

					</div>
				</div>
			</div>
		</div>


	</div>

</body>
</html>