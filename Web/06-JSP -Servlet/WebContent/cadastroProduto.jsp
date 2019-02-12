<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>

<div>
<h1> Cadastro de Produto</h1>
</div>

 <form method="post" action="cadastrar">
 
  <label for="codigo">Código :</label><input type="text" name="codigo" id="codigo"><br><br>
  <label for="nome">Nome : </label><input type="text" name="nome" id="nome"><br><br>
  <label for="preco">Preço :</label><input type="text" name="preco" id="preco"><br><br>
  <input type="submit" name="cadastrar" value="Cadastrar">
 
 </form>
 
 <!-- Código java para não exibir na tela o "Null" -->
  <% if(request.getAttribute("qualquer") !=null){ %>
   <%=request.getAttribute("qualquer") %>
   <% } %>

</body>
</html>