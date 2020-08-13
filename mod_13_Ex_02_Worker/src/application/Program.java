package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.);
		
		
		
		sc.close();
	}

}
