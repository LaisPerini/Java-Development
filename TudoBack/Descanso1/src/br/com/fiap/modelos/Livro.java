package br.com.fiap.modelos;

public class Livro extends Produto{
	private int isbn;
	private String autor;
	private String editora;

	public Livro(String descricao, double valor, boolean lancamento, Fornecedor fabricante, int isbn, String autor,
			String editora) {
		super(descricao, valor, lancamento, fabricante);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}


	public Livro() {
		super();
	}

	public String getAll(){
		return isbn + "\n" + editora + "\n" + autor;
	}

	public void setAll(int isbn, String autor, String editora) {
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

}
