package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa para ler as medidas dos lados de doi triangulos X e Y (suponha
		 * medidas validas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer
		 * qual dos dois triagulos possui a maior area.
		 * A formula para calcular a area de um triangulo a partir das medidas de seu lados
		 * a, b, c é a seguinte:
		 * area = rais quadrada(p(p - a) * (p - b) * (p - c)) onde p = (a + b + c)/2
		 */
		
		// SEM ORIENTACAO A OBJETOS
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Ctlr + shift + o importam a classe do pacote entities.
		Triangle x, y;
		
		//criando o objeto
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//calculando a area
		double areaX = x.area(); //chamei o metodo area() na entidade Triangle
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X.");
		}
		else {
			System.out.println("Larger area Y.");
		}
		
		/*
		double xA, xB, xC, yA, yB, yC;
		
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X.");
		}
		else {
			System.out.println("Larger area Y.");
		}
		*/
		
		sc.close();
	}

}
