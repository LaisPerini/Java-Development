package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteGetCliente {

	public static void main(String[] args) {
		ClienteDAO dao = null;
		try{
			dao = new ClienteDAO();
			int numero = 
					Integer.parseInt
					(JOptionPane.showInputDialog
					("Digite o número"));
			Cliente cli = dao.getCliente(numero);
			System.out.println(cli.getNome());
			System.out.println(cli.getQtdeEstrelas());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				System.out.println(dao.fechar());
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
