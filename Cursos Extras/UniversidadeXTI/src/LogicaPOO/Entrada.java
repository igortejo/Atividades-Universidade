package LogicaPOO;
import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, nome);
		JOptionPane.showConfirmDialog(null, "È voce?");
		
		
	}

}
