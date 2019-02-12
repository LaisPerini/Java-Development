package br.com.fiap.teste;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.jobs.bean.Empresa;
import br.com.fiap.jobs.bean.Vaga;
import br.com.fiap.jobs.bo.EmpresaBO;
import br.com.fiap.jobs.bo.VagaBO;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
		EmpresaBO empresaBO = new EmpresaBO();
		Empresa empresa = new Empresa();
		empresa.setLocal("Sampa");
		empresa.setNome("FIAP Paulista");
		empresa.setNumeroFuncionarios(400);
		empresa.setPorte("Grande");
		//empresa.setId(2);
		
		empresaBO.inserir(empresa);
		
		
		VagaBO vagaBO = new VagaBO();
		
		Vaga vaga = new Vaga();
		vaga.setCargo("Analista 2");
		vaga.setDataAnuncio(Calendar.getInstance());
		vaga.setDescricao("Bom 2 ");
		vaga.setQuantidade(8);
		vaga.setTitulo("Analista Senior 2");
		vaga.setSalario(20020);
		vaga.setEmpresa(empresa);
		
		//vaga.setId(2);
		//vagaBO.inserir(vaga);
		//vagaBO.listarTodos();
		//vagaBO.buscarPorId(2);
		//vagaBO.alterar(vaga);
		//vagaBO.removerPorID(2);
		//testInsert(empresaBO);
		//testLista(empresaBO);
		//testBusca(empresaBO);
	}

	private static void testBusca(EmpresaBO empresaBO) throws SQLException {
		Empresa empresa = empresaBO.buscarPorId(0);
		imprime(empresa);
	}

	private static void testInsert(EmpresaBO empresaBO) throws SQLException {
		Empresa empresa = new Empresa();
		empresa.setLocal("São Paulo");
		empresa.setNome("FIAP");
		empresa.setNumeroFuncionarios(200);
		empresa.setPorte("Pequeno");
		
		
		empresaBO.inserir(empresa);
	}

	private static void testLista(EmpresaBO empresaBO) throws SQLException {
		List<Empresa> lista = empresaBO.listarTodos();
		
		for (Empresa empresa2 : lista) {
			imprime(empresa2);
		}
	}
	
	private static void imprime(Empresa empresa){
		System.out.println(empresa.getId());
		System.out.println(empresa.getNome());
		System.out.println(empresa.getLocal());
		System.out.println(empresa.getNumeroFuncionarios());
		System.out.println(empresa.getPorte());
	}
}
