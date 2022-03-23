package LogicaPOO;
import java.util.Random;
import java.util.Scanner;

public class DesafioDado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Qual o seu palpite?");
		int palpite = s.nextInt();
		
		int resultadoDado = r.nextInt(6)+1;
		System.out.println(resultadoDado);
		
		if (palpite == resultadoDado) {
			System.out.println("acertou");
		
		}else {
			System.out.println("errou");
		}
	}

}
