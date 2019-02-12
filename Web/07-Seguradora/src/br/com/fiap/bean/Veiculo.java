package br.com.fiap.bean;

public class Veiculo {
	
	private long codigo;
	
	private String modelo; 
	
	private double valor;
	
	private String montadora;
	
	private int ano;

	public Veiculo(long codigo, String modelo, double valor, String montadora, int ano) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.valor = valor;
		this.montadora = montadora;
		this.ano = ano;
	}
	
	public Veiculo(){}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
