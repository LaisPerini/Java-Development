package br.com.fiap.beans;

public class Acessorio implements Comparable<Acessorio>{
	
	private String descricao;
	
	private double valor;
	
	public int compareTo(Acessorio outro){
		return this.descricao.compareTo(outro.descricao);
	}
	
	public Acessorio(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public Acessorio() {
		super();
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
