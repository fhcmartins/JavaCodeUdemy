package mod_04_Funcoes_Matematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas,
		 * o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o
		 * n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int mat, ht; //mat = matricula, ht = horas trabalhadas
		float valor, salario;
		
		//iniciando as variaveis
		mat = sc.nextInt();
		ht = sc.nextInt();
		valor = sc.nextFloat();
		
		salario = ht * valor;
		
		System.out.println("Number = " + mat);
		System.out.printf("Salary = U$ %.2f", salario);		
		
		sc.close();
	}

}
