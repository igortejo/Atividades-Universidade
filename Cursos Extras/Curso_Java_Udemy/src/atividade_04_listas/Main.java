package atividade_04_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados? ");
		int numeroFuncionarios = sc.nextInt();

		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);

		}
		System.out.println();
		System.out.print("Digite a Id do funcinario que vai ter seu salário aumentado: ");
		int funcionarioEscolhido = sc.nextInt();
		

		Integer pos = position(lista, funcionarioEscolhido);
		if (pos == null) {
			System.out.println("Id inválida");
		} else {
			System.out.print("Quantos porcento de aumento? ");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentoSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista da funcionarios: ");

		for (Funcionario func : lista) {
			System.out.println(func);
		}

	}

	public static Integer position(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
