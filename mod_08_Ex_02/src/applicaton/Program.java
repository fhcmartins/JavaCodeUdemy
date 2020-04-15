package applicaton;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
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
