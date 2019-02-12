package br.com.fiap.entrada;

import javax.swing.JOptionPane;

public class Magica {
	public static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	public static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	public static double decimal(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	public static boolean logico(String msg){
		if(JOptionPane.showInputDialog(msg).toUpperCase().equals("SIM")){
			return true;
		}else{
			return false;
		}
	}
}
