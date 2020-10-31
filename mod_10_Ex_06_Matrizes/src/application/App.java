package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz de
		 * ordem N contendo números inteiros. Em seguida, mostrar a diagonal
		 * principal e a quantidade de valores negativos da matriz.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Criando matrize bidimensional
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Diagonal principal
		System.out.println();
		System.out.println("Main Diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		//Qtde de numeros impares
		System.out.println();
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}
