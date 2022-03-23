package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	
	JButton botao;
	
	public Eventos() {
		
		super("Eventos"); //nome da janela
		
		botao = new JButton("Clique Aqui");
		
		/*
		 * metodo espera um objeto que implementa a interface ActionListener
		 * voce pode criar outra classe que implementa essa interface ou essa propria classe pode implementar
		 */ 
		botao.addActionListener(this);  //usa o this quando a propria classe implementa a interface ActionListener
		getContentPane().add(botao);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		botao.setText("Foi clicado");
	}

	public static void main(String[] args) {

		new Eventos();
	}

	

	

}
