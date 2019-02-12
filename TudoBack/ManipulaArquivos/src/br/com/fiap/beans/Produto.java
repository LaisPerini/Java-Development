package br.com.fiap.beans;

import java.io.Serializable;

public class Produto implements Comparable<Produto>, Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String revendedor;
	private String memoria;
	private String velocidade;
	
	public int compareTo(Produto outro){
		return this.nome.compareTo(outro.nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRevendedor() {
		return revendedor;
	}
	public void setRevendedor(String revendedor) {
		this.revendedor = revendedor;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	public Produto(String nome, String revendedor, String memoria, String velocidade) {
		super();
		this.nome = nome;
		this.revendedor = revendedor;
		this.memoria = memoria;
		this.velocidade = velocidade;
	}
	public Produto() {
		super();
	}

}
