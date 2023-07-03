package model;

public class Saude extends Produto {
	
	private String objetivo;
	private String tarja;
	
	
	public Saude(String nome, int qtd, String tipo, double preco, String objetivo, String tarja) {
		super(nome, qtd, tipo, preco);
		this.objetivo = objetivo;
		this.tarja = tarja;
	}
		
	
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getTarja() {
		return tarja;
	}
	public void setTarja(String tarja) {
		this.tarja = tarja;
	}
	
	/*public String toString() {
	return "Nome do Produto: " + nome + ", Tipo: " + tipo + ", Quantidade: " + qtd + 
			" Valor: " + preco + ", Para que ele serve: " + objetivo + ", Sua Tarja: " + tarja;
	}*/
	
	

	
	
	
	

}