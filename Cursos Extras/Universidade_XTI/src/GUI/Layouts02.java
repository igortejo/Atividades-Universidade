package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts02 extends JFrame{

	
	public Layouts02() {
		super("Layouts"); //nome da janela
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());  

		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1)); //recebe o numero de linhas e colunas como parametro
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Center"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new Layouts02();
		
	}

}
