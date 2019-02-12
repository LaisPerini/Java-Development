<%@page import="br.com.fiap.bean.Veiculo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Veiculo</title>
<!-- Referência do CSS do BootStrap -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

</head>
<body>

	<!--  RECUPERA A LISTA DE VEÍCULOS QUE O SERVLET PASSOU -->


	<!-- FORÇAMOS A VARIAVEL A SE TORNAR UMA LISTA >> USO DO CASTING -->
	<%
		List<Veiculo> lista = (List<Veiculo>) request.getAttribute("modeloChave");
	%>

	<div class="container">

		<h1>Lista de Veículos</h1>

		<table class="table">
			<tr>
				<th>MODELO</th>
				<th>ANO</th>
				<th>VALOR</th>
				<th>MONTADORA</th>
			</tr>
			<%
				for (Veiculo v : lista) {
			%>
			<tr>
				<td><%=v.getModelo()%></td>
				<td><%=v.getAno()%></td>
				<td><%=v.getValor()%></td>
				<td><%=v.getMontadora()%></td>
			</tr>
			<%
				}
			%>


		</table>

		<div>
			<a href="veiculo.jsp">Cadastrar Veículo</a>
		</div>

	</div>


</body>
</html>
