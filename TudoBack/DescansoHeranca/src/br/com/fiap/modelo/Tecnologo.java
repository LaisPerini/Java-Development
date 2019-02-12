package br.com.fiap.modelo;

public class Tecnologo extends Formacao{
	private boolean estendido;
	private String am;
	
	
	public String getAll() {
		return super.getAll() + "\n" + estendido + "\n" + am;
	}
	
	
	
	
	public Tecnologo() {
		super();
	}




	public void setAll(String descricao, double valor, int duracao, String sigla, boolean estendido, String am) {
		super.setAll(descricao, valor, duracao, sigla);
		setEstendido(estendido);
		setAm(am);
	}
	
	
	
	public Tecnologo(String descricao, double valor, int duracao, String sigla, boolean estendido, String am) {
		super(descricao, valor, duracao, sigla);
		this.estendido = estendido;
		this.am = am;
	}
	public boolean isEstendido() {
		return estendido;
	}
	public void setEstendido(boolean estendido) {
		this.estendido = estendido;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	
	
	

}
