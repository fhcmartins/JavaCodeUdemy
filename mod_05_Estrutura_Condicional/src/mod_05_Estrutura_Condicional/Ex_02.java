package mod_05_Estrutura_Condicional;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		 */
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
