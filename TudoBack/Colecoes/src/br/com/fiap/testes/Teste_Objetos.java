package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class Teste_Objetos {

	public static void main(String[] args) {
		List<Cargo> cargos = new ArrayList<Cargo>();
		cargos.add(new Cargo("DBA","JUNIOR",7000));
		cargos.add(new Cargo("Estagiario","Pleno",1200));
		cargos.add(new Cargo("Desenvolvedor","Senior",4000));
		System.out.println(cargos);
		Collections.sort(cargos);
		for(Cargo c : cargos){
			System.out.println("=============");
			System.out.println(c.getCargo());
			System.out.println(c.getNivel());
			System.out.println(c.getSalario());
		}
	}

}










