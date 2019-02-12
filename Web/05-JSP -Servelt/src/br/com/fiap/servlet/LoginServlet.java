package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Recuperar informações da página JSP
		String usuario = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		
		//Validar os campos
		if(usuario.equals("fiap") && senha.equals("1234")){
			
			req.setAttribute("olalogin",usuario );
			//req.setAttribute("olasenha", senha);
			
			//Redireciona para a página home.jsp
			req.getRequestDispatcher("home.jsp").forward(req, resp);
			
		}else{
			//Passar informações para a página
			req.setAttribute("qualquer", "Usuário e/ou Senha inválido");
			//você passa dois parametros, um 1º é a chave, que vc utiliza
			//para recuperar o que esta dentro da mensagem, que seria o 2º parâmetro
			
			//Redirecionar o usuário para a página de login
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			//No método format, sempre será request e response, o que muda é o
			//endereço da página
		}
		
	
	}

}
