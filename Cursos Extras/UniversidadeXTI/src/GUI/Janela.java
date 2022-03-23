package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		JButton botao = new JButton("CLIQUE");
		getContentPane().add(botao);  //adicionando controles(textos, botoes, imagens) ao container daquela janela
		
	}
	public static void main(String[] args) {
		new Janela();	
		
	}

}
