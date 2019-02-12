package br.com.fiap.excecao;

import javax.swing.JOptionPane;

public class Excecao extends Exception{
	
	public static String getExcecao(Exception e){
		if (e instanceof ArrayIndexOutOfBoundsException){
			return "Excedeu limite";
		}else if (e instanceof NumberFormatException){
			return "Número inválido";
		}else{
			return "Erro desconhecido";
		}
	}
	
	public Excecao(){
		JOptionPane.showMessageDialog(null, "Deu erro");
	}
	
	public Excecao(Exception e){
		if (e instanceof ArrayIndexOutOfBoundsException){
			System.out.println("Excedeu limite");
		}else if (e instanceof NumberFormatException){
			System.out.println("Número inválido");
		}else{
			System.out.println("Erro desconhecido");
		}
	}
	
	public Excecao(Exception e, String x){
		System.out.println(x);
		if (e instanceof ArrayIndexOutOfBoundsException){
			System.out.println("Excedeu limite");
		}else if (e instanceof NumberFormatException){
			System.out.println("Número inválido");
		}else{
			System.out.println("Erro desconhecido");
		}
	}
	
	
	
}



