package Exceções;

public class DebugExemplo {

	int resultado;
	String r;

	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;

	}

	public static void main(String[] args) {
		int numero = 16;
		DebugExemplo exemplo = new DebugExemplo();
		int raiz = exemplo.raiz(numero);

		if (raiz == 4) {
			System.out.println("Raiz correta");
		}

	}

}
