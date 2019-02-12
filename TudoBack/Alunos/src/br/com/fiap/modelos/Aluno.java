package br.com.fiap.modelos;

public class Aluno {
	private String nome;
	private int rm;
	private String cpf;
	private Endereco endereco;
	private Telefone fone;
	
	public Aluno
		(String n, int r, String c, 
		Endereco e, Telefone t){
		nome=n;
		rm=r;
		cpf=c;
		endereco=e;
		fone=t;
	}
	
	public Aluno(){}
	
	public Aluno(Endereco e){
		endereco=e;
	}
	
	public Telefone getFone() {
		return fone;
	}
	public void setFone(Telefone fone) {
		this.fone = fone;
	}
	//Atualizar inserirTudo() e exibirTudo()
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String exibirTudo(){
		return nome + "\n" +
				rm + "\n" +
				cpf + "\n" +
				endereco.exibirTudo() + "\n" +
				fone.getAll();
	}
	
	public void inserirTudo
	(String n, int r, String c, 
	Endereco e, Telefone t){
		nome=n;
		cpf=c;
		rm=r;
		endereco=e;
		fone=t;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
