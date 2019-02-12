package br.com.fiap.modelos;

public class Telefone {
private String numero;
private int ddd;
private String tipo;

public void setAll(String numero, int ddd, String tipo) {
	this.numero = numero;
	this.ddd = ddd;
	this.tipo = tipo;
}

public String getAll(){
	return tipo + " :" + "("+ddd+")"+" " + numero; 
}

public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public int getDdd() {
	return ddd;
}
public void setDdd(int ddd) {
	this.ddd = ddd;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Telefone(String numero, int ddd, String tipo) {
	super();
	this.numero = numero;
	this.ddd = ddd;
	this.tipo = tipo;
}
public Telefone() {
	super();
}

}
