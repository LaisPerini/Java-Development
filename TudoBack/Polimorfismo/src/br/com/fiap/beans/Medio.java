package br.com.fiap.beans;

public class Medio extends Formacao{
	private String tipo;

	public String getAll(){
		return super.getAll() + "\n" + getTipo();
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		setTipo(tipo);
	}
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, 
			double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void calcularMensalidade(double fator){
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
}
