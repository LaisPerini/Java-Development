package br.com.fiap.modelos;

public class CD extends Produto{
	private int totalFaixas;
	private String artista;
	private String genero;

	
	
	public CD(String descricao, double valor, boolean lancamento, Fornecedor fabricante, int totalFaixas,
			String artista, String genero) {
		super(descricao, valor, lancamento, fabricante);
		this.totalFaixas = totalFaixas;
		this.artista = artista;
		this.genero = genero;
	}
	public CD() {
		super();
	}
	public String getAll(){
		return totalFaixas + "\n" + artista + "\n" + genero;
	}
	public void setAll(int totalFaixas, String artista, String genero) {
		this.totalFaixas = totalFaixas;
		this.artista = artista;
		this.genero = genero;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
