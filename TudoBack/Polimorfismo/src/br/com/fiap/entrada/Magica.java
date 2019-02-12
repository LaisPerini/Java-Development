package br.com.fiap.entrada;

import javax.swing.JOptionPane;

public class Magica {
	public static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}

	public static int inteiro(String msg){
		return Integer.parseInt(texto(msg));
	}
	public static double decimal(String msg){
		return Double.parseDouble(texto(msg));
	}
	public static boolean logico(String msg){
		String resposta = texto(msg).toUpperCase();
		if (resposta.equals("SIM")){
			return true;
		}else{
			return false;
		}
	}
}









