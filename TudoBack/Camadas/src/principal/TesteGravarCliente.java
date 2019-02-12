package principal;

import javax.swing.JOptionPane;

import beans.Cliente;
import dao.ClienteDAO;
import excecao.Excecao;

public class TesteGravarCliente {

	public static void main(String[] args) {
		ClienteDAO dao = null; 
		try{
			dao = new ClienteDAO();
			Cliente obj = new Cliente();
			obj.setNome(JOptionPane.showInputDialog
					("Nome"));
			obj.setNumero(Integer.parseInt
					(JOptionPane.showInputDialog
					("Numero")));
			obj.setQtdeEstrelas(Integer.parseInt
					(JOptionPane.showInputDialog
					("Estrelas")));
			System.out.println(dao.gravar(obj));
		}catch(Exception e){
			System.out.println(e.getMessage());
			//System.out.println(Excecao.ex(e));
		}
		

	}

}
