package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// RECUPERA AS INFORMAÇÕES DO JSP
		String user = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		
		// INSTANCIA O BO
		UsuarioBO bo = new UsuarioBO();
		
		// CHAMA O MÉTODO LOGAR DA BO
		Usuario usuario = bo.logar(user, senha);
		
		// VALIDAR SE ENCONTROU O USUÁRIO
		if(usuario == null){
			req.setAttribute("erro", "Usuário e/ou senha inválidos !");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else{
			
			// RECUPERAR A SESSÃO DO USUÁRIO
			HttpSession session =  req.getSession();
			session.setAttribute("usuario", usuario.getNome());
			req.getRequestDispatcher("home.jsp").forward(req, resp);
					   
			//req.setAttribute("usuario", usuario.getNome());
			//req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// LINK SEMPRE É GET !!!!!!!!!!!!
		
		// RECUPERAR A SESSÃO DO USUÁRIO
		HttpSession session = req.getSession();
		
		// INVALIDAR A SESSÃO 
		session.invalidate();
		
		// REDIRECIONA PARA LOGIN.JSP
		//req.getRequestDispatcher("login.jsp").forward(req, resp);
		resp.sendRedirect("login.jsp");
	}
	
}
