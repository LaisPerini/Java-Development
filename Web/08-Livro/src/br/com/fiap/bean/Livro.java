package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

public class Livro implements Serializable {
	
	private long isbn;
	private String titulo;
	private int numeroPagina;
	private String autor;
	private Calendar dataPublicacao;
	private Calendar dataRegistro;
	public Livro(long isbn, String titulo, int numeroPagina, String autor, Calendar dataPublicacao,
			Calendar dataRegistro) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.numeroPagina = numeroPagina;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.dataRegistro = dataRegistro;
	}
	
	public Livro() {
		super();
	
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroPagina() {
		return numeroPagina;
	}
	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public Calendar getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Calendar dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	}

	