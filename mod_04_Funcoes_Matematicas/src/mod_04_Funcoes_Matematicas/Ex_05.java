package mod_04_Funcoes_Matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
		 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2
		 * e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2;
		float numPecas1, numPecas2, vpc1, vpc2, tot1, tot2, soma;
		
		codPeca1 = sc.nextInt();
		numPecas1 = sc.nextFloat();
		vpc1 = sc.nextFloat();
		codPeca2 = sc.nextInt();
		numPecas2 = sc.nextFloat();
		vpc2 = sc.nextFloat();
		
		tot1 = numPecas1 * vpc1;
		tot2 = numPecas2 * vpc2;
		
		soma = tot1 + tot2;
		
		System.out.printf("Valor a pagar: R$ %.2f", soma);			
		
		sc.close();
	}

}
