package applicaton;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
		 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
		 * sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
		 * afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
		 * projetada abaixo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criando um objeto EMPREGADO
		Employee emp = new Employee();
		
		//Inseriondo valores
		System.out.printf("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + emp);
		System.out.println();
		System.out.print("which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + emp);		
		
		sc.close();
	}

}
