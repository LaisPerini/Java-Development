package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Corretor;

public class CorretorBO {

private static List<Corretor> lista = new ArrayList<Corretor>();
	
	public void cadastrar(Corretor corretor){
		corretor.setCodigo(lista.size() + 1);
		lista.add(corretor);
	}
	
	public List<Corretor> listar(){
		return lista;
	}
}
