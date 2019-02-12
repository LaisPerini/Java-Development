package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.excecao.Excecao;

public class ManipulaExcecao {

	public static void main(String[] args) {
		byte churros=0;
		try{
			churros = Byte.parseByte
				(JOptionPane.showInputDialog
				("Digite um número"));
			int xpto[] = new int[2];
			xpto[2]=10;
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println(Excecao.getExcecao(e));
		}finally{
			System.out.println("O número é: " + churros);
		}
	}
}
