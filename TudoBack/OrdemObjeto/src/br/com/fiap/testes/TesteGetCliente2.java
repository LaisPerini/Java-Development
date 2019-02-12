package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.ClienteBO;

public class TesteGetCliente2 {

	public static void main(String[] args) {
		try{
			Cliente cli = ClienteBO.consultarPorCodigo(Integer.parseInt
					(JOptionPane.showInputDialog
					("Digite o número")));
			System.out.println(cli.getNome());
			System.out.println(cli.getQtdeEstrelas());
			//INICIO DO CODIGO DEVIDO A INCLUSÃO DO TELEFONE
			for(Telefone t : cli.getFones()){
				System.out.println("("+t.getDdd() + ") " + 
									t.getNumero());
				System.out.println(t.getOperadora());
			}
			// FIM
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
