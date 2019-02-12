package br.com.fiap.modelo;

public class Editora {
	private String razaoSocial;
	private String fone;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone.toUpperCase();
	}
	public Editora(String razaoSocial, String fone) {
		super();
		this.razaoSocial = razaoSocial.toUpperCase();
		this.fone = fone.toUpperCase();
	}
	public Editora() {
		super();
	}
	public void setAll(String razaoSocial, String fone) {
		this.razaoSocial = razaoSocial.toUpperCase();
		this.fone = fone.toUpperCase();
	}
	public String getAll(){
		return razaoSocial + "\n" + fone;
	}
}
