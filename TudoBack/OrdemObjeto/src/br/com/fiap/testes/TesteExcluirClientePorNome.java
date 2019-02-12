package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ClienteDAO;

public class TesteExcluirClientePorNome {

	public static void main(String[] args) {
		ClienteDAO dao = null;
		try{
			String n = JOptionPane.showInputDialog("Nome").toUpperCase();
			dao = new ClienteDAO();
			System.out.println(dao.excluirNome(n) + 
					" cliente(s) foi(ram) apagado(s)!");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				dao.fechar();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
