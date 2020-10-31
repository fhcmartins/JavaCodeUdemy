package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faca um programa para ler a cotação do dolar, e depois um valor em dolares a ser comprado por
		 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda
		 * que a pessoa tera que pagar 6% de IOF sobre o valor em dolar. Cria uma classe CurrencyConverter
		 * para ser responsavel pelos calculos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currency = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		currency.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currency.quantity = sc.nextDouble();
		System.out.print(currency);
				
		sc.close();
	}

}
