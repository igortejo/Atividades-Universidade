package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesafioCalculadora extends JFrame {

	public DesafioCalculadora() {	
		super("Calculadora");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());  //nao precisaria setar esse layout pq ja é padrao
		
		/*
		 * alterando a fonte do display(espaço que mostra os numeros na calculadora)
		 */
		JTextField display = new JTextField();
		display.setFont(new Font("Serif", Font.PLAIN, 40));
		c.add(BorderLayout.NORTH, display);
		
		
		Container c2 =  new JPanel();
		c2.setLayout(new GridLayout(4,4,5,5));  //linha,coluna,espaçamento,espaçamento
		
		c2.add(new JButton("7"));
		c2.add(new JButton("8"));
		c2.add(new JButton("9"));
		c2.add(new JButton("/"));
		c2.add(new JButton("4"));
		c2.add(new JButton("5"));
		c2.add(new JButton("6"));
		c2.add(new JButton("*"));
		c2.add(new JButton("1"));
		c2.add(new JButton("2"));
		c2.add(new JButton("3"));
		c2.add(new JButton("-"));
		c2.add(new JButton("0"));
		c2.add(new JButton("."));
		c2.add(new JButton("="));
		c2.add(new JButton("+"));
		
		c.add(BorderLayout.CENTER,c2); //adicionando o container c2 ao container principal no centro
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new DesafioCalculadora();
	}

}
