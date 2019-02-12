package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Autor;
import br.com.fiap.modelo.Editora;
import br.com.fiap.modelo.Livro;

public class Principal {
	
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	static double decimal(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	public static void main(String[] args) {
		Livro objLivro = new Livro(
				inteiro("Digite o ISBN"), 
				texto("Digite o título"), 
				decimal("Digite o valor"), 
				new Autor(
						texto("Digite o Autor"),
						texto("Digite o Email")
						), 
				new Editora(
						texto("Digite a Editora"),
						texto("Digite o fone da Editora")
						)
				);
		System.out.println(objLivro.getAll());
		System.out.println(objLivro.getAutor().getPrimeiroNome());
	}

}
