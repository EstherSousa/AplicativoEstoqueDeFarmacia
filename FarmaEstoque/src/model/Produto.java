package model;

public abstract class Produto {
	
	protected String nome;
	protected int qtd;
	protected String tipo;
	protected double preco;
	
	public Produto(String nome, int qtd, String tipo, double preco) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.tipo = tipo;
		this.preco = preco;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

	
}