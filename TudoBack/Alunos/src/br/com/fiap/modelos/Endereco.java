package br.com.fiap.modelos;

public class Endereco {
private String logradouro;
private String cidade;
private String bairro;
private String cep;
private String complemento;
private String numero;


public Endereco() {
	super();
}
public Endereco(String logradouro, String cidade, String bairro, String cep, String complemento, String numero) {
	super();
	this.logradouro = logradouro;
	this.cidade = cidade;
	this.bairro = bairro;
	this.cep = cep;
	this.complemento = complemento;
	this.numero = numero;
}
public void inserirTudo
	(String l, String cid, String b, 
	String cep, String comp, String num){
	logradouro=l;
	cidade=cid;
	bairro=b;
	this.cep=cep;
	complemento=comp;
	numero=num;
}
public String exibirTudo(){
	return logradouro + "\n" +
			bairro + "\n" +
			cidade + "\n" +
			cep + "\n" +
			complemento + "\n" +
			numero;
}




public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}

}
