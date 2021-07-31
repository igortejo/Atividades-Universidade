import java.util.Scanner;

public class Calculadora {

	public static double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	public static double subtracao(double valor1, double valor2) {
		return valor1 - valor2;
	}
	public static double multiplicacao(double valor1, double valor2) {
		return valor1 * valor2;
	}
	public static double divisao(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacao = sc.nextLine();
		if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
			System.out.println("ENTRADA INVALIDA");
			System.exit(0);
		}
		double primeiro = sc.nextFloat();
		double segundo = sc.nextFloat();
		if(segundo == 0 && operacao.equals("/")) {
			System.out.println("ERRO");
		}else if(operacao.equals("+")) {
			System.out.println("RESULTADO: " + soma(primeiro,segundo));
		}else if(operacao.equals("-")) {
			System.out.println("RESULTADO: " + subtracao(primeiro,segundo));
		}else if(operacao.equals("*")) {
			System.out.println("RESULTADO: " + multiplicacao(primeiro,segundo));
		}else if(operacao.equals("/")) {
			System.out.println("RESULTADO: " + divisao(primeiro,segundo));

		}
	}

}