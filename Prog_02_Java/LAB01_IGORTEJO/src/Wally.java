import java.util.Scanner;

public class Wally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] lista = sc.nextLine().split(" ");
			if (lista[0].equals("wally")) {
				System.exit(0);
			}else {
				String saida = "";
				for (int i = lista.length-1; i >= 0; i--) {
					if (lista[i].length() == 5) {
						saida = lista[i];
						break;
			
					}
				}
				if (saida.equals("")) {
					System.out.println("?");
				}else {
					System.out.println(saida);
				}
			}
		}
	}
}
