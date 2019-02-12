package br.com.fiap.beans;

public class Cargo implements Comparable<Cargo>{
	private String cargo;
	private String nivel;
	private double salario;
	/*public int compareTo(Cargo outro){
		if(this.salario>outro.salario){
			return 1;
		}else if(this.salario<outro.salario){
			return -1;
		}else{
			return 0;
		}

	}*/
	public int compareTo(Cargo outro){
		return outro.cargo.compareTo(this.cargo);
	}

	public Cargo(String cargo, String nivel, double salario) {
		super();
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
