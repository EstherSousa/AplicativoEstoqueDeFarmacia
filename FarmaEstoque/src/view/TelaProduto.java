package view;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import control.*;


public class TelaProduto extends JFrame {
	
	private JFrame janela = new JFrame("Produto");

	private ControleFarma controle = new ControleFarma();

	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelQtd = new JLabel("QTD: ");
	private JTextField valorQtd;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelPreco = new JLabel("Preco: ");
	private JTextField valorPreco;
	
	/*private JLabel labelObj = new JLabel("Objetivo: ");
	private JTextField valorObj;
	private JLabel labelTarja = new JLabel("Tarja");
	private JTextField valorTarja;
	private JLabel labelCategoria = new JLabel("Categoria: ");
	private JTextField valorCategoria;
	private JLabel labelParteCorpo = new JLabel("Parte Atuante: ");
	private JTextField valorParteCorpo;*/
	//private static JButton botaoSalvar = new JButton("Salvar");
	//private String[] novoDado = new String[5];
	
	private int i;

	
	public TelaProduto(int i){
		

		this.i = i;
		
		valorNome = new JTextField(controle.farma.getEstoque().get(i).getNome().toString(), 200);
		valorQtd = new JTextField(String.valueOf(controle.farma.getEstoque().get(i).getQtd()), 200);
		valorTipo = new JTextField(controle.farma.getEstoque().get(i).getTipo().toString(), 200);
		valorPreco = new JTextField(String.valueOf(controle.farma.getEstoque().get(i).getPreco()),200);

		

		
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelQtd.setBounds(30, 50, 150, 25);
		valorQtd.setBounds(180, 50, 180, 25);
		labelTipo.setBounds(30, 80, 150, 25);
		valorTipo.setBounds(180, 80, 180, 25);		
		labelPreco.setBounds(30, 110, 150, 25);
		valorPreco.setBounds(180, 110, 180, 25);

		//botaoSalvar.setBounds(120, 175, 115, 30);
		
		janela.add(labelNome);
		janela.add(valorNome);
		janela.add(labelQtd);
		janela.add(valorQtd);
		janela.add(labelTipo);
		janela.add(valorTipo);
		janela.add(labelPreco);
		janela.add(valorPreco);

		//janela.add(botaoSalvar);
		

		
		janela.setLayout(null);
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		
		/*if(controle.farma.getEstoque().get(i).getClass().getSimpleName().equals("Saude")) {
			
			valorObj = new JTextField(controle.farma.getEstoque().get(i).getNome().toString(), 200);
			valorTarja = new JTextField(controle.farma.getEstoque().get(i).getNome().toString(), 200);	
			
			labelObj.setBounds(30, 110, 150, 25);
			valorObj.setBounds(180, 110, 180, 25);
			labelTarja.setBounds(30, 140, 150, 25);
			valorTarja.setBounds(180, 140, 180, 25);
			
			janela.add(labelObj);
			janela.add(valorObj);
			janela.add(labelTarja);
			janela.add(valorTarja);
			
		}
		
		if(controle.farma.getEstoque().get(i).getClass().getSimpleName().equals("Estetica")) {
			
			valorCategoria = new JTextField(controle.farma.getEstoque().get(i).getNome().toString(), 200);
			valorParteCorpo = new JTextField(controle.farma.getEstoque().get(i).getNome().toString(), 200);
			
			labelCategoria.setBounds(30, 110, 150, 25);
			valorCategoria.setBounds(180, 110, 180, 25);
			labelParteCorpo.setBounds(30, 140, 150, 25);
			valorParteCorpo.setBounds(180, 140, 180, 25);
			
			janela.add(labelCategoria);
			janela.add(valorCategoria);
			janela.add(labelParteCorpo);
			janela.add(valorParteCorpo);
			
		}*/
		
		
		
		/*TelaProdutoo.botaoSalvar.addActionListener(botaoAcao -> {
			novoDado[0] =  valorNome.getText();
			novoDado[1] =  valorQtd.getText();
			novoDado[2] =  valorTipo.getText();
			novoDado[3] =  valorPreco.getText();
			
			controle.EditarProduto(novoDado,i);
			
			
			//controle.farma.getEstoque().get(i).setNome(novoDado[0]);
			//controle.farma.getEstoque().get(i).setQtd(novoDado[1]);
			//controle.farma.getEstoque().get(i).setPreco(novoDado[2]);
			//controle.farma.getEstoque().get(i).setObj(novoDado[3]);
			//controle.farma.getEstoque().get(i).setCor(novoDado[4]);
			
		});*/
		


		
		
		
		
		

		
		

	}
	
	

}
