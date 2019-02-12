package br.com.fiap.principal;
import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class Principal {

	public static void main(String[] args) {
		Endereco objEndereco = new Endereco();
		Aluno objAluno = new Aluno(objEndereco);
		objAluno.setNome("Ana");
		System.out.println(objAluno.getNome());
		
		Aluno objTudo = new Aluno();
		objEndereco.setLogradouro("Rua X");
		objEndereco.setNumero("3A");
		objEndereco.setCidade("São Paulo");
		// preencher todos os atributos
		Telefone objTelefone = new Telefone();
		objTelefone.setDdd(11);
		objTelefone.setNumero("996151212");
		objTelefone.setOperadora("TOM");
		objTelefone.setTipo("Celular");
		objTudo.inserirTudo
		("Braufagelio", 
		77666, "12345678900",objEndereco, objTelefone);
		System.out.println(objTudo.exibirTudo());
		
		//VOU ERRAR NA PROVA
		//System.out.println
		//	(objEndereco.getLogradouro());
		System.out.println
(objTudo.getEndereco().getLogradouro());
		System.out.println
(objTudo.getFone().getNumero());
		
		
	}

}








