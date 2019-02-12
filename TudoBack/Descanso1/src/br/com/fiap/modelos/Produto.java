package br.com.fiap.modelos;

public class Produto {
	private String descricao;
	private double valor;
	private boolean lancamento;
	private Fornecedor fabricante;
	
	//Resposta do exercício 5
	public String atualizar(double p){
		valor=valor + valor * (p/100);
		return "Valor atualizado!";
	}

	//Resposta do exercício 4
	public void setBasico(String d, double v){
		descricao=d.toUpperCase();
		valor=v;
		lancamento=true;
		fabricante=null;
	}
	
	//Resposta do exercício 3
	public String getDesconto2(){
		return "Valor com desconto: " + 
				(valor*0.9);
	}
	
	public double getDesconto(){
		return valor * 0.9;
		//return valor - valor * 0.1;
		//return valor - valor * 10/100;
	}
	
	//Resposta do exercício 2
	public Produto(String d, double v, boolean l){
		descricao=d.toUpperCase();
		valor=v;
		lancamento=l;
	}
	
	// Resposta do exercício 1
	public String getBasico(){
		return "Descrição:" + descricao + "\n" + 
				"Valor:" + valor;
	}
	
	public String getAll(){
		return descricao + "\n" +
				valor + "\n" +
				lancamento + "\n" +
				fabricante.getAll();
	}
	public void setAll(String descricao, double valor, boolean lancamento, Fornecedor fabricante) {
		this.descricao = descricao.toUpperCase();
		this.valor = valor;
		this.lancamento = lancamento;
		this.fabricante = fabricante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	public Fornecedor getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fornecedor fabricante) {
		this.fabricante = fabricante;
	}
	public Produto(String descricao, double valor, boolean lancamento, Fornecedor fabricante) {
		super();
		this.descricao = descricao.toUpperCase();
		this.valor = valor;
		this.lancamento = lancamento;
		this.fabricante = fabricante;
	}
	public Produto() {
		super();
	}

}
