package br.com.fiap.principal;

import javax.swing.JOptionPane;

import br.com.fiap.modelos.Produto;

public class Principal3 {

	public static void main(String[] args) {
		Produto objProduto = new Produto();
		objProduto.setDescricao
			(JOptionPane.showInputDialog
			("Digite a descrição do produto"));
		objProduto.setValor
			(Double.parseDouble
			(JOptionPane.showInputDialog
			("Digite o valor")));
		if (objProduto.getDescricao().equals("CHURROS")){
			objProduto.setLancamento(false);
		}else{
			objProduto.setLancamento(true);
		}
		System.out.println(objProduto.isLancamento());
		
		if (objProduto.getDescricao().indexOf('@')>=0){
			System.out.println("Existe o arroba");
		}else{
			System.out.println("Sem arroba");
		}
		
		if(objProduto.getDescricao().length()<2){
			System.out.println("Quantidade insuficiente");
		}
		
		String nome = "Paulo Roberto de Souza";
		String novoNome = nome.replace("o ", "a ");
		System.out.println(novoNome);
		
		char lancamento = JOptionPane.showInputDialog
					("Digite <S> para Sim ou <N> para Não").charAt(0);
		if (lancamento=='S' || lancamento =='s'){
			objProduto.setLancamento(true);
		}else if (lancamento=='N' || lancamento=='n'){
			objProduto.setLancamento(false);
		}else{
			System.out.println("Valor inválido");
		}
		
	}

}






