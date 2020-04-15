package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler os valores da largura e altura
		 * de um retângulo. Em seguida, mostrar na tela o valor de
		 * sua área, perímetro e diagonal.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo;
		
		//Criando o objeto
		retangulo = new Rectangle();
		
		//Inserindo valores dos lados.
		System.out.println("Enter rectangle width and height: ");
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		//Calculando a Area
		double area = retangulo.area();
		double perimetro = retangulo.perimeter();
		double diagonal = retangulo.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimetro);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
				
		sc.close();
	}

}
