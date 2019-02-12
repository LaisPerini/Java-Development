package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.ClienteBO;

public class TesteExcluirClientePorNome2 {

	public static void main(String[] args) {
		try{
			String n = JOptionPane.showInputDialog("Nome").toUpperCase();
			System.out.println(ClienteBO.apagarPorNome(n) + 
					" cliente(s) foi(ram) apagado(s)!");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
