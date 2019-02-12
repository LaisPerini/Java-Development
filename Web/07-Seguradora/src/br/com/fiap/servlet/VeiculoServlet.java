package br.com.fiap.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Veiculo;
import br.com.fiap.bo.VeiculoBO;

@WebServlet("/veiculo")

public class VeiculoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// RECUPERAR INFORMAÇÕES DO FORMULÁRIO HTML

		String model = req.getParameter("modelo");

		double preco = Double.parseDouble(req.getParameter("valor"));

		int ano = Integer.parseInt(req.getParameter("ano"));

		String monta = req.getParameter("montadora");

		// Cadastrar o veículo no Banco de Dados
		Veiculo veiculo = new Veiculo(0, model, preco, monta, ano);
		VeiculoBO bo = new VeiculoBO();
		bo.cadastrar(veiculo);

		// RETORNA PARA A PÁGINA DE CADASTRO COM UMA MENSAGEM DE SUCESSO

		// MENSAGEM QUE SERÁ EXIBIDA COM SUCESSO
		req.setAttribute("mensagem", "Cadastrado com Sucesso");

		// REDIRECIONAR PARA A PÁGINA DE CADASTRO
		
		req.getRequestDispatcher("veiculo.jsp").forward(req, resp);
		

	}

	
	
	// MÉTODO GET PARA ENVIAR A RESPOSTA QUANDO A SERVLET FOR ACIONADA NA EXECUÇÃO DA PÁGINA
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// LISTA DE VEÍCULOS
		
		//BUSCAR OS VEÍCULOS CADASTRADOS NO BANCO DE DADOS	
		
		VeiculoBO bo = new VeiculoBO();
		
		List<Veiculo> lista = bo.listar();
		
		// PASSAR A LISTA PARA A JSP
		req.setAttribute("modeloChave", lista);
		// REDIRECIONAR PARA A PÁGINA JSP
		req.getRequestDispatcher("lista-veiculo.jsp").forward(req, resp);
		
		
	}
}
