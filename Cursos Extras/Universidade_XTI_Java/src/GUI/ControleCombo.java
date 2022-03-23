package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/01.png")),
			new ImageIcon(getClass().getResource("fotos/02.jpeg")),
			new ImageIcon(getClass().getResource("fotos/03.jpeg")),
			};
	
	
	public ControleCombo() {
		super("Albúm de fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Logo Preta");
		combo.addItem("Logo Branca");
		combo.addItem("Academia");
		combo.addItemListener(this);   //vinculando ao evento, como quem implementou o metodo listner foi essa classe, fica this
		
		label = new JLabel(imagens[0]);
		label = new JLabel(imagens[1]);
		label = new JLabel(imagens[2]);


		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ControleCombo();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}

}
