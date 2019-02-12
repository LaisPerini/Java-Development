package br.com.fiap.beans;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public String getAll(){
		// 	VOU ESQUECER NA PROVA
		return super.getAll() + "\n" +
				projetoConclusao + "\n" + 
				cargaHorariaEstagio;
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
	}
	public Bacharelado() {
		super();
	}
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

}
