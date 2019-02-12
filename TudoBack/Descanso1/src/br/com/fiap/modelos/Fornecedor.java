package br.com.fiap.modelos;

public class Fornecedor {
private String razaoSocial;
private String cnpj;
private Telefone fone;

public String getAll(){
	return razaoSocial + "\n" +
			cnpj + "\n" +
			fone.getAll();

}
public void setAll(String razaoSocial, String cnpj, Telefone fone) {
	this.razaoSocial = razaoSocial;
	this.cnpj = cnpj;
	this.fone = fone;
}

public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public Telefone getFone() {
	return fone;
}
public void setFone(Telefone fone) {
	this.fone = fone;
}
public Fornecedor(String razaoSocial, String cnpj, Telefone fone) {
	super();
	this.razaoSocial = razaoSocial;
	this.cnpj = cnpj;
	this.fone = fone;
}
public Fornecedor() {
	super();
}

}
