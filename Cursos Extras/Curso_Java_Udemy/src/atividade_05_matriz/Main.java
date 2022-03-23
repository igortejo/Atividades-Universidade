package atividade_05_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int tamanhoMatriz = sc.nextInt();
		int[][] mat = new int[tamanhoMatriz][tamanhoMatriz];
		
		for(int i = 0; i < tamanhoMatriz; i++) {
			for(int j = 0; j < tamanhoMatriz; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		
		for(int i = 0; i < tamanhoMatriz; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		for(int i = 0; i < tamanhoMatriz; i++) {
			for(int j = 0; j < tamanhoMatriz; j++) {
				if(mat[i][j] < 0) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.print("Números negativos = " + count);
		
	}

}
