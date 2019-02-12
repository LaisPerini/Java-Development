<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login de Usuário</title>
</head>
<body>

 <h1>Entre</h1>

 <form method="post" action="logar">
  <div>
    <label for="idLogin">Login : </label> <input id="idLogin" type="text" name="login">
     <br><br><label for="idSenha">Senha : </label><input type="password" name="senha" id="idSenha">
     <br><br><input type="submit" value="Enviar">
  </div>
  
  <!-- Código java para não exibir na tela o "Null" -->
  <% if(request.getAttribute("qualquer") !=null){ %>
   <%=request.getAttribute("qualquer") %>
   <% } %>
   
   
 </form>
</body>
</html>