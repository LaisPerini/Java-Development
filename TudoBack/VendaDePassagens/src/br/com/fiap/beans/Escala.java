package br.com.fiap.beans;

public class Escala {
	private String local;
	private String duracao;
	private String tipo;
	public String getAll(){
		return local + "\n" + 
				duracao + "\n" +
				tipo;
	}
	public void setAll(String local, String duracao, String tipo) {
		setLocal(local);
		setDuracao(duracao);
		setTipo(tipo);
	}

	public Escala(String local, String duracao, String tipo) {
		setLocal(local);
		setDuracao(duracao);
		setTipo(tipo);
	}
	public Escala() {
		super();
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
