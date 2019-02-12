package br.com.fiap.beans;

public class ClienteJuridico extends Pessoa{
private String cnpj;
private String ie;
private String atividadePrincipal;

public String getAll(){
	return super.getAll() + "\n" + 
			cnpj + "\n" + 
			ie + "\n" + 
			atividadePrincipal;
}

public void setAll(int codigo, String nome, String endereco, String telefone, String cnpj, String ie,
		String atividadePrincipal) {
	
	super.setAll(codigo, nome, endereco, telefone);
	setCnpj(cnpj);
	setIe(ie);
	setAtividadePrincipal(atividadePrincipal);
}

public ClienteJuridico() {
	super();
}
public ClienteJuridico(int codigo, String nome, String endereco, String telefone, String cnpj, String ie,
		String atividadePrincipal) {
	super(codigo, nome, endereco, telefone);
	setCnpj(cnpj);
	setIe(ie);
	setAtividadePrincipal(atividadePrincipal);
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getIe() {
	return ie;
}
public void setIe(String ie) {
	this.ie = ie;
}
public String getAtividadePrincipal() {
	return atividadePrincipal;
}
public void setAtividadePrincipal(String atividadePrincipal) {
	this.atividadePrincipal = atividadePrincipal;
}

}
