package br.com.fiap.beans;

public class ClienteFisico extends Pessoa{
private String cpf;
private String rg;
private String dtNascimento;

public String getAll(){
	return super.getAll() + "\n" +
			cpf + "\n" + 
			rg + "\n" + 
			dtNascimento;
}
public void setAll(int codigo, String nome, String endereco, 
		String telefone, String cpf, String rg, String dtNascimento) {
	super.setAll(codigo, nome, endereco, telefone);
	setCpf(cpf);
	setRg(rg);
	setDtNascimento(dtNascimento);
}

public ClienteFisico() {
	super();
}
public ClienteFisico(int codigo, String nome, String endereco, String telefone, String cpf, String rg, String dtNascimento) {
	super(codigo, nome, endereco, telefone);
	setCpf(cpf);
	setRg(rg);
	setDtNascimento(dtNascimento);
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getDtNascimento() {
	return dtNascimento;
}
public void setDtNascimento(String dtNascimento) {
	this.dtNascimento = dtNascimento;
}

}
