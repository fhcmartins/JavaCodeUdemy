package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		// Declarando variável do tipo product
		Product product = new Product(name, price, quantity);

		System.out.println();
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of productss to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		// Mostrando dados atualizados
		System.out.println();
		System.out.println("Updated data: " + product);

		// Saida no estoque
		System.out.println();
		System.out.print("Enter the number of productss to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		// Mostrando dados atualizados
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}

