package br.com.fiap.beans;

public class Produto {
private String descricao;
private int codigo;
private double valor;
private String categoria;
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public Produto(String descricao, int codigo, double valor, String categoria) {
	super();
	this.descricao = descricao;
	this.codigo = codigo;
	this.valor = valor;
	this.categoria = categoria;
}
public Produto() {
	super();
}

}
