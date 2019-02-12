package br.com.fiap.modelo;

public class Autor {
	private String nome;
	private String email;
	public String getPrimeiroNome(){
		return nome.substring(0, nome.indexOf(' '));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf('@')>0){
			this.email = email.toLowerCase();
		}
	}
	public Autor(String nome, String email) {
		super();
		this.nome = nome.toUpperCase();
		this.email = email.toLowerCase();
	}
	public Autor() {
		super();
	}
	public void setAll(String nome, String email) {
		this.nome = nome.toUpperCase();
		this.email = email.toLowerCase();
	}

	public String getAll() {
		return nome + "\n" + email;
	}

}
