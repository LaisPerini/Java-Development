package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Veiculo;

public class VeiculoBO {

	private static List<Veiculo> lista = new ArrayList<Veiculo>();
	
	public void cadastrar(Veiculo veiculo){
		veiculo.setCodigo(lista.size() + 1);
		lista.add(veiculo);
	}
	
	public List<Veiculo> listar(){
		return lista;
	}
	
}
