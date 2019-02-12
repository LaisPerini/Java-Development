package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/usuarioServlet")
public class UsuarioServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// RECUPERAR OS VALORES DO FORMULÁRIO HTML
		
		String nm =  req.getParameter("nome");
		String usu = req.getParameter("usuario");
		String sen = req.getParameter("senha");
		String rep = req.getParameter("repita");
		
		// INSTANCIAR O BO
		
		UsuarioBO bo = new UsuarioBO();
		
		// INSTANCIAR UM USUÁRIO
		
		Usuario usuario = new Usuario(nm, usu, sen);
		
		// CHAMAR O MÉTODO CADASTRAR DO BO
		
		//try {
			//bo.cadastrar(usuario, rep);
		//} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		
		// UMA DAS FORMAS DE SE VALIDAR O CADASTRO, VALIDANDO SE A SENHA É IGUAL A SENHA REPITIDA
		// USAMOS A O REQUEST DISPATCHER COM A MENSAGEM, E O SET ATTRIBUTE, SE O CADASTRO ESTIVER ERRADO
		// NO CASO SENHAS DIFERENTES, ENTRA NO CATCH, NÃO DEIXAREMOS REDIRECIONAR PARA A PAGINA
		// CORRETA.
		
		try {
			bo.cadastrar(usuario, rep);
			req.setAttribute("chave", "Usuário cadastrado com sucesoo !!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("chaveErro", e.getMessage());
			req.getRequestDispatcher("cadastro-login.jsp").forward(req, resp);
			

		}
		
		// COLOCAR UMA MENSAGEM PARA O JSP
		
		//req.setAttribute("chave", "Usuário cadastrado com sucesoo !!!");
		
		// REDIRECIONAR PARA O JSP
		
		//req.getRequestDispatcher("login.jsp").forward(req, resp);
		
		
	}
	
}
