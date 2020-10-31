package mod_06_Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		 * peso 5.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		double a, b, c;
		
		for(int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			double mediaPonderada = (a * 2.0 + b * 3.0 + c * 5.0)/10;
			
			System.out.println();
			System.out.printf("%.1f \n", mediaPonderada);
						
		}
		
		sc.close();
		
	}

}
