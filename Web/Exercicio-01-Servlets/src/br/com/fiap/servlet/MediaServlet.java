package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MediaServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double notaPS = Double.parseDouble(req.getParameter("ps"));
		double notaNac = Double.parseDouble(req.getParameter("nac"));
		double notaAM = Double.parseDouble(req.getParameter("am"));
		double media=0;
		
		notaPS = notaPS*0.5;
		notaNac = notaNac*0.2;
		notaAM = notaAM*0.3;
		
		media = notaPS+notaNac+notaAM;
		
		if(media>=6){
			
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.print("<html><body><h1>"+"Média : "+media +" ,Parabééns :  aluno aprovado !"+"</h1></body></html>");
			
		}else{
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.print("<html><body><h1>"+"Média : "+media +" ,Sinto Muito :  aluno reprovado !"+"</h1></body></html>");
			
		}
	}

}
