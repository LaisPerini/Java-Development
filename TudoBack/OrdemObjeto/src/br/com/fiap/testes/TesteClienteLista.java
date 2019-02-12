package br.com.fiap.testes;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class TesteClienteLista {

	public static void main(String[] args) {
		ClienteDAO dao = null;
		try{
			dao = new ClienteDAO();
			List<Cliente> lista = dao.getListarNivel
					(Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde estrelas")));
			for(Cliente c : lista){
				System.out.println(c.getNome());
				System.out.println(c.getNumero());
				System.out.println();
			}
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
