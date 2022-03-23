package LogicaPOO;
import javax.swing.JOptionPane;

/**
 * Calculo de IMC
 * @author igor
 *
 */
public class IMC {

	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Informe seu peso");
		double pesoFinal = Double.parseDouble(peso);
		String altura = JOptionPane.showInputDialog("Informe sua altura");
		double alturaFinal = Double.parseDouble(altura);
		double imc = pesoFinal/(alturaFinal * alturaFinal);
		String msg = (imc >= 20 && imc <= 25) ? "Peso ideal" : "Fora do peso ideal";
		JOptionPane.showMessageDialog(null, imc + "\n" + msg);

	}

}
