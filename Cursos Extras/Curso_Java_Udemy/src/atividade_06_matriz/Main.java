package atividade_06_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Qual número você quer saber? ");
		
		int escolhido = sc.nextInt();
		
		for(int i = 0; i < linhas; i++) {
			System.out.println();
			for(int j = 0; j < colunas; j++) {
				if(mat[i][j] == escolhido) {
					System.out.println("Posição " + i + ", " + j + ":");
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if(i < mat.length - 1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
	}

}
