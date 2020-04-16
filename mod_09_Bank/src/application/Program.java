package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter acount holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		sc.nextLine();
				
		//Condição para ocorrer ou nao o deposito
		if(response == 'y') {
			System.out.print("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		//Imprimindo dados
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		//Realizando depósito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		//Realizando Saque
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);		
		
		sc.close();
	}

}
