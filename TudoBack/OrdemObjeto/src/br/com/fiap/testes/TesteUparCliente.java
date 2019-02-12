package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ClienteDAO;

public class TesteUparCliente {

	public static void main(String[] args) {
		ClienteDAO dao = null;
		try{
			int n = Integer.parseInt(
					JOptionPane.showInputDialog("Numero"));
			dao = new ClienteDAO();
			System.out.println(dao.elevarNivel(n));
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
