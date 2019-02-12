package br.com.fiap.beans;

import java.util.List;

public class Cliente {
	private String nome;
	private int numero;
	private int qtdeEstrelas;
	private List<Telefone> fones;
	public Cliente(String nome, int numero, int qtdeEstrelas, List<Telefone> fones) {
		super();
		setNome(nome);
		setNumero(numero);
		setQtdeEstrelas(qtdeEstrelas);
		setFones(fones);
	}
	public Cliente() {
		super();
	}
	
	public List<Telefone> getFones() {
		return fones;
	}
	public void setFones(List<Telefone> fones) {
		this.fones = fones;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdeEstrelas() {
		return qtdeEstrelas;
	}
	public void setQtdeEstrelas(int qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}

}












