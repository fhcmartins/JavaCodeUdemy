package mod_05_Estrutura_Condicional;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
		 * digitados em ordem crescente ou decrescente
		 */
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		//recebendo os valores de a e b
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
				
		sc.close();
	}

}
