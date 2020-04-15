package mod_06_Estruturas_Repetitivas;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de x: ");
		int x = sc.nextInt();
		System.out.println("Informe o valor de y: ");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else{
				System.out.println("quarto");
			}
			
			System.out.println();
			System.out.println("Informe o valor de x: ");
			x = sc.nextInt();
			System.out.println("Informe o valor de y: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
