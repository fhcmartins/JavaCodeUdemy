package mod_04_Entrada_Dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuracao para ficar ja com pontuacao US
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		//Inserindo uma String
		String x;
		x = sc.next();
		System.out.println("Imprimindo uma String");
		System.out.println("Voce digitou: " + x);
		
		//Inserindo valor INTEIRO
		int y;
		y = sc.nextInt();
		System.out.println("Imprimindo um valor Inteiro");
		System.out.println("O valor digitado foi " + y);
		
			
		//Lendo valor com ponto flutuante (separador por ponto)
		double z;
		z = sc.nextDouble();
		System.out.println("Separacao por PONTO");
		System.out.println("Você digitou: " + z);
		*/
		
		//Lendo valor com ponto flutuante (separador por virgula)
		//w = sc.nextDouble();
		//System.out.println("Separacao por VIRGULA");
		//System.out.printf("Você digitou: %.2f%n", w);
		
		//Imprimindo CHAR com 01 caractere
		/*
		 * char x;
		 * x = sc.next().charAt(0);
		 * System.out.println("Você digitou: " + x);
		
		 */
		
		//Lendo varios dados na mesma linha separados por espaco
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	
	}
}