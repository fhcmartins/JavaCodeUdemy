package mod_04_Funcoes_Matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
		 * mostre:
		 * 		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		 * 		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		 * 		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * 		d) a �rea do quadrado que tem lado B.
		 *		e) a �rea do ret�ngulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		//Inserindo valores
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		areaTrianguloRetangulo = (a*c)/2; //(base * altura) / 2
		areaCirculo = (float) (pi * Math.pow(c, 2)); //pi * r^2;
		areaTrapezio = ((a + b)/2) * c;
		areaQuadrado =  4 * b;
		areaRetangulo = a * b;
		
		System.out.printf("Triangulo: %.3f \n", areaTrianguloRetangulo);
		System.out.printf("Circulo: %.3f \n", areaCirculo);
		System.out.printf("Trapezio: %.3f \n", areaTrapezio);
		System.out.printf("Quadrado: %.3f \n", areaQuadrado);
		System.out.printf("Retangulo: %.3f \n", areaRetangulo);
		
		sc.close();
	}

}
