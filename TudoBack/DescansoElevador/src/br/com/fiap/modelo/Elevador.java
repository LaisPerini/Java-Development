package br.com.fiap.modelo;

public class Elevador {
	private int qtdePessoas;
	private int andarAtual;
	private int capacidadePessoas;
	private int totalAndares;
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	public void inicializar(int c, int t){
		capacidadePessoas=c;
		totalAndares=t;
	}
	public void entrar(){
		if (qtdePessoas<capacidadePessoas){
			qtdePessoas++;	
			//qtdePessoas = qtdePessoas + 1;
			//qtdePessoas+=1;
		}
	}
	public void sair(){
		if(qtdePessoas>0){
			qtdePessoas--;
		}
	}
	public void subir(){
		if(andarAtual<totalAndares){
			andarAtual++;
		}
	}
	public void descer(){
		if(andarAtual>0){
			andarAtual--;
		}
	}

	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public Elevador(int qtdePessoas, int andarAtual, int capacidadePessoas, int totalAndares) {
		super();
		this.qtdePessoas = qtdePessoas;
		this.andarAtual = andarAtual;
		this.capacidadePessoas = capacidadePessoas;
		this.totalAndares = totalAndares;
	}
	public Elevador() {
		super();
	}
	public void setAll(int qtdePessoas, int andarAtual, int capacidadePessoas, int totalAndares) {
		this.qtdePessoas = qtdePessoas;
		this.andarAtual = andarAtual;
		this.capacidadePessoas = capacidadePessoas;
		this.totalAndares = totalAndares;
	}

	public String getAll(){
		return "Pessoas no Elevador: " + qtdePessoas + "\n" +
				"Andar atual: " + andarAtual+ "\n" + 
				"Capacidade máxima: " + capacidadePessoas + "\n" + 
				"Total de Andares: " + totalAndares; 
	}
}
