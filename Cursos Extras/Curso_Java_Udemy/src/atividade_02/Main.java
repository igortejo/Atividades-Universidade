package atividade_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContaBancaria conta1;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("is there an initial deposit? ");
		char teveDeposito = sc.next().charAt(0);
		
			   
		if (teveDeposito == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta1 = new ContaBancaria(conta, titular, depositoInicial);
			
		}else {
			conta1 = new ContaBancaria(conta, titular);
		}
		
		System.out.println();
		System.out.println("Account data: " + conta1);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		
		double deposito = sc.nextDouble();
		conta1.depositar(deposito);
		System.out.println();

		System.out.println("Update account value: " + conta1);
		System.out.println();

		System.out.print("Enter a withdraw value: ");

		double saque = sc.nextDouble();
		conta1.sacar(saque);
		System.out.println("Update account value: " + conta1);

		
		
		
	}

}
