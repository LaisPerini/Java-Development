package br.com.fiap.beans;

import java.util.List;

public class Veiculo implements Comparable<Veiculo>{
	private int ano;
	private String modelo;
	private String montadora;
	private double valor;
	private List<Acessorio> acessorios;
	
	public int compareTo(Veiculo outro){
		if (this.valor>outro.valor){
			return 1;
		}else if (this.valor<outro.valor){
			return -1;
		}else{
			return 0;
		}
	}

	public Veiculo(int ano, String modelo, String montadora, double valor, List<Acessorio> acessorios) {
		super();
		this.ano = ano;
		this.modelo = modelo;
		this.montadora = montadora;
		this.valor = valor;
		this.acessorios = acessorios;
	}

	public Veiculo() {
		super();
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public List<Acessorio> getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


}
