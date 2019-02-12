<%@page import="br.com.fiap.beans.Cliente"%>
<%@page import="java.util.List"%>
<%@ page import="java.util.ArrayList,java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>

	<%
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("Porteiro", "gustavo@portaria.com", 18));
		lista.add(new Cliente("Julião", "juliao@ju.com", 20));
		lista.add(new Cliente("Humberto", "humberto@javaman.com", 25));
	%>

	<table border="1">

		<tr>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Idade</th>
		</tr>

		<%
			for (Cliente c : lista) {
		%>
		<tr>
			<td><%=c.getNome()%></td>
			<!-- outra opção out.print(c.getNome()); -->
			<td><%=c.getEmail()%></td>
			<td><%=c.getIdade()%></td>
		</tr>

		<%
			}
		%>
	</table>

</body>
</html>