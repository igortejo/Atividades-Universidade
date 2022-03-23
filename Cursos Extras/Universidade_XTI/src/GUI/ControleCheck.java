package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	
	/*
	 * tem que declarar fora pra os metodos listener terem acesso
	 */
	
	JCheckBox bold;
	JCheckBox italic;
	JTextField texto;

	public ControleCheck() {
		super();
		Container c = getContentPane();
		
		texto = new JTextField("veja o texto mudar", 12);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());

		
		c.setLayout(new FlowLayout());	
		c.add(bold);
		c.add(italic);
		c.add(texto);
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class CheckListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("Serifada", Font.BOLD | Font.ITALIC,26));
			} else if (bold.isSelected()) {
				texto.setFont(new Font("Serifada", Font.BOLD,26));
			} else if (italic.isSelected()) {
				texto.setFont(new Font("Serifada",Font.ITALIC,26));
			} else {
				texto.setFont(new Font("Serifada",Font.PLAIN,26));
			}
		}
		
	}
	
	public static void main(String[] args) {

		new ControleCheck();
		
	}
	

}

