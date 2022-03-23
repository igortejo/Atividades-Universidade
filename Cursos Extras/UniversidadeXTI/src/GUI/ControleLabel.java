package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {

	public ControleLabel() {
		super("Label");
		
		JLabel simples = new JLabel("Label simples");
		simples.setToolTipText("Meu tooltip"); //ter uma informaçao quando apenas passa o mouse na frase
		
		
		JLabel label = new JLabel("Label simples");
		Font fonte = new Font("serif", 50, 22); 
		label.setFont(fonte);
		label.setForeground(Color.red);
		
		/*
		 * Colocando uma imagem como rotulo com URL
		 */
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/FOTO IGOR TEJO.jpg"));
		JLabel imagem = new JLabel(icon);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples); 
		c.add(label); 
		c.add(imagem); 

		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		
		
	}
	
	public static void main(String[] args) {
		new ControleLabel();

	}

}
