package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	public Layouts() {
		super("Layouts");
		
		
		/*
		 * guardando o container em uma variável e adiconando controles (botoes) a ele	
		 */
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(8,8));  //recebe o espaçamento entre os botoes como paramentro
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));  
		
		
		/*
		 * Definindo outro layout
		 */
		
		//c.setLayout(new FlowLayout());
		//c.add(new JButton("1"));
		//c.add(new JButton("2"));

		
		getContentPane().add(new JButton("1")); //por default o botao é colocado do centro

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new Layouts();
		
	}

}
