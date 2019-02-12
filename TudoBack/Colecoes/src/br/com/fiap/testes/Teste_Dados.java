package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste_Dados {

	public static void main(String[] args) {
		List<String> cargos = new ArrayList<String>();
		//Set<String> cargos = new HashSet<String>();
		cargos.add("DBA");
		cargos.add("Estagiario");
		cargos.add("Desenvolvedor");
		//cargos.add("Desenvolvedor");
		System.out.println(cargos);
		Collections.sort(cargos);
		System.out.println(cargos);

	}

}






