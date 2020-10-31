package mod_06_Estruturas_Repetitivas;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		
		int cod = sc.nextInt();
		int A = 0, G = 0, D = 0;
		
		while(cod != 4) {
			switch(cod) {
				case 1:
					A += 1;
					break;
				
				case 2:
					G += 1;
					break;
				
				case 3:
					D += 1;
					break;
				
				case 4:
					break;
				
				default:
					System.out.println("Código Inválido. Digite novamente");
			}
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Álcool: %d%n", A);
		System.out.printf("Gasolina: %d%n", G);
		System.out.printf("Diesel: %d%n", D);
		
		sc.close();		
	}

}
