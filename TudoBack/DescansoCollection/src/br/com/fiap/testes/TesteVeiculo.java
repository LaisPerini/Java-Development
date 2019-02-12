package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;

public class TesteVeiculo {
	static double valorTotalVeiculo(List<Veiculo> lista){
		double total=0;
		for(Veiculo v : lista){
			total+=v.getValor();
		}
		return total;
	}
	public static void main(String[] args) {
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		//INICIO DO CADASTRO DOS VEÍCULOS
		while(JOptionPane.showConfirmDialog
				(null, "Lançar Veiculos?", "Descanso Coleções", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE)==0 && veiculos.size()<6){
			//PREENCHE O VEICULO
			Veiculo v = new Veiculo();
			v.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
			v.setMontadora(JOptionPane.showInputDialog("Digite a montadora"));
			v.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
			v.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
			//CRIA A LISTA PQ O SETACESSORIOS() PRECISA DE UMA LISTA
			List<Acessorio> acessorios = new ArrayList<Acessorio>();
			//INICIO DO CADASTRO DOS ACESSÓRIOS
			while(JOptionPane.showConfirmDialog
					(null, "Acessorios?", "Descanso Coleções", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE)==0 && acessorios.size()<4){
				//PREENCHE O ACESSORIO
				Acessorio a = new Acessorio();
				a.setDescricao(JOptionPane.showInputDialog("Digite a descricao"));
				a.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
				acessorios.add(a); // CADASTRA NA LISTA DE ACESSORIOS
			}
			//PREENCHE O SETACESSORIOS() COM A LISTA JÁ PREENCHIDA
			v.setAcessorios(acessorios); 
			//ADICIONA O VEICULO NA LISTA DE VEICULOS
			veiculos.add(v);
		}
		System.out.println("Valor Total de Veiculos: " + valorTotalVeiculo(veiculos));
	}
}
