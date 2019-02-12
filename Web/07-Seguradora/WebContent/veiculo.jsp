<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Veículo</title>

<!-- Referência do CSS do BootStrap -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

</head>
<body>


<div class="container">

     <div class="row">
         
         <div class="col-md-6">
         
          <h1>Cadastro de Veículo</h1>
	
	<% if(request.getAttribute("mensagem") != null){ %>
	<div class="alert alert-success">
	<%= request.getAttribute("mensagem") %>
	</div>
	<% } %>

	<form method="post" action="veiculo">
		<div class="form-group">
			<label for="idModelo">Modelo</label> <input class="form-control" type="text" name="modelo"
				id="idModelo">
		</div>

		<div class="form-group">
			<label for="idValor">Valor</label> <input class="form-control" type="text" name="valor"
				id="idValor">
		</div>

		<div class="form-group">
			<label for="idAno">Ano</label> <input class="form-control" type="text" name="ano"
				id="idAno">
		</div>

		<div class="form-group">
			<label for="idMontadora">Montadora</label> <select class="form-control" name="montadora"
				id="idMontadora">
				<option>Selecione</option>
				<option>FORD</option>
				<option>FIAT</option>
				<option>Mercedez</option>
			</select>
		</div>

		<div >
			<input type="submit" value="Salvar" class="btn btn-primary">
			
			<!-- LINK PARA REDIRECIONAR PARA A SERVLE QUE MANDARA AS INFORMAÇÕES PARA A  PÁGINA DE LISTAGEM -->
			<!-- @WebServlet("/veiculo") Aciona a Servlet -->
			
			<a href="veiculo">Lista de Veículos</a>
		</div>


	</form>
	

</div>
         
         </div>
         
         
         <div class="com-md-6">
         
         
         
         </div>
     </div>



	


</body>
</html>