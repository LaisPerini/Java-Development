package br.com.fiap.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Livro;
import br.com.fiap.bo.LivroBO;

@WebServlet("/livroServlet")
public class LivroServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// RECUPERAR A AÇÃO PARA EXCLUIR UM LIVRO
		String acao = req.getParameter("acao");

		// CHAMAR O BO <---> criar uma instância da classe LivroBO --> usar em
		// mais de uma ação, declarar fora do switch
		LivroBO bo = new LivroBO();

		switch (acao) {
		case "excluir":

			// RECUPERAR O ISBN DO FORMULÁRIO DE EXCLUSÃO
			long isbnExcluir = Long.parseLong(req.getParameter("isbn"));

			// CHAMAR O BO PARA EXCLUIR
			try {
				bo.excluir(isbnExcluir);
				// PASSAR MENSAGEM PARA A JSP
				req.setAttribute("mensagem", "Livro Excluído !");
			} catch (Exception e) {
				e.printStackTrace();
				req.setAttribute("mensagem", e.getMessage());

			} finally {
				listarLivro(req, bo);
				
				// REDIRECIONAR PARA ALGUM LUGAR . . .
				req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
			}

			break;

		case "alterar":
			// 	RECUPERAR AS INFORMAÇÕES DO FORMULÁRIO
			Livro li =null;
			try {
	        li = carregarLivroForm(req);
			
			// CHAMA O MÉTODO ATUALIZAR DO BO
				bo.atualizar(li);
			
				// MENSAGEM DE SUCESSO
				req.setAttribute("mensagem", "Livro atualizado com sucesso !");
				
				// MANDAR A LISTA TAMBÉM -- > método criado com refactor -- > extract method (com o bloco de código copiado(selecionado))
				listarLivro(req, bo);
				
				// REDIRECIONA PARA A PÁGINA DE LISTAGEM
				req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				// MENSAGEM DE ERRO
				req.setAttribute("mensagem", e1.getMessage());
				req.setAttribute("livro", li);
				req.getRequestDispatcher("alterar-livro.jsp").forward(req, resp);
			}
	
			break;
		case "cadastrar":
            //  RECUPERANDO VALORES DO FORM
		
			Livro livro;
			try {
				livro = carregarLivroForm(req);
		
			// LivroBO bo = new LivroBO();
			bo.cadastrar(livro);

			// EXIBIR UMA MENSAGEM
			req.setAttribute("chave", "Cadastrado com Sucesso !");
			
			} catch (ParseException e) {
				e.printStackTrace();
			}

			// REDIRECIONAR PARA UMA JSP
			req.getRequestDispatcher("cadastro-livro.jsp").forward(req, resp);

			break;
		default:
			break;
		}

	}

	private void listarLivro(HttpServletRequest req, LivroBO bo) {
		// BUSCAR OS LIVROS CADASTRADOS RESTANTES
		List<Livro> lista = bo.listar();
		// PASSAR A LISTA PARA O JSP
		req.setAttribute("chaveDaLista", lista);
	}

	private Livro carregarLivroForm(HttpServletRequest req) throws ParseException {
		// RECUPERAR OS VALORES DOS FORMULÁRIOS
		long isbn = Long.parseLong(req.getParameter("isbn"));
		String titulo = req.getParameter("titulo");
		int numero = Integer.parseInt(req.getParameter("numero"));
		String autor = req.getParameter("autor");
		
		//RECUPERAR O VALOR DA DATA DO CAMPO FORMULARIO
		String data= req.getParameter("dataPublicacao");
		
		//CONVERTER A STRING PARA O CALENDAR
		//CRIAR O OBJETO QUE CONVERTE AS DATAS
		SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
		
		//CRIAR O OBJETO CALENDAR COM A DATA ATUAL
		Calendar dataPublicacao = Calendar.getInstance();
		
		//ATUALIZAR O OBJETO COM DATA INFORMADA PELO USUARIO
		dataPublicacao.setTime(conversor.parse(data));
	
		// CHAMAR O LIVRO <--> INSTANCIAR O LIVRO
		Livro livro = new Livro(isbn, titulo, numero, autor,dataPublicacao,Calendar.getInstance());
		return livro;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//  RECUPERAR A AÇÃO
		String acao = req.getParameter("acao");
		
		// INSTANCIAR A CLASSE BO
		LivroBO bo = new LivroBO();
		
		switch (acao) {
		case "listar":
			
			// INSTANCIAR A CLASSE BO  <---|
			//LivroBO bo = new LivroBO();--|
			// BUSCAR OS LIVROS CADASTRADOS
			// PASSAR A LISTA PARA O JSP
			listarLivro(req, bo);
			
			// REDIRECIONAR PARA A PÁGINA JSP
			req.getRequestDispatcher("lista-livro.jsp").forward(req, resp);

			break;

		case "abrirForm":
			// RECUPERAR O ISBN DO LINK
			long isbn =Long.parseLong(req.getParameter("isbn"));
			// BUSCAR O LIVRO NO BANCO(BO) USANDO O ISBN
			Livro livro = bo.buscarPorIsbn(isbn);
			// PASSA O LIVRO PARA O JSP
			req.setAttribute("livro", livro);
			// ENCAMINHAR O USUÁRIO PARA O JSP
			req.getRequestDispatcher("alterar-livro.jsp").forward(req, resp);

		default:
			break;
		}
		
	}

}
