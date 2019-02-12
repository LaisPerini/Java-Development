package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/buscar")
public class AlunoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nmAluno = req.getParameter("nome");
		
		
		  PrintWriter out = resp.getWriter();
	     resp.setContentType("text/html");
	  
	 
		   out.println("<html><head><title></title></head><body><h1>" +nmAluno+" Bem vindo ao portal do Aluno !"+"</h1></body></html>");
		   System.out.println("Aluno pesquisado : "+nmAluno);
		
	}

}
