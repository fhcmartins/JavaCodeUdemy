package mod_06_Estruturas_Repetitivas;

import java.util.Scanner;

public class Ex_04_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre
		 * os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.
		 */
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
