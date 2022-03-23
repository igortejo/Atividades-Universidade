import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		int soma = 0;
		for (int i = 0; i < lista.length; i++){
			soma += Integer.parseInt(lista[i]);
		}
		int media = soma/lista.length;
		for (int i = 0; i < lista.length; i++){
			if (Integer.parseInt(lista[i]) > media) {
				System.out.print(lista[i] + " ");
			}
		}
	}

}
