package mod_04_Funcoes_Matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto
		 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("Diferenca = %d", diferenca);
		
		sc.close();
	}

}
