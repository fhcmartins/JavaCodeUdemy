package mod_04_Funcoes_Matematicas;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();		
	}

}
