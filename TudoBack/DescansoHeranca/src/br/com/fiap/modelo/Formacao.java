package br.com.fiap.modelo;

public class Formacao {
	private String descricao;
	private double valor;
	private int duracao;
	private String sigla;
	
	public void definirDuracao() {
		if(this instanceof Tecnologo) {
			duracao = 24;
		}else if (this instanceof Medio) {
			duracao =36;
		}else {
			if (descricao.indexOf("ENGENHARIA")>=0) {
				duracao = 60;
			}else {
				duracao = 48;
			}
		}
	}
	
	
	
	public String getAll() {
		return 
	descricao + "\n" + valor + "\n" + duracao + "\n" + sigla;
	}
	

	public void setAll(String descricao, double valor, int duracao, String sigla) {
		setDescricao (descricao);
		setValor(valor);
		setDuracao(duracao);
		setSigla(sigla);
		
	}
	
	
	public Formacao(String descricao, double valor, int duracao, String sigla) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.duracao = duracao;
		this.sigla = sigla;
		
	}
	
	public Formacao() {
		super();
	}


	public String getDescricao() {
		return descricao;
	}
	// descricao deve possuir no minimo 5 caracters 
	//e no maximo 30, se tiver menos que deverá retornar "DESCRICAO,
	//SE TIVER MAIS QUE 30 devera retornar somente 30 primeiros"
	public void setDescricao(String descricao) {
		if (descricao.length()<5) {
			this.descricao = "DESCRICAO";
		}else if 
			(descricao.length()>30){
				this.descricao = descricao.substring(0,30);
			}else {
				this.descricao = descricao;
			}
		
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		if(sigla.length()==3) {
		this.sigla = sigla.toUpperCase();
		}else {
			this.sigla = "AAA";
		}
	}


	
	
	

}
