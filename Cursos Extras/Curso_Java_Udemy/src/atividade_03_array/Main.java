package atividade_03_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Estudante[] vetor = new Estudante[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int quartosAlugados = sc.nextInt();
		
		for(int i = 1; i <= quartosAlugados; i++) {
			System.out.println();

			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome do aluno: ");
			sc.nextLine();          // entender melhor
			String aluno = sc.nextLine();
			System.out.print("Email do aluno: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();

			
			vetor[quarto] = new Estudante(aluno, email);

		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
	}

}
