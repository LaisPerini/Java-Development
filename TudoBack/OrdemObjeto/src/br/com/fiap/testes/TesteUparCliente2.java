package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.ClienteBO;

public class TesteUparCliente2 {

	public static void main(String[] args) {
		try{
			int n = Integer.parseInt(
					JOptionPane.showInputDialog("Numero"));
			System.out.println(ClienteBO.aumentarEstrela(n));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
