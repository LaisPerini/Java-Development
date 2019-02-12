package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jobs.bean.Empresa;
import br.com.fiap.jobs.bo.EmpresaBO;

@WebServlet("/vagaServlet")
public class vagaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String acao = req.getParameter("acao");
	EmpresaBO bo = new EmpresaBO();
	
	switch (acao){
	case "abrir-cadastro":
		//RECUPERAR TODAS EMPRESAS DO BANCO DE DADOS
		List<Empresa>lista= bo.listarTodos();
		
		//PASSAR A LISTA DE EMPRESA PARA A JSP
		req.setAttribute("listaEmpresa", lista);
		
		//REDIRECIONAR PARA A PAGINA JSP
		req.getRequestDispatcher("cadastro-vaga.jsp").forward(req,resp);
		
		break;
		default:
			break;
	
	
	
	}
		
		
	}
	}


