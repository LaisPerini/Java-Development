package br.com.fiap.modelos;

public class Telefone {
	private int ddd;
	private String numero;
	private String operadora;
	private String tipo;
	
	public Telefone() {
		super();
	}
	public Telefone(int ddd, String numero, String operadora, String tipo) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
		this.tipo = tipo;
	}
	public String getAll(){
		return ddd + "\n" + 
				numero + "\n" +
				operadora + "\n" +
				tipo;
	}
	public void setAll(int d, String n, 
			String o, String t){
		ddd = d;
		numero=n;
		operadora=o;
		tipo = t;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
