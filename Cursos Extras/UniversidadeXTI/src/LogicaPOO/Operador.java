package LogicaPOO;
import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade = s.nextInt();
		String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		System.out.println(x);
		
	}

}
