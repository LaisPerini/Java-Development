<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP</title>
</head>
<body>
     
     <h1>Index | Página Inicial </h1>
     <%-- Incluir um arquivo JSP(Diretivas) --%>
     <%@ include file="menu.jsp" %>
   

	<%-- Comentário do JSP (Não aparece no HTML final) --%>
	<!-- Comentário do HTML (Aparece no HTML final) -->
	
	<ul>
	 <% for(int i=0;i<10;i++){%>
	 <li><%=i %></li>
	 <%} //Fechamento do for %>
	</ul>
	
	 <%@ include file="rodape.jsp" %>

</body>
</html>