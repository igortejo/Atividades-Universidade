package Exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		/**
		 * Coloco dentro do try o codigo que eu quero executar
		 * Se esse codigo tiver algum erro, eu posso capturar esse erro com o catch informando qual o erro
		 */
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				System.out.print("Número: ");
				int a = s.nextInt();
				System.out.print("Divisor: ");
				int b = s.nextInt();
				System.out.println(a/b);
				continua = false;
				
			}
			
			
			catch(InputMismatchException e1) {
				System.err.println("Números devem ser inteiros");  //quando coloco letra no lugar de numero, err so muda a cor
				s.nextLine(); //descarta a entrada que deu erro e libera novamente para o usuário
				
			}
			catch(ArithmeticException e2) {
				//e2.printStackTrace(); printa a pilha de erro encontrado nessa excecao
				//e2.getStackTrace(); recebe um array dos erros identificados
				//e2.getMessage(); retorna uma menssagem com a lista de erros no formato string
				System.err.println("O divisor deve ser diferente de zero");   // quando divide por zero
				
			}
			//catch(InputMismatchException | ArithmeticException e1) { //outra forma de usar catch (mulit catch), trato tudo na mesma linha
			//	System.err.println("Entrada inválida");  
			//	s.nextLine(); 
				
			//}
			finally {
				System.out.println("Finally executado"); //finally sempre é executado, independente das exceções ou se passou direto
			}
		} while(continua); {
			
		}
		
	
		

		
	}

}
