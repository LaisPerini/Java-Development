package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.ClienteBO2;

public class TesteCadastrarCliente3 {

	public static void main(String[] args) {
		String nome = (JOptionPane.showInputDialog("Digite o nome"));
		int numero = 
			(Integer.parseInt
			(JOptionPane.showInputDialog
			("Digite o número")));
		int estrelas =
			(Integer.parseInt
			(JOptionPane.showInputDialog
			("Digite a quantidade de estrelas:")));
		try{
			System.out.println(ClienteBO2.novoCliente(nome, numero, estrelas));
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

}




