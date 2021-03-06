package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declarando vari�vel do tipo product
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of productss to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		//Mostrando dados atualizados
		System.out.println();
		System.out.println("Updated data: " + product);
		
		//Saida no estoque
		System.out.println();
		System.out.print("Enter the number of productss to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		//Mostrando dados atualizados
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
