package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Vetor for n products
		Product[] vect =  new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine(); //consumindo a linha (quebra de linha) do nextInt anterior (n)
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		//soma de todos os valores
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		//media
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.printf("Average price = %.2f%n", avg);
		
		sc.close();
	}

}
