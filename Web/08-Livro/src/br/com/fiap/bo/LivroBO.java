package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Livro;

public class LivroBO {
	
private static List<Livro> lista = new ArrayList<Livro>();
	

public void cadastrar(Livro livro){
	lista.add(livro);
}

public List<Livro> listar(){
	return lista;
}

public void atualizar(Livro livro) throws Exception{
	Livro l = buscarPorIsbn(livro.getIsbn());
	if(livro.getTitulo() == null || livro.getTitulo().length() < 2){
		throw new Exception("Título inválido ! ");
	}
	lista.remove(l);
	lista.add(livro);
}

public void excluir(long isbn) throws Exception{
	Livro livro = buscarPorIsbn(isbn);
	if (livro != null){
		lista.remove(livro);
	}else{
	throw new Exception("Livro não encontrado!");
	}
}

public Livro buscarPorIsbn(long isbn){
	for (Livro livro : lista) {
		if (livro.getIsbn() == isbn)
			return livro;
	}
	return null;
}

 
}
