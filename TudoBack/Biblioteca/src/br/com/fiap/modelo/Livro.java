package br.com.fiap.modelo;

public class Livro {
	private int isbn;
	private String titulo;
	private double valor;
	private Autor autor;
	private Editora editora;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo.length()>3){
			this.titulo = titulo.toUpperCase();
		}
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor>0){
			this.valor = valor;
		}
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Livro(int isbn, String titulo, double valor, Autor autor, Editora editora) {
		super();
		this.isbn = isbn;
		setTitulo(titulo);
		this.valor = valor;
		this.autor = autor;
		this.editora = editora;
	}
	public Livro() {
		super();
	}
	public void setAll(int isbn, String titulo, double valor, Autor autor, Editora editora) {
		this.isbn = isbn;
		setTitulo(titulo);
		this.valor = valor;
		this.autor = autor;
		this.editora = editora;
	}
	public String getAll(){
		return isbn + "\n" +
				titulo + "\n" + 
				valor + "\n" + 
				autor.getAll() + "\n" + 
				editora.getAll();
	}
}
