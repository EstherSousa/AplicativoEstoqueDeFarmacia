package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import control.*;


public class TelaBusca extends JFrame {
	
	private JFrame janela = new JFrame("Buscar");
	private JTextField text = new JTextField();
	private static JButton buscar = new JButton("Buscar");
	private ControleFarma control = new ControleFarma();
	private JLabel resposta = new JLabel("Existe!");


	
	public TelaBusca(){
		


		
		
		text.setBounds(40, 30, 200, 40);
		buscar.setBounds(90, 100, 100, 30);
	

		
		janela.add(buscar);
		janela.add(text);
		janela.add(resposta);
		
		
		janela.setLayout(null);
		janela.setSize(300,200);
		janela.setVisible(true);
		
		
		
		TelaBusca.buscar.addActionListener(botaoAcao -> {
			String nomeProduto = text.getText();
			int num;
			num = control.buscar(nomeProduto);
			if(num >= 0) {
				new TelaProduto(num);
			}else {
				JOptionPane.showMessageDialog(null, 
						"Não Existe este Produto no Estoque\n", null, 
						JOptionPane.INFORMATION_MESSAGE);
			}

		});
		
		
	}

}
