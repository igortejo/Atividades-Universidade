package atividade_01;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				System.out.println("Digite o nome do produto: ");
				String nomeProduto = sc.nextLine();

				System.out.println("Digite o preço do produto: ");
				double precoProduto = sc.nextDouble();

				System.out.println("Digite a quantidade em estoque: ");
				int quantidadeEstoque = sc.nextInt();

				Produto produto = new Produto(nomeProduto, precoProduto, quantidadeEstoque);

				System.out.println("Dados do produto: " + produto.toString()); // poderia tirar o toString que fica a
																				// mesma coisa
				System.out.println();

				System.out.println("Quantos produtos devem ser adicionados?");
				int adicionados = sc.nextInt();
				produto.addProduto(adicionados);
				System.out.println("Dados do produto atualizado: " + produto);
				System.out.println();

				System.out.println("Quantos produtos devem ser removidos?");
				int removidos = sc.nextInt();
				produto.removeProduto(removidos);
				System.out.println("Dados do produto atualizado: " + produto);

	}

}
