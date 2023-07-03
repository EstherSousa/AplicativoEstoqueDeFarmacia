package control;

import java.util.ArrayList;



import model.Farmacia;
import model.Produto;
import model.Saude;



public class ControleFarma {
	public Farmacia farma = new Farmacia(0);
	private int qtd;
	
	public ControleFarma() {
		super();
	}

	
	public void acrescentar(String n, int x) {
		qtd = farma.getEstoque().size();
		for(int i = 0; i<qtd; i++) {
			if(farma.getEstoque().get(i).getNome().equals(n)) {
				qtd = qtd + x;
				i=qtd;
			}
		}
	
	}

	public void retirar(String n, int x) {
		qtd = farma.getEstoque().size();
		for(int i = 0; i<qtd; i++) {
			if(farma.getEstoque().get(i).getNome().equals(n)) {
				qtd = qtd - x;
				i=qtd;
			}
		}
	}

	public void adicionar(Produto p) {
		farma.getEstoque().add(p);
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
		for(int i = 0; i<farma.getEstoque().size(); i++) {
			System.out.println(farma.getEstoque().get(i).getNome().toString());
		}
	}

	public int buscar(String n) {
		int resp = -1;
		qtd = farma.getEstoque().size();
		for(int i = 0; i<qtd; i++) {
			if(farma.getEstoque().get(i).getNome().equals(n)) {
				resp = i;
				i=qtd;
			}
		}
		return resp;
	}
	

	
	public String[] getNomeProduto() {
		String[] nomes = new String[farma.getEstoque().size()];
		for(int i = 0; i < farma.getEstoque().size(); i++) {
			nomes[i] = farma.getEstoque().get(i).getNome();
		}
		
		return nomes;
	}
	
	/*public void EditarProduto(String[] dados, int k) {
				Saude a = new Saude(dados[0], Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]),dados[0], dados[0]);
				farma.getEstoque().set(k, a);
		}*/




}