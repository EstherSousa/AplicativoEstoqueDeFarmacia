package view;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleFarma;


public class TelaMenu implements ActionListener, ListSelectionListener {
	
	private JFrame janela = new JFrame("Farmacia Melhor");
	private JLabel titulo = new JLabel("Estoque");
	private static JButton busca = new JButton("Buscar");
	//private static JButton cadastro = new JButton("Cadastrar");
	private static JList <String> item;
	private static String[] listaNomes = new String[50];
	private ControleFarma control = new ControleFarma();


	 
	public TelaMenu() {

		listaNomes = control.getNomeProduto();

		item = new JList<String>(listaNomes);
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 30, 150, 30);
		busca.setBounds(50, 400, 100, 30);
		//cadastro.setBounds(230, 400, 100, 30);
		item.setBounds(50, 80, 280, 300);
		item.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		item.setVisibleRowCount(10);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(busca);
		janela.add(item);
		//janela.add(cadastro);
		
		janela.setSize(400, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		
		busca.addActionListener(menu);
		item.addListSelectionListener(menu);
		//cadastro.addActionListener(menu);
		
		
		//new TelaMenu();
		/*TelaMenu.cadastro.addActionListener(botaoAcao -> {
			var a = new TelaProduto();
		});
		
		TelaMenu.busca.addActionListener(botaoAcao -> {
			var b = new TelaBusca();
		});*/
		
		/*item.addListSelectionListener(j ->{
			int index = item.getSelectedIndex();
			var c = new TelaProdutoo(index);
			
		});*/

		

		
	}


	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == item) {
			int index = item.getSelectedIndex();
			new TelaProduto(index);
		}
		
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == busca)
			new TelaBusca();
		
	
		//if(src == cadastro)
			//new TelaProduto();

		


	}

}
