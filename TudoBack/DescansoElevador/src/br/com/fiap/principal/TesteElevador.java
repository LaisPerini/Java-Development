package br.com.fiap.principal;

import br.com.fiap.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.inicializar(2, 3);
		System.out.println(elevador.getAll());
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.descer();
		elevador.subir();
		System.out.println(elevador.getAll());
	}

}
