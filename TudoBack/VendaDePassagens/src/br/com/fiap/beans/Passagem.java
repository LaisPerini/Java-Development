package br.com.fiap.beans;

public class Passagem {
	private int numero;
	private double valor;
	private Pessoa cliente;
	private Voo voo;
	
	public String getAll(){
		return numero + "\n" +
				valor + "\n" + 
				cliente.getAll() + "\n" + 
				voo.getAll();
	}
	
	public void setAll(int numero, double valor, Pessoa cliente, Voo voo) {
		setNumero(numero);
		setValor(valor);
		setCliente(cliente);
		setVoo(voo);
	}
	
	public Passagem(int numero, double valor, Pessoa cliente, Voo voo) {
		super();
		setNumero(numero);
		setValor(valor);
		setCliente(cliente);
		setVoo(voo);
	}
	public Passagem() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}


}
