package br.com.fiap.principal;

import br.com.fiap.modelos.Fornecedor;
import br.com.fiap.modelos.Produto;
import br.com.fiap.modelos.Telefone;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto(
				"Churros",
				10.5,
				true,
				new Fornecedor(
						"Doce Java",
						"01002003004",
						new Telefone(
								"3208-0777",
								11,
								"Comercial"
								)
						)
				);
		System.out.println(p.getAll());
	}

}
