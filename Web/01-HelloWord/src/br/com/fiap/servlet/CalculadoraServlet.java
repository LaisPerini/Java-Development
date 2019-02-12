package br.com.fiap.servlet;

import java.io.IOException;
//import java.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Recuperando dados digitados
		int num1 = Integer.parseInt(req.getParameter("numero1"));
		int num2 = Integer.parseInt(req.getParameter("numero2"));
		String op = (req.getParameter("operacao"));
		
		//Declarando as operações desejadas com os dados digitados
				int soma = num1 + num2;
				int subt = num1 - num2;
				double divisao = num1/num2;
				double mult = num1 * num2;
		
		//Exibindo a resposta para o usuário, neste caso pelo console
		//Usar o sysout !		
				
		if(op.equals("1")){
			System.out.println(num1 +" + "+ num2 +" = " + soma);
		}else if(op.equals("2")){
			System.out.println(num1 +" - "+ num2 +" = " + subt);
		}else if(op.equals("3")){
			System.out.println(num1 +" x "+ num2 +" = " + mult);
		}else if(op.equals("4")){
			System.out.println(num1 +" % "+ num2 +" = " + divisao);
		}
		
		
		
		
		
		

	}
	
}
