package br.com.fiap.principal;

import br.com.fiap.modelos.Produto;

public class Principal2 {

	public static void main(String[] args) {
		Produto objP = new Produto();
		objP.setBasico("Churros", 200);
		System.out.println(objP.getValor());
		System.out.println(objP.getDesconto());
		System.out.println(objP.getValor());
		System.out.println(objP.atualizar(50));
		System.out.println(objP.getValor());
	}

}
