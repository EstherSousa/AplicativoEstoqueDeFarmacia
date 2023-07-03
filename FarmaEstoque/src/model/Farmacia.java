package model;
import java.util.*;


import control.ControleFarma;

public class Farmacia {
	
	private int qtd;
	private ArrayList<Produto> estoque;
	
	public Farmacia(int qtd) {
		super();
		this.estoque = new ArrayList<Produto>();
		this.qtd = qtd;
		this.criarEstoque();
	}
	
	
	private void criarEstoque() {
		Saude produto1 = new Saude("Ibuprofeno", 50, "Saude", 15.0, "Dor Geral", "Amarela");
		Saude produto2 = new Saude("Nelsadina", 60, "Saude", 12.50, "Dor de Cabeca", "Branca");
		Saude produx1 = new Saude ("Cotonete", 25, "Beleza", 10.0, "Higiene", "Cabeca");
		Saude produx2 = new Saude ("Xuxa", 7, "Beleza", 3.0, "Estetica", "Cabeca");
		Saude produto3 = new Saude ("Poumada", 30, "Saude", 10.50, "Alergia a pele", "Branca");
		Saude produx3 = new Saude ("Escova de Cabelo", 6, "Beleza", 5.0, "Estetica", "Cabeca");
		Saude produx4 = new Saude ("Esmalte", 20, "Beleza", 7.0, "Estetica", "Maos");
		
		adicionar(produto1);
		adicionar(produto2);
		adicionar(produx1);
		adicionar(produx2);
		adicionar(produx3);
		adicionar(produx4);
		adicionar(produto3);
		
		qtd = 4;
	}


	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public ArrayList<Produto> getEstoque() {
		return estoque;
	}
	public void setEstoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}
	
	
	public void acrescentar(String n, int x) {
		qtd = estoque.size();
		for(int i = 0; i<qtd; i++) {
			if(estoque.get(i).getNome().equals(n)) {
				estoque.get(i).qtd = estoque.get(i).qtd + x;
				i=qtd;
			}
		}
	
	}

	public void retirar(String n, int x) {
		qtd = estoque.size();
		for(int i = 0; i<qtd; i++) {
			if(estoque.get(i).getNome().equals(n)) {
				estoque.get(i).qtd = estoque.get(i).qtd - x;
				i=qtd;
			}
		}
	}

	public void adicionar(Produto p){
		//qtd = estoque.size();
		//estoque(qtd) = p;
		//qtd++;
		estoque.add(p);
	}

	/*public void deletar(String n) {
		qtd = estoque.size();
		for(int i = 0; i<qtd; i++) {
			if(estoque.get(i).getNome().equals(n)) {
				estoque.get(i).remove;
				i=qtd;
				qtd--;
			}
		}
	}*/


	public void listar() {
		for(int i = 0; i<estoque.size(); i++) {
			System.out.println(estoque.get(i).getNome().toString());
		}
	}

	public void buscar(String n) {
		qtd = estoque.size();
		for(int i = 0; i<qtd; i++) {
			if(estoque.get(i).getNome().equals(n)) {
				System.out.println(estoque.get(i).getNome().toString());
				i=qtd;
			}
		}
	}
	
	


	
	/*public String toString() {
	return "Produto: " + estoque + ", Quantidade: " + qtd;
	}*/
	
	
	

}