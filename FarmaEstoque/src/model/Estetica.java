package model;

public class Estetica extends Produto {
	
	private String categoria;
	private String parteCorpo;
	
	public Estetica(String nome, int qtd, String tipo, double preco, String categoria, String parteCorpo) {
		super(nome, qtd, tipo, preco);
		this.categoria = categoria;
		this.parteCorpo = parteCorpo;
	}
	

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getParteCorpo() {
		return parteCorpo;
	}
	public void setParteCorpo(String parteCorpo) {
		this.parteCorpo = parteCorpo;
	}
	
	/*public String toString() {
	return "Nome do produto: " + nome + ", Tipo: " + tipo + ", Quantidade: " + qtd + 
			" Valor: " + preco + ", Sua categoria: " + categoria + ", Para onde serve: " + parteCorpo;
	}*/
	



}
