<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Vaga</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<%@ include file="includes.jsp"%>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
	
	<form>
		<div class="row">
			<div class="col-md-6 form-group">
				<label for="titulo">Título</label>
				<input id="titulo" type="text" name="titulo" class="form-control">
			</div>
			<div class="col-md-6 form-group">
				<label for="cargo">Cargo</label>
				<input id="cargo" type="text" name="cargo" class="form-control">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 form-group">
				<label for="salario">Salário</label>
				<input id="salario" type="text" name="salario" class="form-control">
			</div>
			<div class="col-md-6 form-group">
				<label for="data">Data Publicação</label>
				<input id="data" type="text" name="data" class="form-control">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 form-group">
				<label for="qtd">Quantidade</label>
				<input id="qtd" type="text" name="qtd" class="form-control">
			</div>
			<div class="col-md-6 form-group">
				<label for="empresa">Empresa</label>
				<select name="empresa" 
							id="empresa" class="form-control">
							<option value="">Selecione</option>
							<forEach var="e" items="${listaEmpresa}">
							<option value="${e.id}">${e.nome}</option>
							</forEach>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 form-group">
				<label for="desc">Descrição</label>
				<textarea name="descricao" id="desc" 
					rows="5" cols="50" class="form-control"></textarea>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<input type="submit" value="Salvar" class="btn btn-primary">
			</div>
		</div>
	</form>
	
</div>
</body>
</html>