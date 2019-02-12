package beans;

public class Cliente {
	private String nome;
	private int numero;
	private int qtdeEstrelas;
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, int numero, int qtdeEstrelas) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.qtdeEstrelas = qtdeEstrelas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdeEstrelas() {
		return qtdeEstrelas;
	}
	public void setQtdeEstrelas(int qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}
}

