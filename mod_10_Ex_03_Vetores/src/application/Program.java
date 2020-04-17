package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Iniciando vetor para 10 quartos
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented: ");
		sc.nextLine();
		n = sc.nextInt();
		
		for(int i = 1; i <= 3; i++) {
			//Recebendo nome e email
			String name = sc.nextLine();
			String email = sc.nextLine();
			
			vect[i] = new Rent(name, email);
		}
		
		
		
		sc.close();
	}

}
