package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastrar")
public class ProdutoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String codProduto = req.getParameter("codigo");
		String nomeProduto = req.getParameter("nome");
		String precoProduto = req.getParameter("preco");
		
		if(codProduto.equals("") || nomeProduto.equals("") || precoProduto.equals("")){
			req.setAttribute("qualquer", "Preencha todos os campos do cadastro");
			req.getRequestDispatcher("cadastroProduto.jsp").forward(req, resp);
		}else{
			req.setAttribute("olaproduto",codProduto);
			req.setAttribute("olanome", nomeProduto);
			req.setAttribute("olapreco", precoProduto);
			
			req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
		}
			
		
	}

}
