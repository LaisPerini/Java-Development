package br.com.fiap.modelo;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private boolean estendido;
	private int cargaHorariaEstagio;
	
	
	
	public String getAll() {
		return super.getAll() + "\n" + projetoConclusao + "\n" + estendido + "\n" + cargaHorariaEstagio;
	}	
	
	
	public void setAll(String descricao, double valor, int duracao, String sigla, String projetoConclusao,
			boolean estendido, int cargaHorariaEstagio) {
		super.setAll(descricao, valor, duracao, sigla);
		this.projetoConclusao = projetoConclusao;
		this.estendido = estendido;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	
	
	
	
	
	public Bacharelado() {
		super();
	}


	public Bacharelado(String descricao, double valor, int duracao, String sigla, String projetoConclusao,
			boolean estendido, int cargaHorariaEstagio) {
		super(descricao, valor, duracao, sigla);
		this.projetoConclusao = projetoConclusao;
		this.estendido = estendido;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		
	}
	
	
	


	public Bacharelado(String descricao, double valor, int duracao, String sigla) {
		super(descricao, valor, duracao, sigla);
	}


	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public boolean isEstendido() {
		return estendido;
	}
	public void setEstendido(boolean estendido) {
		this.estendido = estendido;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	
	

}
