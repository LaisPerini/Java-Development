<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Imprimindo Tabuada em forma de tabela ! </title>
</head>
<body>

  <%@ include file="menu.jsp" %>

  <h1>Tabuada </h1>

 <table>
   <%for(int i=0;i<10;i++){ %>
   <tr>
      <% for(int c=0;c<10;c++){ %>
      <% int res=0; %>
      <% res=i*c; %>
           <td> <%= i +" X "+ c + " = "+ res %></td>
      <%} %>
      
   <%} %>
 </tr>
 
 </table>
 
  <%@ include file="rodape.jsp" %>






</body>
</html>

