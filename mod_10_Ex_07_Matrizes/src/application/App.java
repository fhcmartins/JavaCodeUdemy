package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler
		 * uma matriz de M linhas por N colunas contendo números inteiros,
		 * podendo haver repetições. Em seguida, ler um número inteiro X que
		 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
		 * esquerda, acima, à direita e abaixo de X, quando houver, conforme
		 * exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas? ");
		int n = sc.nextInt();
		System.out.println();
		
		// Criando a matriz
		int[][] mat = new int[m][n];
		
		// povoando a matriz
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Informe um valor da matriz: ");
		int valor = sc.nextInt();
		
		// Procurando valor na matriz
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[1].length; j++) {
				if(mat[i][j] == valor) {
					System.out.println("Position " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
