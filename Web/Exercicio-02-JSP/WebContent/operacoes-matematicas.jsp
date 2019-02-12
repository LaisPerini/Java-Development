<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Operações Matemáticas</title>
</head>
<body>

    <%@ include file="menu.jsp" %>
    
	<div>
		<h1>Operações Matemáticas Básicas</h1>
	</div>

	<%
		ArrayList<String> opMat = new ArrayList<String>();
		opMat.add("Soma");
		opMat.add("Subtração");
		opMat.add("Divisão");
		opMat.add("Multiplicação");
	%>
	<ul>
	<% for(int i=0;i<4;i++){ %>
	<li><%=opMat.get(i) %></li>
	<%} %>
	</ul>

   <%@ include file="rodape.jsp" %>
    
</body>
</html>