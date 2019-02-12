package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.ClienteBO;
import br.com.fiap.excecoes.Excecao;

public class TesteCadastrarCliente2 {

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
		
		//inicio - codigo alterado pela inclusão do Telefone
		Telefone fone = new Telefone();
		List<Telefone> fones = new ArrayList<Telefone>();
		do{
			fone = new Telefone();
			fone.setDdd(Integer.parseInt
					(JOptionPane.showInputDialog("DDD")));
			fone.setNumero(JOptionPane.showInputDialog("Numero"));
			fone.setOperadora(JOptionPane.showInputDialog("Operadora"));
			fones.add(fone);
		}while(JOptionPane.showConfirmDialog
				(null, "Continuar?", "Add Telefone",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE)==0);
		obj.setFones(fones);
		//fim
		
		try{
			System.out.println(ClienteBO.novoCliente(obj));
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}		
	}

}




