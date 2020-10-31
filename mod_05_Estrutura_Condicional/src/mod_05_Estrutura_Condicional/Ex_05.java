package mod_05_Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 * 		Cod		Especificacao		Preco
		 * 		1		Cachorro Quente		R$ 4.00
		 * 		2		X-Salada			R$ 4.50
		 * 		3		X-Bacon				R$ 5.00
		 * 		4		Torrada Simples		R$ 2.00
		 * 		5		Refrigerante		R$ 1.50
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int cod, qtde;
		double total;
		
		//informando os valores
		System.out.print("Cod. do produto: ");
		cod = sc.nextInt();
		System.out.println();
		System.out.print("Qtde do produto: ");
		qtde = sc.nextInt();
		
		if(cod == 1) {
			total = qtde * 4.00;
		}
		else if(cod == 2) {
			total = qtde * 4.50;
		}
		else if(cod == 3) {
			total = qtde * 5.00;
		}
		else if(cod == 4) {
			total = qtde * 2.00;
		}
		else {
			total = qtde * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f \n", total);
		
		
		sc.close();
	}

}
