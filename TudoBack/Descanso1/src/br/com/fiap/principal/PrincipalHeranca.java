package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.entrada.Magica;
import br.com.fiap.modelos.CD;
import br.com.fiap.modelos.Fornecedor;
import br.com.fiap.modelos.Livro;
import br.com.fiap.modelos.Produto;
import br.com.fiap.modelos.Telefone;

public class PrincipalHeranca {

	public static void main(String[] args) {
		char opcao=JOptionPane.showInputDialog("Digite \"C\" para CD ou \"L\" para Livro").toUpperCase().charAt(0);
		Produto objeto=null;
		if (opcao=='C'){
			objeto = new CD(
					Magica.texto("Descrição"), 
					Magica.decimal("Valor"), 
					Magica.logico("Lançamento?"), 
					new Fornecedor(
							Magica.texto("Razão Social"), 
							Magica.texto("CNPJ"), 
							new Telefone(
									Magica.texto("Fone"), 
									Magica.inteiro("DDD"), 
									Magica.texto("Tipo")
									)
							), 
					Magica.inteiro("Total Faixas"),
					Magica.texto("Artista"), 
					Magica.texto("Genero")
					);
		}else if (opcao=='L'){
			objeto = new Livro(
			
					Magica.texto("Descrição"), 
					Magica.decimal("Valor"), 
					Magica.logico("Lançamento?"), 
					new Fornecedor(
							Magica.texto("Razão Social"), 
							Magica.texto("CNPJ"), 
							new Telefone(
									Magica.texto("Fone"), 
									Magica.inteiro("DDD"), 
									Magica.texto("Tipo")
									)
							), 
					Magica.inteiro("ISBN"), 
					Magica.texto("Autor"),
					Magica.texto("Editora")
					);
		}else{
			System.out.println("Opção inválida!");
		}// fecha o if
		System.out.println(objeto.getAll());
	}// fecha o método main
} // fecha a classe
