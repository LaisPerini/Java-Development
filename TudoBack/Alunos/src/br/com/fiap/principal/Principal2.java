package br.com.fiap.principal;

import br.com.fiap.modelos.Aluno;
import br.com.fiap.modelos.Endereco;
import br.com.fiap.modelos.Telefone;

public class Principal2 {

	public static void main(String[] args) {
	Endereco e = new Endereco("Rua X",
				"Sao Paulo",
				"Centro",
				"02202000",
				"",
				"3A"
				);
		Telefone t = new Telefone(
				11,
				"1234-5678",
				"Morto",
				"Celular"
				);
		Aluno a = new Aluno(
				"ANA",
				77777,
				"123456",
				e,
				t
				);
		

	}

}
