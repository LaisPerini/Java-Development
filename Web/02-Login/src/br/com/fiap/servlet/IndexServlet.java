package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// -------------FORMA DE MAPEAR A SERVLET NO LUGAR DA WEB.XML --------------------
// ----------------- >>>>  @WebServlet("/logar") --> vai para o ACTION DO FORM !!!
//Nâo esquecer da barra na hora de mapear URL, sem ela é "ZERO" na PS

public class IndexServlet extends HttpServlet {
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//Lembrar de apagar as duas primeiras linhas que fazem referência a superclasse
	  
	//Recuperando os dados digitados do login e da senha
	String login = req.getParameter("login");
	String senha = req.getParameter("senha");
	String login1 = "fiap";
	String senha1= "2016";
	
	
	//Validação do Usuario e senha
	if(login.equals(login1) && senha.equals(senha1)){
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<html><body><h1>"+"Login feito com sucesso !"+"</h1></body></html>");
	}else{
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<html><body><h1>"+"O Login está incorreto !"+"</h1></body></html>");
	}
	
	
	//---------- FORMA QUE O PROFESSOR RESOLVEU --------------
	
	//Recuperar informações da tela
	
	    //String usuario = req.getParameter("login");
	    //String senha = req.getParameter("senha");
	
	//Validar o usuário e sua senha
	
	     //PrintWriter out = resp.getWriter();
	     //resp.setContentType("text/html");
	  
	     //if(usuario.equals("FIAP") && senha.equals("2016")){
		     //out.println("<html><head><title></title></head><body><h1>Bem vindo !</h1></body></html>");
	     //}else{
		     //out.println("<html><head><title></title></head><body><h1>Errou !</h1></body></html>");
	     //}
	
	//Devolver uma informação para o usuário
	
	
 }
  
  
}
