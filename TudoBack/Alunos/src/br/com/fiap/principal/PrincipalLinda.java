package br.com.fiap.principal;

import br.com.fiap.entrada.Magica;
import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class PrincipalLinda {

	public static void main(String[] args) {
		Aluno a = new Aluno(
				Magica.texto("Nome"),
				77,
				"123",
				new Endereco("Rua Olimpiadas", "São Paulo", "Vila Olimpia", "12345000", "", "186"),
				new Telefone(11, "3208-0000", "Vivo", "Comercial")
				);
				
				System.out.println(a.exibirTudo());
	}

}
