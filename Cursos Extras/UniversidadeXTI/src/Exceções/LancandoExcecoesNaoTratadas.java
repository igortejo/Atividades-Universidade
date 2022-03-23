package Exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LancandoExcecoesNaoTratadas {
	
	public static void dividir(Scanner s) 
	throws InputMismatchException, ArithmeticException //sao todas as exceções possiveis de serem lançadas 
	{
		System.out.print("Número: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				dividir(s);
				continua = false;
				
			}
			catch(InputMismatchException e1) {
				System.err.println("Números devem ser inteiros");  //quando coloco letra no lugar de numero, err so muda a cor
				s.nextLine(); //descarta a entrada que deu erro e libera novamente para o usuário
				
			}
			catch(ArithmeticException e2) {
				System.err.println("O divisor deve ser diferente de zero");   // quando divide por zero
				
			}
			finally {
				System.out.println("Finally executado"); //finally sempre é executado, independente das exceções ou se passou direto
			}
		} while(continua); {
			
		}
		
		
		
	}
}
	
