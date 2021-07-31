import java.util.Scanner;

public class NotaProva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int menor = 1001;
		int soma = 0;
		int cont = 0;
		int media = 0;
		int acima = 0;
		int abaixo = 0;
		while (true) {
			String[] lista = sc.nextLine().split(" ");
			if (lista[0].equals("-")) {
				break;
			}
			int numero = Integer.parseInt(lista[1]);
			soma += numero;
			cont += 1;
			if (numero >= 700) {
				acima += 1;
			}if (numero < 700) {
				abaixo +=1;
			}if (numero > maior) {
				maior = numero;
			}if (numero < menor) {
				menor = numero;
			}
		}media = soma/cont;
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);
	}

}
