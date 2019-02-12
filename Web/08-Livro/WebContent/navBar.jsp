<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="home.jsp" class="navbar-brand">FIAP Books</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">

				<li><a href="cadastro-livro.jsp">Cadastro</a></li>
				 <li><a href="livroServlet?acao=listar">Lista de Livros</a></li>  
         
         
         <c:if test="${empty usuario }">
         <ul class="nav navbar-nav navbar-right">
           <li><a href="cadastro-usuario.jsp">Registre -se !</a></li>
           <li><a href="login.jsp">Entre !</a></li>
         </ul>
         </c:if>

        <c:if test="${not empty usuario }">
				<ul class="nav navbar-nav navbar-right">
				   <li class="dropdown">
				    
				      <a href="#" class="dropdown-toggle"
				       data-toggle="dropdown" role="button"
				        aria-haspopup="true" aria-expanded="false">${usuario } 
				        <span class="caret"></span></a>
				    
				    <ul class="dropdown-menu">
				     <li><a href="loginServlet">Logout</a></li>
				    </ul>
				   </li>
				</ul>
        </c:if>
        
        
			</ul>


		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>
