package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteCadastrarCliente {

	public static void main(String[] args) {
		Cliente obj = new Cliente();
		obj.setNome(JOptionPane.showInputDialog("Digite o nome"));
		obj.setNumero
			(Integer.parseInt
			(JOptionPane.showInputDialog
			("Digite o número")));
		obj.setQtdeEstrelas
			(Integer.parseInt
			(JOptionPane.showInputDialog
			("Digite a quantidade de estrelas:")));
		ClienteDAO dao = null;
		try{
			dao = new ClienteDAO();
			System.out.println(dao.inserir(obj));
			System.out.println(dao.fechar());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}




