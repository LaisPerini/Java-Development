package br.com.fiap.modelo;

public class Medio extends Formacao {
	private String coordenadorPedagogico;
	private String tipo;
	
	public String getAll() {
		return super.getAll() + "\n" + coordenadorPedagogico + "\n" + tipo;
	}
	
	
	public void setAll
	(String descricao, double valor, int duracao, String sigla) {
		super.setAll(descricao, valor, duracao, sigla);
		
	}
	
	
	
	public Medio() {
		super();
	}


	//devera retornar o primeiro nome do coordenador
	public String getPrimeiroNome() {
		if(coordenadorPedagogico.indexOf(" ")>0) {
			return coordenadorPedagogico.substring(0,coordenadorPedagogico.indexOf(""));
		}else {
			return coordenadorPedagogico;
		}
	}
					
	
	
	public Medio(String descricao, double valor, int duracao, String sigla) {
		super(descricao, valor, duracao, sigla);
	}
	public String getCoordenadorPedagogico() {
		return coordenadorPedagogico;
	}
	public void setCoordenadorPedagogico(String coordenadorPedagogico) {
		this.coordenadorPedagogico = coordenadorPedagogico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
