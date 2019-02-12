package br.com.fiap.testes;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.ClienteBO;

public class TesteClienteLista2 {

	public static void main(String[] args) {
		try{
			List<Cliente> lista = ClienteBO.consultarPorNivel
					(Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde estrelas")));
			for(Cliente c : lista){
				System.out.println(c.getNome());
				System.out.println(c.getNumero());
				System.out.println();
				for (Telefone t : c.getFones()){
					System.out.println(t.getDdd());
					System.out.println(t.getNumero());
					System.out.println(t.getOperadora());
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
