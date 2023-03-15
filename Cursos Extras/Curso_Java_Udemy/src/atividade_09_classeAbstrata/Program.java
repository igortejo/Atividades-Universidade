package atividade_09_classeAbstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int numeroPessoas = sc.nextInt();
		
		for (int i = 1; i <= numeroPessoas; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Física ou Jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
				
			
		}
		System.out.println();
		System.out.println("Taxas pagas: ");
		double soma = 0;
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
			soma += pessoa.taxaImposto();
		}
		
		System.out.print("Taxa Total Paga: " + soma);
		
	}

}
