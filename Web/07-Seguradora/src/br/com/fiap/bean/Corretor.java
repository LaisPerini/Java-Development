package br.com.fiap.bean;

public class Corretor {
	
	private long codigo;
	
	private String nome;
	
	private String telefone;
	
	private double salario;
	
	private String sexo;

	public Corretor(long codigo, String nome, String telefone, double salario, String sexo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.salario = salario;
		this.sexo = sexo;
	}
	
	public Corretor(){}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
