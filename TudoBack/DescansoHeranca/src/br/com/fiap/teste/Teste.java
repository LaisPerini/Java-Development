package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Bacharelado;
import br.com.fiap.modelo.Formacao;
import br.com.fiap.modelo.Medio;
import br.com.fiap.modelo.Tecnologo;

public class Teste {
    public static void main (String[]args) {

    	
    	Formacao objeto = null;
    	
    	char opcao = JOptionPane.showInputDialog
    ("Digite T - Tecnologo M- Medio  B-Bacharelado").toUpperCase().charAt(0);
    	if (opcao == 'T') {
    		objeto = new Tecnologo();
    		
    	}else if ( opcao == 'B') {
    		objeto = new Bacharelado();
    	
    	}else if (opcao == 'M') {
    		objeto = new Medio();
    	
    	}else {
    	    System.out.println("OPÇÃO INVALIDA");
    	}
    	objeto.definirDuracao();
    	System.out.println(objeto.getDuracao());
    	//System.out.println(objeto.getAll());
    	
    	
    	
    	
    }
}
