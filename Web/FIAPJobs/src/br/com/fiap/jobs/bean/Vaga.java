package br.com.fiap.jobs.bean;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class Vaga implements Serializable{

	private int id;
	
	private String titulo;
	
	private String cargo;
	
	private double salario;
	
	private String descricao;
	
	private Calendar dataAnuncio;
	
	private int quantidade;
	
	private Empresa empresa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Calendar getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(Calendar dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}
}
