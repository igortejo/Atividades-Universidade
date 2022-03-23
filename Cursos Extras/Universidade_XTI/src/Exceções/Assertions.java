package Exceções;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero entre 0 e 10");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <= 10) : "Número invalido " + numero;
		System.out.println("Voce entrou com o numero " + numero);
		
	}

}
