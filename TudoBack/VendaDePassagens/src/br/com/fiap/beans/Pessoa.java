package br.com.fiap.beans;

public class Pessoa {
private int codigo;
private String nome;
private String endereco;
private String telefone;

public Pessoa() {
	super();
}
public String getAll(){
	return codigo + "\n" + nome + "\n" + endereco + "\n" + telefone + "\n";
}
public void setAll(int codigo, String nome, String endereco, String telefone) {
	setCodigo(codigo);
	setEndereco(endereco);
	setTelefone(telefone);
	setNome(nome);
}
public Pessoa(int codigo, String nome, String endereco, String telefone) {
	super();
	setCodigo(codigo);
	setEndereco(endereco);
	setTelefone(telefone);
	setNome(nome);
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}


}
