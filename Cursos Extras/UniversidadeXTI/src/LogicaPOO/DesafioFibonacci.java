package LogicaPOO;
import java.util.ArrayList;

public class DesafioFibonacci {

	public static void main(String[] args) {

		int primeiro = 0;
		int segundo = 1;
		int soma = primeiro + segundo;

		
		ArrayList<Integer> fibo = new ArrayList<>();
		fibo.add(primeiro);
		fibo.add(segundo);

		
		while(soma < 50) {
			
			fibo.add(soma);
			

		}
	}

}
