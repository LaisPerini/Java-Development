package br.com.fiap.beans;

public class Voo {
	private String numero;
	private String origem;
	private String destino;
	private Escala escala;

	public String getAll(){
		return numero + "\n" +
				origem + "\n" +
				destino + "\n" +
				escala.getAll();
	}
	public void setAll(String numero, String origem, String destino, Escala escala) {
		setNumero(numero);
		setOrigem(origem);
		setDestino(destino);
		setEscala(escala);
	}
	
	public Voo() {
		super();
	}
	public Voo(String numero, String origem, String destino, Escala escala) {
		super();
		setNumero(numero);
		setOrigem(origem);
		setDestino(destino);
		setEscala(escala);
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}


}
