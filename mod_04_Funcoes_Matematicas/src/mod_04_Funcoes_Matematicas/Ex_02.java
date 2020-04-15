package mod_04_Funcoes_Matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
		 * círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2
		 * Considere o valor de π = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, A, pi = 3.14159;
		raio = sc.nextDouble();
		
		A = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f\n", A);
		
		sc.close();
	}

}
